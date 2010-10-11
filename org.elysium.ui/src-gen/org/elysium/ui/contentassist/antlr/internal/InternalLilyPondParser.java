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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "KEYWORD_87", "KEYWORD_85", "KEYWORD_86", "KEYWORD_83", "KEYWORD_84", "KEYWORD_80", "KEYWORD_81", "KEYWORD_82", "KEYWORD_78", "KEYWORD_79", "KEYWORD_73", "KEYWORD_74", "KEYWORD_75", "KEYWORD_76", "KEYWORD_77", "KEYWORD_65", "KEYWORD_66", "KEYWORD_67", "KEYWORD_68", "KEYWORD_69", "KEYWORD_70", "KEYWORD_71", "KEYWORD_72", "KEYWORD_58", "KEYWORD_59", "KEYWORD_60", "KEYWORD_61", "KEYWORD_62", "KEYWORD_63", "KEYWORD_64", "KEYWORD_47", "KEYWORD_48", "KEYWORD_49", "KEYWORD_50", "KEYWORD_51", "KEYWORD_52", "KEYWORD_53", "KEYWORD_54", "KEYWORD_55", "KEYWORD_56", "KEYWORD_57", "KEYWORD_40", "KEYWORD_41", "KEYWORD_42", "KEYWORD_43", "KEYWORD_44", "KEYWORD_45", "KEYWORD_46", "KEYWORD_30", "KEYWORD_31", "KEYWORD_32", "KEYWORD_33", "KEYWORD_34", "KEYWORD_35", "KEYWORD_36", "KEYWORD_37", "KEYWORD_38", "KEYWORD_39", "KEYWORD_27", "KEYWORD_28", "KEYWORD_29", "KEYWORD_20", "KEYWORD_21", "KEYWORD_22", "KEYWORD_23", "KEYWORD_24", "KEYWORD_25", "KEYWORD_26", "KEYWORD_1", "KEYWORD_2", "KEYWORD_3", "KEYWORD_4", "KEYWORD_5", "KEYWORD_6", "KEYWORD_7", "KEYWORD_8", "KEYWORD_9", "KEYWORD_10", "KEYWORD_11", "KEYWORD_12", "KEYWORD_13", "KEYWORD_14", "KEYWORD_15", "KEYWORD_16", "KEYWORD_17", "KEYWORD_18", "KEYWORD_19", "RULE_STRING", "RULE_INT", "RULE_ID", "RULE_WS", "RULE_SL_COMMENT", "RULE_ML_COMMENT", "RULE_SCHEME_SL_COMMENT", "RULE_SCHEME_ML_COMMENT", "RULE_ANY_OTHER", "Tokens"
    };
    public static final int RULE_ID=93;
    public static final int RULE_SCHEME_SL_COMMENT=97;
    public static final int RULE_ANY_OTHER=99;
    public static final int KEYWORD_56=43;
    public static final int KEYWORD_55=42;
    public static final int KEYWORD_54=41;
    public static final int KEYWORD_53=40;
    public static final int KEYWORD_52=39;
    public static final int KEYWORD_51=38;
    public static final int KEYWORD_50=37;
    public static final int EOF=-1;
    public static final int KEYWORD_59=28;
    public static final int KEYWORD_58=27;
    public static final int KEYWORD_57=44;
    public static final int KEYWORD_65=19;
    public static final int RULE_SCHEME_ML_COMMENT=98;
    public static final int KEYWORD_64=33;
    public static final int KEYWORD_67=21;
    public static final int KEYWORD_66=20;
    public static final int KEYWORD_61=30;
    public static final int KEYWORD_60=29;
    public static final int KEYWORD_63=32;
    public static final int KEYWORD_62=31;
    public static final int KEYWORD_69=23;
    public static final int KEYWORD_68=22;
    public static final int KEYWORD_30=52;
    public static final int KEYWORD_34=56;
    public static final int KEYWORD_33=55;
    public static final int KEYWORD_32=54;
    public static final int KEYWORD_31=53;
    public static final int KEYWORD_38=60;
    public static final int KEYWORD_37=59;
    public static final int KEYWORD_36=58;
    public static final int KEYWORD_35=57;
    public static final int RULE_ML_COMMENT=96;
    public static final int KEYWORD_39=61;
    public static final int RULE_STRING=91;
    public static final int KEYWORD_41=46;
    public static final int KEYWORD_40=45;
    public static final int KEYWORD_43=48;
    public static final int KEYWORD_42=47;
    public static final int KEYWORD_45=50;
    public static final int KEYWORD_44=49;
    public static final int KEYWORD_47=34;
    public static final int KEYWORD_46=51;
    public static final int KEYWORD_49=36;
    public static final int KEYWORD_48=35;
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
    public static final int KEYWORD_28=63;
    public static final int KEYWORD_29=64;
    public static final int RULE_INT=92;
    public static final int KEYWORD_24=69;
    public static final int KEYWORD_25=70;
    public static final int KEYWORD_26=71;
    public static final int KEYWORD_27=62;
    public static final int KEYWORD_20=65;
    public static final int KEYWORD_21=66;
    public static final int KEYWORD_22=67;
    public static final int KEYWORD_23=68;
    public static final int KEYWORD_79=13;
    public static final int KEYWORD_71=25;
    public static final int KEYWORD_72=26;
    public static final int KEYWORD_73=14;
    public static final int KEYWORD_74=15;
    public static final int KEYWORD_75=16;
    public static final int KEYWORD_76=17;
    public static final int KEYWORD_77=18;
    public static final int KEYWORD_78=12;
    public static final int KEYWORD_1=72;
    public static final int KEYWORD_5=76;
    public static final int KEYWORD_4=75;
    public static final int KEYWORD_70=24;
    public static final int KEYWORD_3=74;
    public static final int KEYWORD_2=73;
    public static final int Tokens=100;
    public static final int RULE_SL_COMMENT=95;
    public static final int KEYWORD_84=8;
    public static final int KEYWORD_85=5;
    public static final int KEYWORD_82=11;
    public static final int KEYWORD_83=7;
    public static final int KEYWORD_86=6;
    public static final int KEYWORD_87=4;
    public static final int KEYWORD_81=10;
    public static final int KEYWORD_80=9;
    public static final int RULE_WS=94;

        public InternalLilyPondParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[404+1];
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
    		tokenNameToValue.put("KEYWORD_9", "':'");
    		tokenNameToValue.put("KEYWORD_10", "'<'");
    		tokenNameToValue.put("KEYWORD_11", "'='");
    		tokenNameToValue.put("KEYWORD_12", "'>'");
    		tokenNameToValue.put("KEYWORD_13", "'['");
    		tokenNameToValue.put("KEYWORD_14", "'\\'");
    		tokenNameToValue.put("KEYWORD_15", "']'");
    		tokenNameToValue.put("KEYWORD_16", "'`'");
    		tokenNameToValue.put("KEYWORD_17", "'{'");
    		tokenNameToValue.put("KEYWORD_18", "'}'");
    		tokenNameToValue.put("KEYWORD_19", "'~'");
    		tokenNameToValue.put("KEYWORD_20", "'#:'");
    		tokenNameToValue.put("KEYWORD_21", "'#\\'");
    		tokenNameToValue.put("KEYWORD_22", "'#{'");
    		tokenNameToValue.put("KEYWORD_23", "'#}'");
    		tokenNameToValue.put("KEYWORD_24", "'<<'");
    		tokenNameToValue.put("KEYWORD_25", "'>>'");
    		tokenNameToValue.put("KEYWORD_26", "'\\\\'");
    		tokenNameToValue.put("KEYWORD_27", "'key'");
    		tokenNameToValue.put("KEYWORD_28", "'new'");
    		tokenNameToValue.put("KEYWORD_29", "'set'");
    		tokenNameToValue.put("KEYWORD_30", "'book'");
    		tokenNameToValue.put("KEYWORD_31", "'mark'");
    		tokenNameToValue.put("KEYWORD_32", "'midi'");
    		tokenNameToValue.put("KEYWORD_33", "'name'");
    		tokenNameToValue.put("KEYWORD_34", "'once'");
    		tokenNameToValue.put("KEYWORD_35", "'rest'");
    		tokenNameToValue.put("KEYWORD_36", "'skip'");
    		tokenNameToValue.put("KEYWORD_37", "'time'");
    		tokenNameToValue.put("KEYWORD_38", "'type'");
    		tokenNameToValue.put("KEYWORD_39", "'with'");
    		tokenNameToValue.put("KEYWORD_40", "'alias'");
    		tokenNameToValue.put("KEYWORD_41", "'drums'");
    		tokenNameToValue.put("KEYWORD_42", "'paper'");
    		tokenNameToValue.put("KEYWORD_43", "'score'");
    		tokenNameToValue.put("KEYWORD_44", "'tempo'");
    		tokenNameToValue.put("KEYWORD_45", "'times'");
    		tokenNameToValue.put("KEYWORD_46", "'unset'");
    		tokenNameToValue.put("KEYWORD_47", "'change'");
    		tokenNameToValue.put("KEYWORD_48", "'chords'");
    		tokenNameToValue.put("KEYWORD_49", "'denies'");
    		tokenNameToValue.put("KEYWORD_50", "'header'");
    		tokenNameToValue.put("KEYWORD_51", "'layout'");
    		tokenNameToValue.put("KEYWORD_52", "'lyrics'");
    		tokenNameToValue.put("KEYWORD_53", "'markup'");
    		tokenNameToValue.put("KEYWORD_54", "'octave'");
    		tokenNameToValue.put("KEYWORD_55", "'remove'");
    		tokenNameToValue.put("KEYWORD_56", "'repeat'");
    		tokenNameToValue.put("KEYWORD_57", "'revert'");
    		tokenNameToValue.put("KEYWORD_58", "'accepts'");
    		tokenNameToValue.put("KEYWORD_59", "'context'");
    		tokenNameToValue.put("KEYWORD_60", "'default'");
    		tokenNameToValue.put("KEYWORD_61", "'figures'");
    		tokenNameToValue.put("KEYWORD_62", "'include'");
    		tokenNameToValue.put("KEYWORD_63", "'partial'");
    		tokenNameToValue.put("KEYWORD_64", "'version'");
    		tokenNameToValue.put("KEYWORD_65", "'bookpart'");
    		tokenNameToValue.put("KEYWORD_66", "'consists'");
    		tokenNameToValue.put("KEYWORD_67", "'drummode'");
    		tokenNameToValue.put("KEYWORD_68", "'lyricsto'");
    		tokenNameToValue.put("KEYWORD_69", "'notemode'");
    		tokenNameToValue.put("KEYWORD_70", "'objectid'");
    		tokenNameToValue.put("KEYWORD_71", "'override'");
    		tokenNameToValue.put("KEYWORD_72", "'relative'");
    		tokenNameToValue.put("KEYWORD_73", "'addlyrics'");
    		tokenNameToValue.put("KEYWORD_74", "'chordmode'");
    		tokenNameToValue.put("KEYWORD_75", "'lyricmode'");
    		tokenNameToValue.put("KEYWORD_76", "'maininput'");
    		tokenNameToValue.put("KEYWORD_77", "'transpose'");
    		tokenNameToValue.put("KEYWORD_78", "'figuremode'");
    		tokenNameToValue.put("KEYWORD_79", "'sequential'");
    		tokenNameToValue.put("KEYWORD_80", "'alternative'");
    		tokenNameToValue.put("KEYWORD_81", "'description'");
    		tokenNameToValue.put("KEYWORD_82", "'markuplines'");
    		tokenNameToValue.put("KEYWORD_83", "'defaultchild'");
    		tokenNameToValue.put("KEYWORD_84", "'simultaneous'");
    		tokenNameToValue.put("KEYWORD_85", "'sourcefileline'");
    		tokenNameToValue.put("KEYWORD_86", "'sourcefilename'");
    		tokenNameToValue.put("KEYWORD_87", "'grobdescriptions'");
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:152:1: entryRuleLilyPond : ruleLilyPond EOF ;
    public final void entryRuleLilyPond() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:153:1: ( ruleLilyPond EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:154:1: ruleLilyPond EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:161:1: ruleLilyPond : ( ( rule__LilyPond__ExpressionsAssignment )* ) ;
    public final void ruleLilyPond() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:165:5: ( ( ( rule__LilyPond__ExpressionsAssignment )* ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:166:1: ( ( rule__LilyPond__ExpressionsAssignment )* )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:166:1: ( ( rule__LilyPond__ExpressionsAssignment )* )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:167:1: ( rule__LilyPond__ExpressionsAssignment )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getLilyPondAccess().getExpressionsAssignment()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:168:1: ( rule__LilyPond__ExpressionsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=KEYWORD_87 && LA1_0<=KEYWORD_29)||LA1_0==KEYWORD_24||(LA1_0>=KEYWORD_26 && LA1_0<=KEYWORD_2)||(LA1_0>=KEYWORD_4 && LA1_0<=KEYWORD_15)||LA1_0==KEYWORD_17||(LA1_0>=KEYWORD_19 && LA1_0<=RULE_ID)||LA1_0==RULE_ANY_OTHER) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:168:2: rule__LilyPond__ExpressionsAssignment
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:180:1: entryRuleToplevelExpression : ruleToplevelExpression EOF ;
    public final void entryRuleToplevelExpression() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:181:1: ( ruleToplevelExpression EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:182:1: ruleToplevelExpression EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:189:1: ruleToplevelExpression : ( ( rule__ToplevelExpression__Alternatives ) ) ;
    public final void ruleToplevelExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:193:5: ( ( ( rule__ToplevelExpression__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:194:1: ( ( rule__ToplevelExpression__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:194:1: ( ( rule__ToplevelExpression__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:195:1: ( rule__ToplevelExpression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getToplevelExpressionAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:196:1: ( rule__ToplevelExpression__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:196:2: rule__ToplevelExpression__Alternatives
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:208:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:209:1: ( ruleExpression EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:210:1: ruleExpression EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:217:1: ruleExpression : ( ( rule__Expression__Alternatives ) ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:221:5: ( ( ( rule__Expression__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:222:1: ( ( rule__Expression__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:222:1: ( ( rule__Expression__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:223:1: ( rule__Expression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getExpressionAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:224:1: ( rule__Expression__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:224:2: rule__Expression__Alternatives
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:236:1: entryRuleCommonExpression : ruleCommonExpression EOF ;
    public final void entryRuleCommonExpression() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:237:1: ( ruleCommonExpression EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:238:1: ruleCommonExpression EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:245:1: ruleCommonExpression : ( ( rule__CommonExpression__Alternatives ) ) ;
    public final void ruleCommonExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:249:5: ( ( ( rule__CommonExpression__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:250:1: ( ( rule__CommonExpression__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:250:1: ( ( rule__CommonExpression__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:251:1: ( rule__CommonExpression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCommonExpressionAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:252:1: ( rule__CommonExpression__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:252:2: rule__CommonExpression__Alternatives
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:264:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:265:1: ( ruleAssignment EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:266:1: ruleAssignment EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:273:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:277:5: ( ( ( rule__Assignment__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:278:1: ( ( rule__Assignment__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:278:1: ( ( rule__Assignment__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:279:1: ( rule__Assignment__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:280:1: ( rule__Assignment__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:280:2: rule__Assignment__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:292:1: entryRulePropertyAssignment : rulePropertyAssignment EOF ;
    public final void entryRulePropertyAssignment() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:293:1: ( rulePropertyAssignment EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:294:1: rulePropertyAssignment EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:301:1: rulePropertyAssignment : ( ( rule__PropertyAssignment__Group__0 ) ) ;
    public final void rulePropertyAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:305:5: ( ( ( rule__PropertyAssignment__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:306:1: ( ( rule__PropertyAssignment__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:306:1: ( ( rule__PropertyAssignment__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:307:1: ( rule__PropertyAssignment__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPropertyAssignmentAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:308:1: ( rule__PropertyAssignment__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:308:2: rule__PropertyAssignment__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:320:1: entryRuleBlock : ruleBlock EOF ;
    public final void entryRuleBlock() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:321:1: ( ruleBlock EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:322:1: ruleBlock EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:329:1: ruleBlock : ( ( rule__Block__Alternatives ) ) ;
    public final void ruleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:333:5: ( ( ( rule__Block__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:334:1: ( ( rule__Block__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:334:1: ( ( rule__Block__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:335:1: ( rule__Block__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBlockAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:336:1: ( rule__Block__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:336:2: rule__Block__Alternatives
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:348:1: entryRuleSimpleBlock : ruleSimpleBlock EOF ;
    public final void entryRuleSimpleBlock() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:349:1: ( ruleSimpleBlock EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:350:1: ruleSimpleBlock EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:357:1: ruleSimpleBlock : ( ( rule__SimpleBlock__Group__0 ) ) ;
    public final void ruleSimpleBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:361:5: ( ( ( rule__SimpleBlock__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:362:1: ( ( rule__SimpleBlock__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:362:1: ( ( rule__SimpleBlock__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:363:1: ( rule__SimpleBlock__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimpleBlockAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:364:1: ( rule__SimpleBlock__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:364:2: rule__SimpleBlock__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:376:1: entryRuleSimultaneousBlock : ruleSimultaneousBlock EOF ;
    public final void entryRuleSimultaneousBlock() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:377:1: ( ruleSimultaneousBlock EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:378:1: ruleSimultaneousBlock EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:385:1: ruleSimultaneousBlock : ( ( rule__SimultaneousBlock__Group__0 ) ) ;
    public final void ruleSimultaneousBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:389:5: ( ( ( rule__SimultaneousBlock__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:390:1: ( ( rule__SimultaneousBlock__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:390:1: ( ( rule__SimultaneousBlock__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:391:1: ( rule__SimultaneousBlock__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimultaneousBlockAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:392:1: ( rule__SimultaneousBlock__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:392:2: rule__SimultaneousBlock__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:404:1: entryRuleCommand : ruleCommand EOF ;
    public final void entryRuleCommand() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:405:1: ( ruleCommand EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:406:1: ruleCommand EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:413:1: ruleCommand : ( ( rule__Command__Alternatives ) ) ;
    public final void ruleCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:417:5: ( ( ( rule__Command__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:418:1: ( ( rule__Command__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:418:1: ( ( rule__Command__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:419:1: ( rule__Command__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getCommandAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:420:1: ( rule__Command__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:420:2: rule__Command__Alternatives
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:432:1: entryRuleSpecialCommand : ruleSpecialCommand EOF ;
    public final void entryRuleSpecialCommand() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:433:1: ( ruleSpecialCommand EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:434:1: ruleSpecialCommand EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:441:1: ruleSpecialCommand : ( ( rule__SpecialCommand__Alternatives ) ) ;
    public final void ruleSpecialCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:445:5: ( ( ( rule__SpecialCommand__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:446:1: ( ( rule__SpecialCommand__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:446:1: ( ( rule__SpecialCommand__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:447:1: ( rule__SpecialCommand__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSpecialCommandAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:448:1: ( rule__SpecialCommand__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:448:2: rule__SpecialCommand__Alternatives
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:460:1: entryRuleInclude : ruleInclude EOF ;
    public final void entryRuleInclude() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:461:1: ( ruleInclude EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:462:1: ruleInclude EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:469:1: ruleInclude : ( ( rule__Include__Group__0 ) ) ;
    public final void ruleInclude() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:473:5: ( ( ( rule__Include__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:474:1: ( ( rule__Include__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:474:1: ( ( rule__Include__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:475:1: ( rule__Include__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:476:1: ( rule__Include__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:476:2: rule__Include__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:488:1: entryRuleVersion : ruleVersion EOF ;
    public final void entryRuleVersion() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:489:1: ( ruleVersion EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:490:1: ruleVersion EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:497:1: ruleVersion : ( ( rule__Version__Group__0 ) ) ;
    public final void ruleVersion() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:501:5: ( ( ( rule__Version__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:502:1: ( ( rule__Version__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:502:1: ( ( rule__Version__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:503:1: ( rule__Version__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:504:1: ( rule__Version__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:504:2: rule__Version__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:516:1: entryRuleMarkup : ruleMarkup EOF ;
    public final void entryRuleMarkup() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:517:1: ( ruleMarkup EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:518:1: ruleMarkup EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:525:1: ruleMarkup : ( ( rule__Markup__Group__0 ) ) ;
    public final void ruleMarkup() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:529:5: ( ( ( rule__Markup__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:530:1: ( ( rule__Markup__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:530:1: ( ( rule__Markup__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:531:1: ( rule__Markup__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:532:1: ( rule__Markup__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:532:2: rule__Markup__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:544:1: entryRuleMarkupLines : ruleMarkupLines EOF ;
    public final void entryRuleMarkupLines() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:545:1: ( ruleMarkupLines EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:546:1: ruleMarkupLines EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:553:1: ruleMarkupLines : ( ( rule__MarkupLines__Group__0 ) ) ;
    public final void ruleMarkupLines() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:557:5: ( ( ( rule__MarkupLines__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:558:1: ( ( rule__MarkupLines__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:558:1: ( ( rule__MarkupLines__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:559:1: ( rule__MarkupLines__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupLinesAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:560:1: ( rule__MarkupLines__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:560:2: rule__MarkupLines__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:572:1: entryRuleMarkupBody : ruleMarkupBody EOF ;
    public final void entryRuleMarkupBody() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:573:1: ( ruleMarkupBody EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:574:1: ruleMarkupBody EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:581:1: ruleMarkupBody : ( ( rule__MarkupBody__Group__0 ) ) ;
    public final void ruleMarkupBody() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:585:5: ( ( ( rule__MarkupBody__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:586:1: ( ( rule__MarkupBody__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:586:1: ( ( rule__MarkupBody__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:587:1: ( rule__MarkupBody__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupBodyAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:588:1: ( rule__MarkupBody__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:588:2: rule__MarkupBody__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:600:1: entryRuleContext : ruleContext EOF ;
    public final void entryRuleContext() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:601:1: ( ruleContext EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:602:1: ruleContext EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:609:1: ruleContext : ( ( rule__Context__Group__0 ) ) ;
    public final void ruleContext() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:613:5: ( ( ( rule__Context__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:614:1: ( ( rule__Context__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:614:1: ( ( rule__Context__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:615:1: ( rule__Context__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getContextAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:616:1: ( rule__Context__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:616:2: rule__Context__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:628:1: entryRuleOther : ruleOther EOF ;
    public final void entryRuleOther() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:629:1: ( ruleOther EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:630:1: ruleOther EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:637:1: ruleOther : ( ( rule__Other__Group__0 ) ) ;
    public final void ruleOther() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:641:5: ( ( ( rule__Other__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:642:1: ( ( rule__Other__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:642:1: ( ( rule__Other__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:643:1: ( rule__Other__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOtherAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:644:1: ( rule__Other__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:644:2: rule__Other__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:656:1: entryRuleOtherName : ruleOtherName EOF ;
    public final void entryRuleOtherName() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:657:1: ( ruleOtherName EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:658:1: ruleOtherName EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:665:1: ruleOtherName : ( ( rule__OtherName__Alternatives ) ) ;
    public final void ruleOtherName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:669:5: ( ( ( rule__OtherName__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:670:1: ( ( rule__OtherName__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:670:1: ( ( rule__OtherName__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:671:1: ( rule__OtherName__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOtherNameAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:672:1: ( rule__OtherName__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:672:2: rule__OtherName__Alternatives
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:684:1: entryRuleSpecialCommandName : ruleSpecialCommandName EOF ;
    public final void entryRuleSpecialCommandName() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:685:1: ( ruleSpecialCommandName EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:686:1: ruleSpecialCommandName EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:693:1: ruleSpecialCommandName : ( ( rule__SpecialCommandName__Alternatives ) ) ;
    public final void ruleSpecialCommandName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:697:5: ( ( ( rule__SpecialCommandName__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:698:1: ( ( rule__SpecialCommandName__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:698:1: ( ( rule__SpecialCommandName__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:699:1: ( rule__SpecialCommandName__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSpecialCommandNameAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:700:1: ( rule__SpecialCommandName__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:700:2: rule__SpecialCommandName__Alternatives
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:712:1: entryRuleSpecialCharacter : ruleSpecialCharacter EOF ;
    public final void entryRuleSpecialCharacter() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:713:1: ( ruleSpecialCharacter EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:714:1: ruleSpecialCharacter EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:721:1: ruleSpecialCharacter : ( ( rule__SpecialCharacter__Alternatives ) ) ;
    public final void ruleSpecialCharacter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:725:5: ( ( ( rule__SpecialCharacter__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:726:1: ( ( rule__SpecialCharacter__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:726:1: ( ( rule__SpecialCharacter__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:727:1: ( rule__SpecialCharacter__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSpecialCharacterAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:728:1: ( rule__SpecialCharacter__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:728:2: rule__SpecialCharacter__Alternatives
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:740:1: entryRuleUnparsedBlock : ruleUnparsedBlock EOF ;
    public final void entryRuleUnparsedBlock() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:741:1: ( ruleUnparsedBlock EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:742:1: ruleUnparsedBlock EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:749:1: ruleUnparsedBlock : ( ( rule__UnparsedBlock__Group__0 ) ) ;
    public final void ruleUnparsedBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:753:5: ( ( ( rule__UnparsedBlock__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:754:1: ( ( rule__UnparsedBlock__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:754:1: ( ( rule__UnparsedBlock__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:755:1: ( rule__UnparsedBlock__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnparsedBlockAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:756:1: ( rule__UnparsedBlock__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:756:2: rule__UnparsedBlock__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:768:1: entryRuleUnparsedExpression : ruleUnparsedExpression EOF ;
    public final void entryRuleUnparsedExpression() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:769:1: ( ruleUnparsedExpression EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:770:1: ruleUnparsedExpression EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:777:1: ruleUnparsedExpression : ( ( rule__UnparsedExpression__Alternatives ) ) ;
    public final void ruleUnparsedExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:781:5: ( ( ( rule__UnparsedExpression__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:782:1: ( ( rule__UnparsedExpression__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:782:1: ( ( rule__UnparsedExpression__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:783:1: ( rule__UnparsedExpression__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnparsedExpressionAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:784:1: ( rule__UnparsedExpression__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:784:2: rule__UnparsedExpression__Alternatives
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:796:1: entryRuleUnparsedCommand : ruleUnparsedCommand EOF ;
    public final void entryRuleUnparsedCommand() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:797:1: ( ruleUnparsedCommand EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:798:1: ruleUnparsedCommand EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:805:1: ruleUnparsedCommand : ( ( rule__UnparsedCommand__Group__0 ) ) ;
    public final void ruleUnparsedCommand() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:809:5: ( ( ( rule__UnparsedCommand__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:810:1: ( ( rule__UnparsedCommand__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:810:1: ( ( rule__UnparsedCommand__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:811:1: ( rule__UnparsedCommand__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnparsedCommandAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:812:1: ( rule__UnparsedCommand__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:812:2: rule__UnparsedCommand__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:824:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:825:1: ( ruleReference EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:826:1: ruleReference EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:833:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:837:5: ( ( ( rule__Reference__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:838:1: ( ( rule__Reference__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:838:1: ( ( rule__Reference__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:839:1: ( rule__Reference__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:840:1: ( rule__Reference__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:840:2: rule__Reference__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:852:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:853:1: ( ruleText EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:854:1: ruleText EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:861:1: ruleText : ( ( rule__Text__ValueAssignment ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:865:5: ( ( ( rule__Text__ValueAssignment ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:866:1: ( ( rule__Text__ValueAssignment ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:866:1: ( ( rule__Text__ValueAssignment ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:867:1: ( rule__Text__ValueAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextAccess().getValueAssignment()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:868:1: ( rule__Text__ValueAssignment )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:868:2: rule__Text__ValueAssignment
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:880:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:881:1: ( ruleNumber EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:882:1: ruleNumber EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:889:1: ruleNumber : ( ( rule__Number__ValueAssignment ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:893:5: ( ( ( rule__Number__ValueAssignment ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:894:1: ( ( rule__Number__ValueAssignment ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:894:1: ( ( rule__Number__ValueAssignment ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:895:1: ( rule__Number__ValueAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNumberAccess().getValueAssignment()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:896:1: ( rule__Number__ValueAssignment )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:896:2: rule__Number__ValueAssignment
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:908:1: entryRuleScheme : ruleScheme EOF ;
    public final void entryRuleScheme() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SCHEME_SL_COMMENT", "RULE_SCHEME_ML_COMMENT");

        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:912:1: ( ruleScheme EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:913:1: ruleScheme EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:923:1: ruleScheme : ( ( rule__Scheme__Group__0 ) ) ;
    public final void ruleScheme() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_SCHEME_SL_COMMENT", "RULE_SCHEME_ML_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:928:5: ( ( ( rule__Scheme__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:929:1: ( ( rule__Scheme__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:929:1: ( ( rule__Scheme__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:930:1: ( rule__Scheme__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:931:1: ( rule__Scheme__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:931:2: rule__Scheme__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:944:1: entryRuleSchemeExpression : ruleSchemeExpression EOF ;
    public final void entryRuleSchemeExpression() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:945:1: ( ruleSchemeExpression EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:946:1: ruleSchemeExpression EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:953:1: ruleSchemeExpression : ( ( rule__SchemeExpression__Group__0 ) ) ;
    public final void ruleSchemeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:957:5: ( ( ( rule__SchemeExpression__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:958:1: ( ( rule__SchemeExpression__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:958:1: ( ( rule__SchemeExpression__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:959:1: ( rule__SchemeExpression__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:960:1: ( rule__SchemeExpression__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:960:2: rule__SchemeExpression__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:972:1: entryRuleSchemeValue : ruleSchemeValue EOF ;
    public final void entryRuleSchemeValue() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:973:1: ( ruleSchemeValue EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:974:1: ruleSchemeValue EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:981:1: ruleSchemeValue : ( ( rule__SchemeValue__Alternatives ) ) ;
    public final void ruleSchemeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:985:5: ( ( ( rule__SchemeValue__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:986:1: ( ( rule__SchemeValue__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:986:1: ( ( rule__SchemeValue__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:987:1: ( rule__SchemeValue__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeValueAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:988:1: ( rule__SchemeValue__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:988:2: rule__SchemeValue__Alternatives
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1000:1: entryRuleSchemeBoolean : ruleSchemeBoolean EOF ;
    public final void entryRuleSchemeBoolean() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1001:1: ( ruleSchemeBoolean EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1002:1: ruleSchemeBoolean EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1009:1: ruleSchemeBoolean : ( ( rule__SchemeBoolean__ValueAssignment ) ) ;
    public final void ruleSchemeBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1013:5: ( ( ( rule__SchemeBoolean__ValueAssignment ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1014:1: ( ( rule__SchemeBoolean__ValueAssignment ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1014:1: ( ( rule__SchemeBoolean__ValueAssignment ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1015:1: ( rule__SchemeBoolean__ValueAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeBooleanAccess().getValueAssignment()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1016:1: ( rule__SchemeBoolean__ValueAssignment )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1016:2: rule__SchemeBoolean__ValueAssignment
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1028:1: entryRuleSchemeList : ruleSchemeList EOF ;
    public final void entryRuleSchemeList() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1029:1: ( ruleSchemeList EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1030:1: ruleSchemeList EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1037:1: ruleSchemeList : ( ( rule__SchemeList__Group__0 ) ) ;
    public final void ruleSchemeList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1041:5: ( ( ( rule__SchemeList__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1042:1: ( ( rule__SchemeList__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1042:1: ( ( rule__SchemeList__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1043:1: ( rule__SchemeList__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeListAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1044:1: ( rule__SchemeList__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1044:2: rule__SchemeList__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1056:1: entryRuleSchemeBlock : ruleSchemeBlock EOF ;
    public final void entryRuleSchemeBlock() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1057:1: ( ruleSchemeBlock EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1058:1: ruleSchemeBlock EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1065:1: ruleSchemeBlock : ( ( rule__SchemeBlock__Group__0 ) ) ;
    public final void ruleSchemeBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1069:5: ( ( ( rule__SchemeBlock__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1070:1: ( ( rule__SchemeBlock__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1070:1: ( ( rule__SchemeBlock__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1071:1: ( rule__SchemeBlock__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeBlockAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1072:1: ( rule__SchemeBlock__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1072:2: rule__SchemeBlock__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1084:1: entryRuleSchemeCharacter : ruleSchemeCharacter EOF ;
    public final void entryRuleSchemeCharacter() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1085:1: ( ruleSchemeCharacter EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1086:1: ruleSchemeCharacter EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1093:1: ruleSchemeCharacter : ( ( rule__SchemeCharacter__Group__0 ) ) ;
    public final void ruleSchemeCharacter() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1097:5: ( ( ( rule__SchemeCharacter__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1098:1: ( ( rule__SchemeCharacter__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1098:1: ( ( rule__SchemeCharacter__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1099:1: ( rule__SchemeCharacter__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeCharacterAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1100:1: ( rule__SchemeCharacter__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1100:2: rule__SchemeCharacter__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1112:1: entryRuleSchemeText : ruleSchemeText EOF ;
    public final void entryRuleSchemeText() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1113:1: ( ruleSchemeText EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1114:1: ruleSchemeText EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1121:1: ruleSchemeText : ( ( rule__SchemeText__ValueAssignment ) ) ;
    public final void ruleSchemeText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1125:5: ( ( ( rule__SchemeText__ValueAssignment ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1126:1: ( ( rule__SchemeText__ValueAssignment ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1126:1: ( ( rule__SchemeText__ValueAssignment ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1127:1: ( rule__SchemeText__ValueAssignment )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeTextAccess().getValueAssignment()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1128:1: ( rule__SchemeText__ValueAssignment )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1128:2: rule__SchemeText__ValueAssignment
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1140:1: entryRuleSchemeId : ruleSchemeId EOF ;
    public final void entryRuleSchemeId() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1144:1: ( ruleSchemeId EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1145:1: ruleSchemeId EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1155:1: ruleSchemeId : ( ( rule__SchemeId__Group__0 ) ) ;
    public final void ruleSchemeId() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1160:5: ( ( ( rule__SchemeId__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1161:1: ( ( rule__SchemeId__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1161:1: ( ( rule__SchemeId__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1162:1: ( rule__SchemeId__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeIdAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1163:1: ( rule__SchemeId__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1163:2: rule__SchemeId__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1176:1: entryRuleSchemeTextLiteral : ruleSchemeTextLiteral EOF ;
    public final void entryRuleSchemeTextLiteral() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1177:1: ( ruleSchemeTextLiteral EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1178:1: ruleSchemeTextLiteral EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1185:1: ruleSchemeTextLiteral : ( ( rule__SchemeTextLiteral__Alternatives ) ) ;
    public final void ruleSchemeTextLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1189:5: ( ( ( rule__SchemeTextLiteral__Alternatives ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1190:1: ( ( rule__SchemeTextLiteral__Alternatives ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1190:1: ( ( rule__SchemeTextLiteral__Alternatives ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1191:1: ( rule__SchemeTextLiteral__Alternatives )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeTextLiteralAccess().getAlternatives()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1192:1: ( rule__SchemeTextLiteral__Alternatives )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1192:2: rule__SchemeTextLiteral__Alternatives
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1204:1: entryRuleSchemeNumber : ruleSchemeNumber EOF ;
    public final void entryRuleSchemeNumber() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1208:1: ( ruleSchemeNumber EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1209:1: ruleSchemeNumber EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1219:1: ruleSchemeNumber : ( ( rule__SchemeNumber__Group__0 ) ) ;
    public final void ruleSchemeNumber() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1224:5: ( ( ( rule__SchemeNumber__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1225:1: ( ( rule__SchemeNumber__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1225:1: ( ( rule__SchemeNumber__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1226:1: ( rule__SchemeNumber__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeNumberAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1227:1: ( rule__SchemeNumber__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1227:2: rule__SchemeNumber__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1240:1: entryRuleSchemeNumberRadix : ruleSchemeNumberRadix EOF ;
    public final void entryRuleSchemeNumberRadix() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1241:1: ( ruleSchemeNumberRadix EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1242:1: ruleSchemeNumberRadix EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1249:1: ruleSchemeNumberRadix : ( ( rule__SchemeNumberRadix__Group__0 ) ) ;
    public final void ruleSchemeNumberRadix() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1253:5: ( ( ( rule__SchemeNumberRadix__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1254:1: ( ( rule__SchemeNumberRadix__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1254:1: ( ( rule__SchemeNumberRadix__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1255:1: ( rule__SchemeNumberRadix__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeNumberRadixAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1256:1: ( rule__SchemeNumberRadix__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1256:2: rule__SchemeNumberRadix__Group__0
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1268:1: entryRuleSchemeMarkupCommand : ruleSchemeMarkupCommand EOF ;
    public final void entryRuleSchemeMarkupCommand() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1272:1: ( ruleSchemeMarkupCommand EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1273:1: ruleSchemeMarkupCommand EOF
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1283:1: ruleSchemeMarkupCommand : ( ( rule__SchemeMarkupCommand__Group__0 ) ) ;
    public final void ruleSchemeMarkupCommand() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1288:5: ( ( ( rule__SchemeMarkupCommand__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1289:1: ( ( rule__SchemeMarkupCommand__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1289:1: ( ( rule__SchemeMarkupCommand__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1290:1: ( rule__SchemeMarkupCommand__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeMarkupCommandAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1291:1: ( rule__SchemeMarkupCommand__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1291:2: rule__SchemeMarkupCommand__Group__0
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


    // $ANTLR start entryRuleBOOL
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1304:1: entryRuleBOOL : ruleBOOL EOF ;
    public final void entryRuleBOOL() throws RecognitionException {
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1305:1: ( ruleBOOL EOF )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1306:1: ruleBOOL EOF
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBOOLRule()); 
            }
            pushFollow(FOLLOW_ruleBOOL_in_entryRuleBOOL2657);
            ruleBOOL();
            _fsp--;
            if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getBOOLRule()); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBOOL2664); if (failed) return ;

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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1313:1: ruleBOOL : ( ( rule__BOOL__Group__0 ) ) ;
    public final void ruleBOOL() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1317:5: ( ( ( rule__BOOL__Group__0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1318:1: ( ( rule__BOOL__Group__0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1318:1: ( ( rule__BOOL__Group__0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1319:1: ( rule__BOOL__Group__0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBOOLAccess().getGroup()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1320:1: ( rule__BOOL__Group__0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1320:2: rule__BOOL__Group__0
            {
            pushFollow(FOLLOW_rule__BOOL__Group__0_in_ruleBOOL2694);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1332:1: rule__ToplevelExpression__Alternatives : ( ( ruleAssignment ) | ( ruleCommonExpression ) );
    public final void rule__ToplevelExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1336:1: ( ( ruleAssignment ) | ( ruleCommonExpression ) )
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
                        new NoViableAltException("1332:1: rule__ToplevelExpression__Alternatives : ( ( ruleAssignment ) | ( ruleCommonExpression ) );", 2, 1, input);

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
                        new NoViableAltException("1332:1: rule__ToplevelExpression__Alternatives : ( ( ruleAssignment ) | ( ruleCommonExpression ) );", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_87:
            case KEYWORD_85:
            case KEYWORD_86:
            case KEYWORD_83:
            case KEYWORD_84:
            case KEYWORD_80:
            case KEYWORD_81:
            case KEYWORD_82:
            case KEYWORD_78:
            case KEYWORD_79:
            case KEYWORD_73:
            case KEYWORD_74:
            case KEYWORD_75:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_65:
            case KEYWORD_66:
            case KEYWORD_67:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_58:
            case KEYWORD_59:
            case KEYWORD_60:
            case KEYWORD_61:
            case KEYWORD_62:
            case KEYWORD_63:
            case KEYWORD_64:
            case KEYWORD_47:
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
            case KEYWORD_40:
            case KEYWORD_41:
            case KEYWORD_42:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_30:
            case KEYWORD_31:
            case KEYWORD_32:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_27:
            case KEYWORD_28:
            case KEYWORD_29:
            case KEYWORD_24:
            case KEYWORD_26:
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
            case KEYWORD_17:
            case KEYWORD_19:
            case RULE_INT:
            case RULE_ANY_OTHER:
                {
                alt2=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1332:1: rule__ToplevelExpression__Alternatives : ( ( ruleAssignment ) | ( ruleCommonExpression ) );", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1337:1: ( ruleAssignment )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1337:1: ( ruleAssignment )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1338:1: ruleAssignment
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getToplevelExpressionAccess().getAssignmentParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleAssignment_in_rule__ToplevelExpression__Alternatives2730);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1343:6: ( ruleCommonExpression )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1343:6: ( ruleCommonExpression )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1344:1: ruleCommonExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getToplevelExpressionAccess().getCommonExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleCommonExpression_in_rule__ToplevelExpression__Alternatives2747);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1354:1: rule__Expression__Alternatives : ( ( rulePropertyAssignment ) | ( ruleCommonExpression ) );
    public final void rule__Expression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1358:1: ( ( rulePropertyAssignment ) | ( ruleCommonExpression ) )
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
                        new NoViableAltException("1354:1: rule__Expression__Alternatives : ( ( rulePropertyAssignment ) | ( ruleCommonExpression ) );", 3, 1, input);

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
                        new NoViableAltException("1354:1: rule__Expression__Alternatives : ( ( rulePropertyAssignment ) | ( ruleCommonExpression ) );", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_87:
            case KEYWORD_85:
            case KEYWORD_86:
            case KEYWORD_83:
            case KEYWORD_84:
            case KEYWORD_80:
            case KEYWORD_81:
            case KEYWORD_82:
            case KEYWORD_78:
            case KEYWORD_79:
            case KEYWORD_73:
            case KEYWORD_74:
            case KEYWORD_75:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_65:
            case KEYWORD_66:
            case KEYWORD_67:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_58:
            case KEYWORD_59:
            case KEYWORD_60:
            case KEYWORD_61:
            case KEYWORD_62:
            case KEYWORD_63:
            case KEYWORD_64:
            case KEYWORD_47:
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
            case KEYWORD_40:
            case KEYWORD_41:
            case KEYWORD_42:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_30:
            case KEYWORD_31:
            case KEYWORD_32:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_27:
            case KEYWORD_28:
            case KEYWORD_29:
            case KEYWORD_24:
            case KEYWORD_26:
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
            case KEYWORD_17:
            case KEYWORD_19:
            case RULE_INT:
            case RULE_ANY_OTHER:
                {
                alt3=2;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1354:1: rule__Expression__Alternatives : ( ( rulePropertyAssignment ) | ( ruleCommonExpression ) );", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1359:1: ( rulePropertyAssignment )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1359:1: ( rulePropertyAssignment )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1360:1: rulePropertyAssignment
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getPropertyAssignmentParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_rulePropertyAssignment_in_rule__Expression__Alternatives2779);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1365:6: ( ruleCommonExpression )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1365:6: ( ruleCommonExpression )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1366:1: ruleCommonExpression
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getExpressionAccess().getCommonExpressionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleCommonExpression_in_rule__Expression__Alternatives2796);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1376:1: rule__CommonExpression__Alternatives : ( ( ruleCommand ) | ( ruleBlock ) | ( ruleScheme ) | ( ruleText ) | ( ruleNumber ) );
    public final void rule__CommonExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1380:1: ( ( ruleCommand ) | ( ruleBlock ) | ( ruleScheme ) | ( ruleText ) | ( ruleNumber ) )
            int alt4=5;
            switch ( input.LA(1) ) {
            case KEYWORD_14:
                {
                alt4=1;
                }
                break;
            case KEYWORD_24:
            case KEYWORD_17:
                {
                alt4=2;
                }
                break;
            case KEYWORD_2:
                {
                alt4=3;
                }
                break;
            case KEYWORD_87:
            case KEYWORD_85:
            case KEYWORD_86:
            case KEYWORD_83:
            case KEYWORD_84:
            case KEYWORD_80:
            case KEYWORD_81:
            case KEYWORD_82:
            case KEYWORD_78:
            case KEYWORD_79:
            case KEYWORD_73:
            case KEYWORD_74:
            case KEYWORD_75:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_65:
            case KEYWORD_66:
            case KEYWORD_67:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_58:
            case KEYWORD_59:
            case KEYWORD_60:
            case KEYWORD_61:
            case KEYWORD_62:
            case KEYWORD_63:
            case KEYWORD_64:
            case KEYWORD_47:
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
            case KEYWORD_40:
            case KEYWORD_41:
            case KEYWORD_42:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_30:
            case KEYWORD_31:
            case KEYWORD_32:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_27:
            case KEYWORD_28:
            case KEYWORD_29:
            case KEYWORD_26:
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
            case KEYWORD_15:
            case KEYWORD_19:
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
                    new NoViableAltException("1376:1: rule__CommonExpression__Alternatives : ( ( ruleCommand ) | ( ruleBlock ) | ( ruleScheme ) | ( ruleText ) | ( ruleNumber ) );", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1381:1: ( ruleCommand )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1381:1: ( ruleCommand )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1382:1: ruleCommand
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCommonExpressionAccess().getCommandParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleCommand_in_rule__CommonExpression__Alternatives2828);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1387:6: ( ruleBlock )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1387:6: ( ruleBlock )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1388:1: ruleBlock
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCommonExpressionAccess().getBlockParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleBlock_in_rule__CommonExpression__Alternatives2845);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1393:6: ( ruleScheme )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1393:6: ( ruleScheme )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1394:1: ruleScheme
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCommonExpressionAccess().getSchemeParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleScheme_in_rule__CommonExpression__Alternatives2862);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1399:6: ( ruleText )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1399:6: ( ruleText )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1400:1: ruleText
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCommonExpressionAccess().getTextParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleText_in_rule__CommonExpression__Alternatives2879);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1405:6: ( ruleNumber )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1405:6: ( ruleNumber )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1406:1: ruleNumber
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCommonExpressionAccess().getNumberParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleNumber_in_rule__CommonExpression__Alternatives2896);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1416:1: rule__Assignment__NameAlternatives_0_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__Assignment__NameAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1420:1: ( ( RULE_ID ) | ( RULE_STRING ) )
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
                    new NoViableAltException("1416:1: rule__Assignment__NameAlternatives_0_0 : ( ( RULE_ID ) | ( RULE_STRING ) );", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1421:1: ( RULE_ID )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1421:1: ( RULE_ID )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1422:1: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAssignmentAccess().getNameIDTerminalRuleCall_0_0_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Assignment__NameAlternatives_0_02928); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getAssignmentAccess().getNameIDTerminalRuleCall_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1427:6: ( RULE_STRING )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1427:6: ( RULE_STRING )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1428:1: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getAssignmentAccess().getNameSTRINGTerminalRuleCall_0_0_1()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Assignment__NameAlternatives_0_02945); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1438:1: rule__PropertyAssignment__IdAlternatives_0_0 : ( ( RULE_ID ) | ( RULE_STRING ) );
    public final void rule__PropertyAssignment__IdAlternatives_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1442:1: ( ( RULE_ID ) | ( RULE_STRING ) )
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
                    new NoViableAltException("1438:1: rule__PropertyAssignment__IdAlternatives_0_0 : ( ( RULE_ID ) | ( RULE_STRING ) );", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1443:1: ( RULE_ID )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1443:1: ( RULE_ID )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1444:1: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getPropertyAssignmentAccess().getIdIDTerminalRuleCall_0_0_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__PropertyAssignment__IdAlternatives_0_02977); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getPropertyAssignmentAccess().getIdIDTerminalRuleCall_0_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1449:6: ( RULE_STRING )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1449:6: ( RULE_STRING )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1450:1: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getPropertyAssignmentAccess().getIdSTRINGTerminalRuleCall_0_0_1()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__PropertyAssignment__IdAlternatives_0_02994); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1460:1: rule__Block__Alternatives : ( ( ruleSimpleBlock ) | ( ruleSimultaneousBlock ) );
    public final void rule__Block__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1464:1: ( ( ruleSimpleBlock ) | ( ruleSimultaneousBlock ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==KEYWORD_17) ) {
                alt7=1;
            }
            else if ( (LA7_0==KEYWORD_24) ) {
                alt7=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1460:1: rule__Block__Alternatives : ( ( ruleSimpleBlock ) | ( ruleSimultaneousBlock ) );", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1465:1: ( ruleSimpleBlock )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1465:1: ( ruleSimpleBlock )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1466:1: ruleSimpleBlock
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getBlockAccess().getSimpleBlockParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleSimpleBlock_in_rule__Block__Alternatives3026);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1471:6: ( ruleSimultaneousBlock )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1471:6: ( ruleSimultaneousBlock )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1472:1: ruleSimultaneousBlock
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getBlockAccess().getSimultaneousBlockParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleSimultaneousBlock_in_rule__Block__Alternatives3043);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1482:1: rule__Command__Alternatives : ( ( ruleSpecialCommand ) | ( ruleReference ) );
    public final void rule__Command__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1486:1: ( ( ruleSpecialCommand ) | ( ruleReference ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==KEYWORD_14) ) {
                int LA8_1 = input.LA(2);

                if ( ((LA8_1>=KEYWORD_87 && LA8_1<=KEYWORD_29)||LA8_1==KEYWORD_1||(LA8_1>=KEYWORD_5 && LA8_1<=KEYWORD_7)||LA8_1==KEYWORD_10||(LA8_1>=KEYWORD_12 && LA8_1<=KEYWORD_13)||LA8_1==KEYWORD_15||LA8_1==KEYWORD_19) ) {
                    alt8=1;
                }
                else if ( (LA8_1==RULE_ID) ) {
                    alt8=2;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1482:1: rule__Command__Alternatives : ( ( ruleSpecialCommand ) | ( ruleReference ) );", 8, 1, input);

                    throw nvae;
                }
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1482:1: rule__Command__Alternatives : ( ( ruleSpecialCommand ) | ( ruleReference ) );", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1487:1: ( ruleSpecialCommand )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1487:1: ( ruleSpecialCommand )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1488:1: ruleSpecialCommand
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getSpecialCommandParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleSpecialCommand_in_rule__Command__Alternatives3075);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1493:6: ( ruleReference )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1493:6: ( ruleReference )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1494:1: ruleReference
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getCommandAccess().getReferenceParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleReference_in_rule__Command__Alternatives3092);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1504:1: rule__SpecialCommand__Alternatives : ( ( ruleInclude ) | ( ruleVersion ) | ( ruleMarkup ) | ( ruleMarkupLines ) | ( ruleContext ) | ( ruleOther ) );
    public final void rule__SpecialCommand__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1508:1: ( ( ruleInclude ) | ( ruleVersion ) | ( ruleMarkup ) | ( ruleMarkupLines ) | ( ruleContext ) | ( ruleOther ) )
            int alt9=6;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==KEYWORD_14) ) {
                switch ( input.LA(2) ) {
                case KEYWORD_59:
                    {
                    alt9=5;
                    }
                    break;
                case KEYWORD_87:
                case KEYWORD_85:
                case KEYWORD_86:
                case KEYWORD_83:
                case KEYWORD_84:
                case KEYWORD_80:
                case KEYWORD_81:
                case KEYWORD_78:
                case KEYWORD_79:
                case KEYWORD_73:
                case KEYWORD_74:
                case KEYWORD_75:
                case KEYWORD_76:
                case KEYWORD_77:
                case KEYWORD_65:
                case KEYWORD_66:
                case KEYWORD_67:
                case KEYWORD_68:
                case KEYWORD_69:
                case KEYWORD_70:
                case KEYWORD_71:
                case KEYWORD_72:
                case KEYWORD_58:
                case KEYWORD_60:
                case KEYWORD_61:
                case KEYWORD_63:
                case KEYWORD_47:
                case KEYWORD_48:
                case KEYWORD_49:
                case KEYWORD_50:
                case KEYWORD_51:
                case KEYWORD_52:
                case KEYWORD_54:
                case KEYWORD_55:
                case KEYWORD_56:
                case KEYWORD_57:
                case KEYWORD_40:
                case KEYWORD_41:
                case KEYWORD_42:
                case KEYWORD_43:
                case KEYWORD_44:
                case KEYWORD_45:
                case KEYWORD_46:
                case KEYWORD_30:
                case KEYWORD_31:
                case KEYWORD_32:
                case KEYWORD_33:
                case KEYWORD_34:
                case KEYWORD_35:
                case KEYWORD_36:
                case KEYWORD_37:
                case KEYWORD_38:
                case KEYWORD_39:
                case KEYWORD_27:
                case KEYWORD_28:
                case KEYWORD_29:
                case KEYWORD_1:
                case KEYWORD_5:
                case KEYWORD_6:
                case KEYWORD_7:
                case KEYWORD_10:
                case KEYWORD_12:
                case KEYWORD_13:
                case KEYWORD_15:
                case KEYWORD_19:
                    {
                    alt9=6;
                    }
                    break;
                case KEYWORD_53:
                    {
                    alt9=3;
                    }
                    break;
                case KEYWORD_64:
                    {
                    alt9=2;
                    }
                    break;
                case KEYWORD_82:
                    {
                    alt9=4;
                    }
                    break;
                case KEYWORD_62:
                    {
                    alt9=1;
                    }
                    break;
                default:
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("1504:1: rule__SpecialCommand__Alternatives : ( ( ruleInclude ) | ( ruleVersion ) | ( ruleMarkup ) | ( ruleMarkupLines ) | ( ruleContext ) | ( ruleOther ) );", 9, 1, input);

                    throw nvae;
                }

            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1504:1: rule__SpecialCommand__Alternatives : ( ( ruleInclude ) | ( ruleVersion ) | ( ruleMarkup ) | ( ruleMarkupLines ) | ( ruleContext ) | ( ruleOther ) );", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1509:1: ( ruleInclude )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1509:1: ( ruleInclude )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1510:1: ruleInclude
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCommandAccess().getIncludeParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleInclude_in_rule__SpecialCommand__Alternatives3124);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1515:6: ( ruleVersion )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1515:6: ( ruleVersion )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1516:1: ruleVersion
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCommandAccess().getVersionParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleVersion_in_rule__SpecialCommand__Alternatives3141);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1521:6: ( ruleMarkup )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1521:6: ( ruleMarkup )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1522:1: ruleMarkup
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCommandAccess().getMarkupParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleMarkup_in_rule__SpecialCommand__Alternatives3158);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1527:6: ( ruleMarkupLines )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1527:6: ( ruleMarkupLines )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1528:1: ruleMarkupLines
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCommandAccess().getMarkupLinesParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleMarkupLines_in_rule__SpecialCommand__Alternatives3175);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1533:6: ( ruleContext )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1533:6: ( ruleContext )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1534:1: ruleContext
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCommandAccess().getContextParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleContext_in_rule__SpecialCommand__Alternatives3192);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1539:6: ( ruleOther )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1539:6: ( ruleOther )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1540:1: ruleOther
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCommandAccess().getOtherParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleOther_in_rule__SpecialCommand__Alternatives3209);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1550:1: rule__MarkupBody__CommandAlternatives_1_0 : ( ( ruleScheme ) | ( ruleUnparsedCommand ) );
    public final void rule__MarkupBody__CommandAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1554:1: ( ( ruleScheme ) | ( ruleUnparsedCommand ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==KEYWORD_2) ) {
                alt10=1;
            }
            else if ( (LA10_0==KEYWORD_14) ) {
                alt10=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1550:1: rule__MarkupBody__CommandAlternatives_1_0 : ( ( ruleScheme ) | ( ruleUnparsedCommand ) );", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1555:1: ( ruleScheme )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1555:1: ( ruleScheme )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1556:1: ruleScheme
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getMarkupBodyAccess().getCommandSchemeParserRuleCall_1_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleScheme_in_rule__MarkupBody__CommandAlternatives_1_03241);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1561:6: ( ruleUnparsedCommand )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1561:6: ( ruleUnparsedCommand )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1562:1: ruleUnparsedCommand
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getMarkupBodyAccess().getCommandUnparsedCommandParserRuleCall_1_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleUnparsedCommand_in_rule__MarkupBody__CommandAlternatives_1_03258);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1572:1: rule__Other__KeywordAlternatives_1_0 : ( ( ruleSpecialCharacter ) | ( KEYWORD_5 ) | ( KEYWORD_6 ) | ( ruleOtherName ) );
    public final void rule__Other__KeywordAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1576:1: ( ( ruleSpecialCharacter ) | ( KEYWORD_5 ) | ( KEYWORD_6 ) | ( ruleOtherName ) )
            int alt11=4;
            switch ( input.LA(1) ) {
            case KEYWORD_1:
            case KEYWORD_7:
            case KEYWORD_10:
            case KEYWORD_12:
            case KEYWORD_13:
            case KEYWORD_15:
            case KEYWORD_19:
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
            case KEYWORD_87:
            case KEYWORD_85:
            case KEYWORD_86:
            case KEYWORD_83:
            case KEYWORD_84:
            case KEYWORD_80:
            case KEYWORD_81:
            case KEYWORD_78:
            case KEYWORD_79:
            case KEYWORD_73:
            case KEYWORD_74:
            case KEYWORD_75:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_65:
            case KEYWORD_66:
            case KEYWORD_67:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_58:
            case KEYWORD_60:
            case KEYWORD_61:
            case KEYWORD_63:
            case KEYWORD_47:
            case KEYWORD_48:
            case KEYWORD_49:
            case KEYWORD_50:
            case KEYWORD_51:
            case KEYWORD_52:
            case KEYWORD_54:
            case KEYWORD_55:
            case KEYWORD_56:
            case KEYWORD_57:
            case KEYWORD_40:
            case KEYWORD_41:
            case KEYWORD_42:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_30:
            case KEYWORD_31:
            case KEYWORD_32:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_27:
            case KEYWORD_28:
            case KEYWORD_29:
                {
                alt11=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1572:1: rule__Other__KeywordAlternatives_1_0 : ( ( ruleSpecialCharacter ) | ( KEYWORD_5 ) | ( KEYWORD_6 ) | ( ruleOtherName ) );", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1577:1: ( ruleSpecialCharacter )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1577:1: ( ruleSpecialCharacter )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1578:1: ruleSpecialCharacter
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherAccess().getKeywordSpecialCharacterParserRuleCall_1_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleSpecialCharacter_in_rule__Other__KeywordAlternatives_1_03290);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1583:6: ( KEYWORD_5 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1583:6: ( KEYWORD_5 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1584:1: KEYWORD_5
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherAccess().getKeywordLeftParenthesisKeyword_1_0_1()); 
                    }
                    match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_rule__Other__KeywordAlternatives_1_03308); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherAccess().getKeywordLeftParenthesisKeyword_1_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1591:6: ( KEYWORD_6 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1591:6: ( KEYWORD_6 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1592:1: KEYWORD_6
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherAccess().getKeywordRightParenthesisKeyword_1_0_2()); 
                    }
                    match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_rule__Other__KeywordAlternatives_1_03328); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherAccess().getKeywordRightParenthesisKeyword_1_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1599:6: ( ruleOtherName )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1599:6: ( ruleOtherName )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1600:1: ruleOtherName
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherAccess().getKeywordOtherNameParserRuleCall_1_0_3()); 
                    }
                    pushFollow(FOLLOW_ruleOtherName_in_rule__Other__KeywordAlternatives_1_03347);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1610:1: rule__OtherName__Alternatives : ( ( KEYWORD_58 ) | ( KEYWORD_73 ) | ( KEYWORD_40 ) | ( KEYWORD_80 ) | ( KEYWORD_30 ) | ( KEYWORD_65 ) | ( KEYWORD_47 ) | ( KEYWORD_74 ) | ( KEYWORD_48 ) | ( KEYWORD_66 ) | ( KEYWORD_60 ) | ( KEYWORD_83 ) | ( KEYWORD_49 ) | ( KEYWORD_81 ) | ( KEYWORD_67 ) | ( KEYWORD_41 ) | ( KEYWORD_78 ) | ( KEYWORD_61 ) | ( KEYWORD_87 ) | ( KEYWORD_50 ) | ( KEYWORD_27 ) | ( KEYWORD_51 ) | ( KEYWORD_75 ) | ( KEYWORD_52 ) | ( KEYWORD_68 ) | ( KEYWORD_76 ) | ( KEYWORD_31 ) | ( KEYWORD_32 ) | ( KEYWORD_33 ) | ( KEYWORD_28 ) | ( KEYWORD_69 ) | ( KEYWORD_70 ) | ( KEYWORD_54 ) | ( KEYWORD_34 ) | ( KEYWORD_71 ) | ( KEYWORD_42 ) | ( KEYWORD_63 ) | ( KEYWORD_72 ) | ( KEYWORD_55 ) | ( KEYWORD_56 ) | ( KEYWORD_35 ) | ( KEYWORD_57 ) | ( KEYWORD_43 ) | ( KEYWORD_79 ) | ( KEYWORD_29 ) | ( KEYWORD_84 ) | ( KEYWORD_36 ) | ( KEYWORD_85 ) | ( KEYWORD_86 ) | ( KEYWORD_44 ) | ( KEYWORD_37 ) | ( KEYWORD_45 ) | ( KEYWORD_77 ) | ( KEYWORD_38 ) | ( KEYWORD_46 ) | ( KEYWORD_39 ) );
    public final void rule__OtherName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1614:1: ( ( KEYWORD_58 ) | ( KEYWORD_73 ) | ( KEYWORD_40 ) | ( KEYWORD_80 ) | ( KEYWORD_30 ) | ( KEYWORD_65 ) | ( KEYWORD_47 ) | ( KEYWORD_74 ) | ( KEYWORD_48 ) | ( KEYWORD_66 ) | ( KEYWORD_60 ) | ( KEYWORD_83 ) | ( KEYWORD_49 ) | ( KEYWORD_81 ) | ( KEYWORD_67 ) | ( KEYWORD_41 ) | ( KEYWORD_78 ) | ( KEYWORD_61 ) | ( KEYWORD_87 ) | ( KEYWORD_50 ) | ( KEYWORD_27 ) | ( KEYWORD_51 ) | ( KEYWORD_75 ) | ( KEYWORD_52 ) | ( KEYWORD_68 ) | ( KEYWORD_76 ) | ( KEYWORD_31 ) | ( KEYWORD_32 ) | ( KEYWORD_33 ) | ( KEYWORD_28 ) | ( KEYWORD_69 ) | ( KEYWORD_70 ) | ( KEYWORD_54 ) | ( KEYWORD_34 ) | ( KEYWORD_71 ) | ( KEYWORD_42 ) | ( KEYWORD_63 ) | ( KEYWORD_72 ) | ( KEYWORD_55 ) | ( KEYWORD_56 ) | ( KEYWORD_35 ) | ( KEYWORD_57 ) | ( KEYWORD_43 ) | ( KEYWORD_79 ) | ( KEYWORD_29 ) | ( KEYWORD_84 ) | ( KEYWORD_36 ) | ( KEYWORD_85 ) | ( KEYWORD_86 ) | ( KEYWORD_44 ) | ( KEYWORD_37 ) | ( KEYWORD_45 ) | ( KEYWORD_77 ) | ( KEYWORD_38 ) | ( KEYWORD_46 ) | ( KEYWORD_39 ) )
            int alt12=56;
            switch ( input.LA(1) ) {
            case KEYWORD_58:
                {
                alt12=1;
                }
                break;
            case KEYWORD_73:
                {
                alt12=2;
                }
                break;
            case KEYWORD_40:
                {
                alt12=3;
                }
                break;
            case KEYWORD_80:
                {
                alt12=4;
                }
                break;
            case KEYWORD_30:
                {
                alt12=5;
                }
                break;
            case KEYWORD_65:
                {
                alt12=6;
                }
                break;
            case KEYWORD_47:
                {
                alt12=7;
                }
                break;
            case KEYWORD_74:
                {
                alt12=8;
                }
                break;
            case KEYWORD_48:
                {
                alt12=9;
                }
                break;
            case KEYWORD_66:
                {
                alt12=10;
                }
                break;
            case KEYWORD_60:
                {
                alt12=11;
                }
                break;
            case KEYWORD_83:
                {
                alt12=12;
                }
                break;
            case KEYWORD_49:
                {
                alt12=13;
                }
                break;
            case KEYWORD_81:
                {
                alt12=14;
                }
                break;
            case KEYWORD_67:
                {
                alt12=15;
                }
                break;
            case KEYWORD_41:
                {
                alt12=16;
                }
                break;
            case KEYWORD_78:
                {
                alt12=17;
                }
                break;
            case KEYWORD_61:
                {
                alt12=18;
                }
                break;
            case KEYWORD_87:
                {
                alt12=19;
                }
                break;
            case KEYWORD_50:
                {
                alt12=20;
                }
                break;
            case KEYWORD_27:
                {
                alt12=21;
                }
                break;
            case KEYWORD_51:
                {
                alt12=22;
                }
                break;
            case KEYWORD_75:
                {
                alt12=23;
                }
                break;
            case KEYWORD_52:
                {
                alt12=24;
                }
                break;
            case KEYWORD_68:
                {
                alt12=25;
                }
                break;
            case KEYWORD_76:
                {
                alt12=26;
                }
                break;
            case KEYWORD_31:
                {
                alt12=27;
                }
                break;
            case KEYWORD_32:
                {
                alt12=28;
                }
                break;
            case KEYWORD_33:
                {
                alt12=29;
                }
                break;
            case KEYWORD_28:
                {
                alt12=30;
                }
                break;
            case KEYWORD_69:
                {
                alt12=31;
                }
                break;
            case KEYWORD_70:
                {
                alt12=32;
                }
                break;
            case KEYWORD_54:
                {
                alt12=33;
                }
                break;
            case KEYWORD_34:
                {
                alt12=34;
                }
                break;
            case KEYWORD_71:
                {
                alt12=35;
                }
                break;
            case KEYWORD_42:
                {
                alt12=36;
                }
                break;
            case KEYWORD_63:
                {
                alt12=37;
                }
                break;
            case KEYWORD_72:
                {
                alt12=38;
                }
                break;
            case KEYWORD_55:
                {
                alt12=39;
                }
                break;
            case KEYWORD_56:
                {
                alt12=40;
                }
                break;
            case KEYWORD_35:
                {
                alt12=41;
                }
                break;
            case KEYWORD_57:
                {
                alt12=42;
                }
                break;
            case KEYWORD_43:
                {
                alt12=43;
                }
                break;
            case KEYWORD_79:
                {
                alt12=44;
                }
                break;
            case KEYWORD_29:
                {
                alt12=45;
                }
                break;
            case KEYWORD_84:
                {
                alt12=46;
                }
                break;
            case KEYWORD_36:
                {
                alt12=47;
                }
                break;
            case KEYWORD_85:
                {
                alt12=48;
                }
                break;
            case KEYWORD_86:
                {
                alt12=49;
                }
                break;
            case KEYWORD_44:
                {
                alt12=50;
                }
                break;
            case KEYWORD_37:
                {
                alt12=51;
                }
                break;
            case KEYWORD_45:
                {
                alt12=52;
                }
                break;
            case KEYWORD_77:
                {
                alt12=53;
                }
                break;
            case KEYWORD_38:
                {
                alt12=54;
                }
                break;
            case KEYWORD_46:
                {
                alt12=55;
                }
                break;
            case KEYWORD_39:
                {
                alt12=56;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("1610:1: rule__OtherName__Alternatives : ( ( KEYWORD_58 ) | ( KEYWORD_73 ) | ( KEYWORD_40 ) | ( KEYWORD_80 ) | ( KEYWORD_30 ) | ( KEYWORD_65 ) | ( KEYWORD_47 ) | ( KEYWORD_74 ) | ( KEYWORD_48 ) | ( KEYWORD_66 ) | ( KEYWORD_60 ) | ( KEYWORD_83 ) | ( KEYWORD_49 ) | ( KEYWORD_81 ) | ( KEYWORD_67 ) | ( KEYWORD_41 ) | ( KEYWORD_78 ) | ( KEYWORD_61 ) | ( KEYWORD_87 ) | ( KEYWORD_50 ) | ( KEYWORD_27 ) | ( KEYWORD_51 ) | ( KEYWORD_75 ) | ( KEYWORD_52 ) | ( KEYWORD_68 ) | ( KEYWORD_76 ) | ( KEYWORD_31 ) | ( KEYWORD_32 ) | ( KEYWORD_33 ) | ( KEYWORD_28 ) | ( KEYWORD_69 ) | ( KEYWORD_70 ) | ( KEYWORD_54 ) | ( KEYWORD_34 ) | ( KEYWORD_71 ) | ( KEYWORD_42 ) | ( KEYWORD_63 ) | ( KEYWORD_72 ) | ( KEYWORD_55 ) | ( KEYWORD_56 ) | ( KEYWORD_35 ) | ( KEYWORD_57 ) | ( KEYWORD_43 ) | ( KEYWORD_79 ) | ( KEYWORD_29 ) | ( KEYWORD_84 ) | ( KEYWORD_36 ) | ( KEYWORD_85 ) | ( KEYWORD_86 ) | ( KEYWORD_44 ) | ( KEYWORD_37 ) | ( KEYWORD_45 ) | ( KEYWORD_77 ) | ( KEYWORD_38 ) | ( KEYWORD_46 ) | ( KEYWORD_39 ) );", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1615:1: ( KEYWORD_58 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1615:1: ( KEYWORD_58 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1616:1: KEYWORD_58
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getAcceptsKeyword_0()); 
                    }
                    match(input,KEYWORD_58,FOLLOW_KEYWORD_58_in_rule__OtherName__Alternatives3380); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getAcceptsKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1623:6: ( KEYWORD_73 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1623:6: ( KEYWORD_73 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1624:1: KEYWORD_73
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getAddlyricsKeyword_1()); 
                    }
                    match(input,KEYWORD_73,FOLLOW_KEYWORD_73_in_rule__OtherName__Alternatives3400); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getAddlyricsKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1631:6: ( KEYWORD_40 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1631:6: ( KEYWORD_40 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1632:1: KEYWORD_40
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getAliasKeyword_2()); 
                    }
                    match(input,KEYWORD_40,FOLLOW_KEYWORD_40_in_rule__OtherName__Alternatives3420); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getAliasKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1639:6: ( KEYWORD_80 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1639:6: ( KEYWORD_80 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1640:1: KEYWORD_80
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getAlternativeKeyword_3()); 
                    }
                    match(input,KEYWORD_80,FOLLOW_KEYWORD_80_in_rule__OtherName__Alternatives3440); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getAlternativeKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1647:6: ( KEYWORD_30 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1647:6: ( KEYWORD_30 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1648:1: KEYWORD_30
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getBookKeyword_4()); 
                    }
                    match(input,KEYWORD_30,FOLLOW_KEYWORD_30_in_rule__OtherName__Alternatives3460); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getBookKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1655:6: ( KEYWORD_65 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1655:6: ( KEYWORD_65 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1656:1: KEYWORD_65
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getBookpartKeyword_5()); 
                    }
                    match(input,KEYWORD_65,FOLLOW_KEYWORD_65_in_rule__OtherName__Alternatives3480); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getBookpartKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1663:6: ( KEYWORD_47 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1663:6: ( KEYWORD_47 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1664:1: KEYWORD_47
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getChangeKeyword_6()); 
                    }
                    match(input,KEYWORD_47,FOLLOW_KEYWORD_47_in_rule__OtherName__Alternatives3500); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getChangeKeyword_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1671:6: ( KEYWORD_74 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1671:6: ( KEYWORD_74 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1672:1: KEYWORD_74
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getChordmodeKeyword_7()); 
                    }
                    match(input,KEYWORD_74,FOLLOW_KEYWORD_74_in_rule__OtherName__Alternatives3520); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getChordmodeKeyword_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1679:6: ( KEYWORD_48 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1679:6: ( KEYWORD_48 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1680:1: KEYWORD_48
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getChordsKeyword_8()); 
                    }
                    match(input,KEYWORD_48,FOLLOW_KEYWORD_48_in_rule__OtherName__Alternatives3540); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getChordsKeyword_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1687:6: ( KEYWORD_66 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1687:6: ( KEYWORD_66 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1688:1: KEYWORD_66
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getConsistsKeyword_9()); 
                    }
                    match(input,KEYWORD_66,FOLLOW_KEYWORD_66_in_rule__OtherName__Alternatives3560); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getConsistsKeyword_9()); 
                    }

                    }


                    }
                    break;
                case 11 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1695:6: ( KEYWORD_60 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1695:6: ( KEYWORD_60 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1696:1: KEYWORD_60
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getDefaultKeyword_10()); 
                    }
                    match(input,KEYWORD_60,FOLLOW_KEYWORD_60_in_rule__OtherName__Alternatives3580); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getDefaultKeyword_10()); 
                    }

                    }


                    }
                    break;
                case 12 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1703:6: ( KEYWORD_83 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1703:6: ( KEYWORD_83 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1704:1: KEYWORD_83
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getDefaultchildKeyword_11()); 
                    }
                    match(input,KEYWORD_83,FOLLOW_KEYWORD_83_in_rule__OtherName__Alternatives3600); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getDefaultchildKeyword_11()); 
                    }

                    }


                    }
                    break;
                case 13 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1711:6: ( KEYWORD_49 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1711:6: ( KEYWORD_49 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1712:1: KEYWORD_49
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getDeniesKeyword_12()); 
                    }
                    match(input,KEYWORD_49,FOLLOW_KEYWORD_49_in_rule__OtherName__Alternatives3620); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getDeniesKeyword_12()); 
                    }

                    }


                    }
                    break;
                case 14 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1719:6: ( KEYWORD_81 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1719:6: ( KEYWORD_81 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1720:1: KEYWORD_81
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getDescriptionKeyword_13()); 
                    }
                    match(input,KEYWORD_81,FOLLOW_KEYWORD_81_in_rule__OtherName__Alternatives3640); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getDescriptionKeyword_13()); 
                    }

                    }


                    }
                    break;
                case 15 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1727:6: ( KEYWORD_67 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1727:6: ( KEYWORD_67 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1728:1: KEYWORD_67
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getDrummodeKeyword_14()); 
                    }
                    match(input,KEYWORD_67,FOLLOW_KEYWORD_67_in_rule__OtherName__Alternatives3660); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getDrummodeKeyword_14()); 
                    }

                    }


                    }
                    break;
                case 16 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1735:6: ( KEYWORD_41 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1735:6: ( KEYWORD_41 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1736:1: KEYWORD_41
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getDrumsKeyword_15()); 
                    }
                    match(input,KEYWORD_41,FOLLOW_KEYWORD_41_in_rule__OtherName__Alternatives3680); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getDrumsKeyword_15()); 
                    }

                    }


                    }
                    break;
                case 17 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1743:6: ( KEYWORD_78 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1743:6: ( KEYWORD_78 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1744:1: KEYWORD_78
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getFiguremodeKeyword_16()); 
                    }
                    match(input,KEYWORD_78,FOLLOW_KEYWORD_78_in_rule__OtherName__Alternatives3700); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getFiguremodeKeyword_16()); 
                    }

                    }


                    }
                    break;
                case 18 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1751:6: ( KEYWORD_61 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1751:6: ( KEYWORD_61 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1752:1: KEYWORD_61
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getFiguresKeyword_17()); 
                    }
                    match(input,KEYWORD_61,FOLLOW_KEYWORD_61_in_rule__OtherName__Alternatives3720); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getFiguresKeyword_17()); 
                    }

                    }


                    }
                    break;
                case 19 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1759:6: ( KEYWORD_87 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1759:6: ( KEYWORD_87 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1760:1: KEYWORD_87
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getGrobdescriptionsKeyword_18()); 
                    }
                    match(input,KEYWORD_87,FOLLOW_KEYWORD_87_in_rule__OtherName__Alternatives3740); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getGrobdescriptionsKeyword_18()); 
                    }

                    }


                    }
                    break;
                case 20 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1767:6: ( KEYWORD_50 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1767:6: ( KEYWORD_50 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1768:1: KEYWORD_50
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getHeaderKeyword_19()); 
                    }
                    match(input,KEYWORD_50,FOLLOW_KEYWORD_50_in_rule__OtherName__Alternatives3760); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getHeaderKeyword_19()); 
                    }

                    }


                    }
                    break;
                case 21 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1775:6: ( KEYWORD_27 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1775:6: ( KEYWORD_27 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1776:1: KEYWORD_27
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getKeyKeyword_20()); 
                    }
                    match(input,KEYWORD_27,FOLLOW_KEYWORD_27_in_rule__OtherName__Alternatives3780); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getKeyKeyword_20()); 
                    }

                    }


                    }
                    break;
                case 22 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1783:6: ( KEYWORD_51 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1783:6: ( KEYWORD_51 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1784:1: KEYWORD_51
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getLayoutKeyword_21()); 
                    }
                    match(input,KEYWORD_51,FOLLOW_KEYWORD_51_in_rule__OtherName__Alternatives3800); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getLayoutKeyword_21()); 
                    }

                    }


                    }
                    break;
                case 23 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1791:6: ( KEYWORD_75 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1791:6: ( KEYWORD_75 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1792:1: KEYWORD_75
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getLyricmodeKeyword_22()); 
                    }
                    match(input,KEYWORD_75,FOLLOW_KEYWORD_75_in_rule__OtherName__Alternatives3820); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getLyricmodeKeyword_22()); 
                    }

                    }


                    }
                    break;
                case 24 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1799:6: ( KEYWORD_52 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1799:6: ( KEYWORD_52 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1800:1: KEYWORD_52
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getLyricsKeyword_23()); 
                    }
                    match(input,KEYWORD_52,FOLLOW_KEYWORD_52_in_rule__OtherName__Alternatives3840); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getLyricsKeyword_23()); 
                    }

                    }


                    }
                    break;
                case 25 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1807:6: ( KEYWORD_68 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1807:6: ( KEYWORD_68 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1808:1: KEYWORD_68
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getLyricstoKeyword_24()); 
                    }
                    match(input,KEYWORD_68,FOLLOW_KEYWORD_68_in_rule__OtherName__Alternatives3860); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getLyricstoKeyword_24()); 
                    }

                    }


                    }
                    break;
                case 26 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1815:6: ( KEYWORD_76 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1815:6: ( KEYWORD_76 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1816:1: KEYWORD_76
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getMaininputKeyword_25()); 
                    }
                    match(input,KEYWORD_76,FOLLOW_KEYWORD_76_in_rule__OtherName__Alternatives3880); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getMaininputKeyword_25()); 
                    }

                    }


                    }
                    break;
                case 27 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1823:6: ( KEYWORD_31 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1823:6: ( KEYWORD_31 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1824:1: KEYWORD_31
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getMarkKeyword_26()); 
                    }
                    match(input,KEYWORD_31,FOLLOW_KEYWORD_31_in_rule__OtherName__Alternatives3900); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getMarkKeyword_26()); 
                    }

                    }


                    }
                    break;
                case 28 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1831:6: ( KEYWORD_32 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1831:6: ( KEYWORD_32 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1832:1: KEYWORD_32
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getMidiKeyword_27()); 
                    }
                    match(input,KEYWORD_32,FOLLOW_KEYWORD_32_in_rule__OtherName__Alternatives3920); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getMidiKeyword_27()); 
                    }

                    }


                    }
                    break;
                case 29 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1839:6: ( KEYWORD_33 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1839:6: ( KEYWORD_33 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1840:1: KEYWORD_33
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getNameKeyword_28()); 
                    }
                    match(input,KEYWORD_33,FOLLOW_KEYWORD_33_in_rule__OtherName__Alternatives3940); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getNameKeyword_28()); 
                    }

                    }


                    }
                    break;
                case 30 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1847:6: ( KEYWORD_28 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1847:6: ( KEYWORD_28 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1848:1: KEYWORD_28
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getNewKeyword_29()); 
                    }
                    match(input,KEYWORD_28,FOLLOW_KEYWORD_28_in_rule__OtherName__Alternatives3960); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getNewKeyword_29()); 
                    }

                    }


                    }
                    break;
                case 31 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1855:6: ( KEYWORD_69 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1855:6: ( KEYWORD_69 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1856:1: KEYWORD_69
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getNotemodeKeyword_30()); 
                    }
                    match(input,KEYWORD_69,FOLLOW_KEYWORD_69_in_rule__OtherName__Alternatives3980); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getNotemodeKeyword_30()); 
                    }

                    }


                    }
                    break;
                case 32 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1863:6: ( KEYWORD_70 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1863:6: ( KEYWORD_70 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1864:1: KEYWORD_70
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getObjectidKeyword_31()); 
                    }
                    match(input,KEYWORD_70,FOLLOW_KEYWORD_70_in_rule__OtherName__Alternatives4000); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getObjectidKeyword_31()); 
                    }

                    }


                    }
                    break;
                case 33 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1871:6: ( KEYWORD_54 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1871:6: ( KEYWORD_54 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1872:1: KEYWORD_54
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getOctaveKeyword_32()); 
                    }
                    match(input,KEYWORD_54,FOLLOW_KEYWORD_54_in_rule__OtherName__Alternatives4020); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getOctaveKeyword_32()); 
                    }

                    }


                    }
                    break;
                case 34 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1879:6: ( KEYWORD_34 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1879:6: ( KEYWORD_34 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1880:1: KEYWORD_34
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getOnceKeyword_33()); 
                    }
                    match(input,KEYWORD_34,FOLLOW_KEYWORD_34_in_rule__OtherName__Alternatives4040); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getOnceKeyword_33()); 
                    }

                    }


                    }
                    break;
                case 35 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1887:6: ( KEYWORD_71 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1887:6: ( KEYWORD_71 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1888:1: KEYWORD_71
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getOverrideKeyword_34()); 
                    }
                    match(input,KEYWORD_71,FOLLOW_KEYWORD_71_in_rule__OtherName__Alternatives4060); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getOverrideKeyword_34()); 
                    }

                    }


                    }
                    break;
                case 36 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1895:6: ( KEYWORD_42 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1895:6: ( KEYWORD_42 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1896:1: KEYWORD_42
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getPaperKeyword_35()); 
                    }
                    match(input,KEYWORD_42,FOLLOW_KEYWORD_42_in_rule__OtherName__Alternatives4080); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getPaperKeyword_35()); 
                    }

                    }


                    }
                    break;
                case 37 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1903:6: ( KEYWORD_63 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1903:6: ( KEYWORD_63 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1904:1: KEYWORD_63
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getPartialKeyword_36()); 
                    }
                    match(input,KEYWORD_63,FOLLOW_KEYWORD_63_in_rule__OtherName__Alternatives4100); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getPartialKeyword_36()); 
                    }

                    }


                    }
                    break;
                case 38 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1911:6: ( KEYWORD_72 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1911:6: ( KEYWORD_72 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1912:1: KEYWORD_72
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getRelativeKeyword_37()); 
                    }
                    match(input,KEYWORD_72,FOLLOW_KEYWORD_72_in_rule__OtherName__Alternatives4120); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getRelativeKeyword_37()); 
                    }

                    }


                    }
                    break;
                case 39 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1919:6: ( KEYWORD_55 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1919:6: ( KEYWORD_55 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1920:1: KEYWORD_55
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getRemoveKeyword_38()); 
                    }
                    match(input,KEYWORD_55,FOLLOW_KEYWORD_55_in_rule__OtherName__Alternatives4140); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getRemoveKeyword_38()); 
                    }

                    }


                    }
                    break;
                case 40 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1927:6: ( KEYWORD_56 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1927:6: ( KEYWORD_56 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1928:1: KEYWORD_56
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getRepeatKeyword_39()); 
                    }
                    match(input,KEYWORD_56,FOLLOW_KEYWORD_56_in_rule__OtherName__Alternatives4160); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getRepeatKeyword_39()); 
                    }

                    }


                    }
                    break;
                case 41 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1935:6: ( KEYWORD_35 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1935:6: ( KEYWORD_35 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1936:1: KEYWORD_35
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getRestKeyword_40()); 
                    }
                    match(input,KEYWORD_35,FOLLOW_KEYWORD_35_in_rule__OtherName__Alternatives4180); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getRestKeyword_40()); 
                    }

                    }


                    }
                    break;
                case 42 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1943:6: ( KEYWORD_57 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1943:6: ( KEYWORD_57 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1944:1: KEYWORD_57
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getRevertKeyword_41()); 
                    }
                    match(input,KEYWORD_57,FOLLOW_KEYWORD_57_in_rule__OtherName__Alternatives4200); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getRevertKeyword_41()); 
                    }

                    }


                    }
                    break;
                case 43 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1951:6: ( KEYWORD_43 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1951:6: ( KEYWORD_43 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1952:1: KEYWORD_43
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getScoreKeyword_42()); 
                    }
                    match(input,KEYWORD_43,FOLLOW_KEYWORD_43_in_rule__OtherName__Alternatives4220); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getScoreKeyword_42()); 
                    }

                    }


                    }
                    break;
                case 44 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1959:6: ( KEYWORD_79 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1959:6: ( KEYWORD_79 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1960:1: KEYWORD_79
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getSequentialKeyword_43()); 
                    }
                    match(input,KEYWORD_79,FOLLOW_KEYWORD_79_in_rule__OtherName__Alternatives4240); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getSequentialKeyword_43()); 
                    }

                    }


                    }
                    break;
                case 45 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1967:6: ( KEYWORD_29 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1967:6: ( KEYWORD_29 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1968:1: KEYWORD_29
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getSetKeyword_44()); 
                    }
                    match(input,KEYWORD_29,FOLLOW_KEYWORD_29_in_rule__OtherName__Alternatives4260); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getSetKeyword_44()); 
                    }

                    }


                    }
                    break;
                case 46 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1975:6: ( KEYWORD_84 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1975:6: ( KEYWORD_84 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1976:1: KEYWORD_84
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getSimultaneousKeyword_45()); 
                    }
                    match(input,KEYWORD_84,FOLLOW_KEYWORD_84_in_rule__OtherName__Alternatives4280); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getSimultaneousKeyword_45()); 
                    }

                    }


                    }
                    break;
                case 47 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1983:6: ( KEYWORD_36 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1983:6: ( KEYWORD_36 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1984:1: KEYWORD_36
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getSkipKeyword_46()); 
                    }
                    match(input,KEYWORD_36,FOLLOW_KEYWORD_36_in_rule__OtherName__Alternatives4300); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getSkipKeyword_46()); 
                    }

                    }


                    }
                    break;
                case 48 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1991:6: ( KEYWORD_85 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1991:6: ( KEYWORD_85 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1992:1: KEYWORD_85
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getSourcefilelineKeyword_47()); 
                    }
                    match(input,KEYWORD_85,FOLLOW_KEYWORD_85_in_rule__OtherName__Alternatives4320); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getSourcefilelineKeyword_47()); 
                    }

                    }


                    }
                    break;
                case 49 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1999:6: ( KEYWORD_86 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1999:6: ( KEYWORD_86 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2000:1: KEYWORD_86
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getSourcefilenameKeyword_48()); 
                    }
                    match(input,KEYWORD_86,FOLLOW_KEYWORD_86_in_rule__OtherName__Alternatives4340); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getSourcefilenameKeyword_48()); 
                    }

                    }


                    }
                    break;
                case 50 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2007:6: ( KEYWORD_44 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2007:6: ( KEYWORD_44 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2008:1: KEYWORD_44
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getTempoKeyword_49()); 
                    }
                    match(input,KEYWORD_44,FOLLOW_KEYWORD_44_in_rule__OtherName__Alternatives4360); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getTempoKeyword_49()); 
                    }

                    }


                    }
                    break;
                case 51 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2015:6: ( KEYWORD_37 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2015:6: ( KEYWORD_37 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2016:1: KEYWORD_37
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getTimeKeyword_50()); 
                    }
                    match(input,KEYWORD_37,FOLLOW_KEYWORD_37_in_rule__OtherName__Alternatives4380); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getTimeKeyword_50()); 
                    }

                    }


                    }
                    break;
                case 52 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2023:6: ( KEYWORD_45 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2023:6: ( KEYWORD_45 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2024:1: KEYWORD_45
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getTimesKeyword_51()); 
                    }
                    match(input,KEYWORD_45,FOLLOW_KEYWORD_45_in_rule__OtherName__Alternatives4400); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getTimesKeyword_51()); 
                    }

                    }


                    }
                    break;
                case 53 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2031:6: ( KEYWORD_77 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2031:6: ( KEYWORD_77 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2032:1: KEYWORD_77
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getTransposeKeyword_52()); 
                    }
                    match(input,KEYWORD_77,FOLLOW_KEYWORD_77_in_rule__OtherName__Alternatives4420); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getTransposeKeyword_52()); 
                    }

                    }


                    }
                    break;
                case 54 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2039:6: ( KEYWORD_38 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2039:6: ( KEYWORD_38 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2040:1: KEYWORD_38
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getTypeKeyword_53()); 
                    }
                    match(input,KEYWORD_38,FOLLOW_KEYWORD_38_in_rule__OtherName__Alternatives4440); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getTypeKeyword_53()); 
                    }

                    }


                    }
                    break;
                case 55 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2047:6: ( KEYWORD_46 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2047:6: ( KEYWORD_46 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2048:1: KEYWORD_46
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getUnsetKeyword_54()); 
                    }
                    match(input,KEYWORD_46,FOLLOW_KEYWORD_46_in_rule__OtherName__Alternatives4460); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getOtherNameAccess().getUnsetKeyword_54()); 
                    }

                    }


                    }
                    break;
                case 56 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2055:6: ( KEYWORD_39 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2055:6: ( KEYWORD_39 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2056:1: KEYWORD_39
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getOtherNameAccess().getWithKeyword_55()); 
                    }
                    match(input,KEYWORD_39,FOLLOW_KEYWORD_39_in_rule__OtherName__Alternatives4480); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2068:1: rule__SpecialCommandName__Alternatives : ( ( KEYWORD_62 ) | ( KEYWORD_64 ) | ( KEYWORD_53 ) | ( KEYWORD_82 ) | ( KEYWORD_59 ) | ( ruleOtherName ) );
    public final void rule__SpecialCommandName__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2072:1: ( ( KEYWORD_62 ) | ( KEYWORD_64 ) | ( KEYWORD_53 ) | ( KEYWORD_82 ) | ( KEYWORD_59 ) | ( ruleOtherName ) )
            int alt13=6;
            switch ( input.LA(1) ) {
            case KEYWORD_62:
                {
                alt13=1;
                }
                break;
            case KEYWORD_64:
                {
                alt13=2;
                }
                break;
            case KEYWORD_53:
                {
                alt13=3;
                }
                break;
            case KEYWORD_82:
                {
                alt13=4;
                }
                break;
            case KEYWORD_59:
                {
                alt13=5;
                }
                break;
            case KEYWORD_87:
            case KEYWORD_85:
            case KEYWORD_86:
            case KEYWORD_83:
            case KEYWORD_84:
            case KEYWORD_80:
            case KEYWORD_81:
            case KEYWORD_78:
            case KEYWORD_79:
            case KEYWORD_73:
            case KEYWORD_74:
            case KEYWORD_75:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_65:
            case KEYWORD_66:
            case KEYWORD_67:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_58:
            case KEYWORD_60:
            case KEYWORD_61:
            case KEYWORD_63:
            case KEYWORD_47:
            case KEYWORD_48:
            case KEYWORD_49:
            case KEYWORD_50:
            case KEYWORD_51:
            case KEYWORD_52:
            case KEYWORD_54:
            case KEYWORD_55:
            case KEYWORD_56:
            case KEYWORD_57:
            case KEYWORD_40:
            case KEYWORD_41:
            case KEYWORD_42:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_30:
            case KEYWORD_31:
            case KEYWORD_32:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_27:
            case KEYWORD_28:
            case KEYWORD_29:
                {
                alt13=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("2068:1: rule__SpecialCommandName__Alternatives : ( ( KEYWORD_62 ) | ( KEYWORD_64 ) | ( KEYWORD_53 ) | ( KEYWORD_82 ) | ( KEYWORD_59 ) | ( ruleOtherName ) );", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2073:1: ( KEYWORD_62 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2073:1: ( KEYWORD_62 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2074:1: KEYWORD_62
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCommandNameAccess().getIncludeKeyword_0()); 
                    }
                    match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_rule__SpecialCommandName__Alternatives4515); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSpecialCommandNameAccess().getIncludeKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2081:6: ( KEYWORD_64 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2081:6: ( KEYWORD_64 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2082:1: KEYWORD_64
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCommandNameAccess().getVersionKeyword_1()); 
                    }
                    match(input,KEYWORD_64,FOLLOW_KEYWORD_64_in_rule__SpecialCommandName__Alternatives4535); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSpecialCommandNameAccess().getVersionKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2089:6: ( KEYWORD_53 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2089:6: ( KEYWORD_53 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2090:1: KEYWORD_53
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCommandNameAccess().getMarkupKeyword_2()); 
                    }
                    match(input,KEYWORD_53,FOLLOW_KEYWORD_53_in_rule__SpecialCommandName__Alternatives4555); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSpecialCommandNameAccess().getMarkupKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2097:6: ( KEYWORD_82 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2097:6: ( KEYWORD_82 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2098:1: KEYWORD_82
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCommandNameAccess().getMarkuplinesKeyword_3()); 
                    }
                    match(input,KEYWORD_82,FOLLOW_KEYWORD_82_in_rule__SpecialCommandName__Alternatives4575); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSpecialCommandNameAccess().getMarkuplinesKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2105:6: ( KEYWORD_59 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2105:6: ( KEYWORD_59 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2106:1: KEYWORD_59
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCommandNameAccess().getContextKeyword_4()); 
                    }
                    match(input,KEYWORD_59,FOLLOW_KEYWORD_59_in_rule__SpecialCommandName__Alternatives4595); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSpecialCommandNameAccess().getContextKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2113:6: ( ruleOtherName )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2113:6: ( ruleOtherName )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2114:1: ruleOtherName
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCommandNameAccess().getOtherNameParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleOtherName_in_rule__SpecialCommandName__Alternatives4614);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2124:1: rule__SpecialCharacter__Alternatives : ( ( KEYWORD_1 ) | ( KEYWORD_7 ) | ( KEYWORD_10 ) | ( KEYWORD_12 ) | ( KEYWORD_13 ) | ( KEYWORD_15 ) | ( KEYWORD_19 ) );
    public final void rule__SpecialCharacter__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2128:1: ( ( KEYWORD_1 ) | ( KEYWORD_7 ) | ( KEYWORD_10 ) | ( KEYWORD_12 ) | ( KEYWORD_13 ) | ( KEYWORD_15 ) | ( KEYWORD_19 ) )
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
            case KEYWORD_10:
                {
                alt14=3;
                }
                break;
            case KEYWORD_12:
                {
                alt14=4;
                }
                break;
            case KEYWORD_13:
                {
                alt14=5;
                }
                break;
            case KEYWORD_15:
                {
                alt14=6;
                }
                break;
            case KEYWORD_19:
                {
                alt14=7;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("2124:1: rule__SpecialCharacter__Alternatives : ( ( KEYWORD_1 ) | ( KEYWORD_7 ) | ( KEYWORD_10 ) | ( KEYWORD_12 ) | ( KEYWORD_13 ) | ( KEYWORD_15 ) | ( KEYWORD_19 ) );", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2129:1: ( KEYWORD_1 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2129:1: ( KEYWORD_1 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2130:1: KEYWORD_1
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCharacterAccess().getExclamationMarkKeyword_0()); 
                    }
                    match(input,KEYWORD_1,FOLLOW_KEYWORD_1_in_rule__SpecialCharacter__Alternatives4647); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSpecialCharacterAccess().getExclamationMarkKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2137:6: ( KEYWORD_7 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2137:6: ( KEYWORD_7 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2138:1: KEYWORD_7
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCharacterAccess().getPlusSignKeyword_1()); 
                    }
                    match(input,KEYWORD_7,FOLLOW_KEYWORD_7_in_rule__SpecialCharacter__Alternatives4667); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSpecialCharacterAccess().getPlusSignKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2145:6: ( KEYWORD_10 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2145:6: ( KEYWORD_10 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2146:1: KEYWORD_10
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCharacterAccess().getLessThanSignKeyword_2()); 
                    }
                    match(input,KEYWORD_10,FOLLOW_KEYWORD_10_in_rule__SpecialCharacter__Alternatives4687); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSpecialCharacterAccess().getLessThanSignKeyword_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2153:6: ( KEYWORD_12 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2153:6: ( KEYWORD_12 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2154:1: KEYWORD_12
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCharacterAccess().getGreaterThanSignKeyword_3()); 
                    }
                    match(input,KEYWORD_12,FOLLOW_KEYWORD_12_in_rule__SpecialCharacter__Alternatives4707); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSpecialCharacterAccess().getGreaterThanSignKeyword_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2161:6: ( KEYWORD_13 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2161:6: ( KEYWORD_13 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2162:1: KEYWORD_13
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCharacterAccess().getLeftSquareBracketKeyword_4()); 
                    }
                    match(input,KEYWORD_13,FOLLOW_KEYWORD_13_in_rule__SpecialCharacter__Alternatives4727); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSpecialCharacterAccess().getLeftSquareBracketKeyword_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2169:6: ( KEYWORD_15 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2169:6: ( KEYWORD_15 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2170:1: KEYWORD_15
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCharacterAccess().getRightSquareBracketKeyword_5()); 
                    }
                    match(input,KEYWORD_15,FOLLOW_KEYWORD_15_in_rule__SpecialCharacter__Alternatives4747); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSpecialCharacterAccess().getRightSquareBracketKeyword_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2177:6: ( KEYWORD_19 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2177:6: ( KEYWORD_19 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2178:1: KEYWORD_19
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSpecialCharacterAccess().getTildeKeyword_6()); 
                    }
                    match(input,KEYWORD_19,FOLLOW_KEYWORD_19_in_rule__SpecialCharacter__Alternatives4767); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2190:1: rule__UnparsedExpression__Alternatives : ( ( ruleUnparsedCommand ) | ( ruleUnparsedBlock ) | ( ruleScheme ) | ( ruleText ) | ( ruleNumber ) );
    public final void rule__UnparsedExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2194:1: ( ( ruleUnparsedCommand ) | ( ruleUnparsedBlock ) | ( ruleScheme ) | ( ruleText ) | ( ruleNumber ) )
            int alt15=5;
            switch ( input.LA(1) ) {
            case KEYWORD_14:
                {
                alt15=1;
                }
                break;
            case KEYWORD_17:
                {
                alt15=2;
                }
                break;
            case KEYWORD_2:
                {
                alt15=3;
                }
                break;
            case KEYWORD_87:
            case KEYWORD_85:
            case KEYWORD_86:
            case KEYWORD_83:
            case KEYWORD_84:
            case KEYWORD_80:
            case KEYWORD_81:
            case KEYWORD_82:
            case KEYWORD_78:
            case KEYWORD_79:
            case KEYWORD_73:
            case KEYWORD_74:
            case KEYWORD_75:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_65:
            case KEYWORD_66:
            case KEYWORD_67:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_58:
            case KEYWORD_59:
            case KEYWORD_60:
            case KEYWORD_61:
            case KEYWORD_62:
            case KEYWORD_63:
            case KEYWORD_64:
            case KEYWORD_47:
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
            case KEYWORD_40:
            case KEYWORD_41:
            case KEYWORD_42:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_30:
            case KEYWORD_31:
            case KEYWORD_32:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_27:
            case KEYWORD_28:
            case KEYWORD_29:
            case KEYWORD_26:
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
            case KEYWORD_15:
            case KEYWORD_19:
            case RULE_STRING:
            case RULE_ID:
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
                    new NoViableAltException("2190:1: rule__UnparsedExpression__Alternatives : ( ( ruleUnparsedCommand ) | ( ruleUnparsedBlock ) | ( ruleScheme ) | ( ruleText ) | ( ruleNumber ) );", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2195:1: ( ruleUnparsedCommand )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2195:1: ( ruleUnparsedCommand )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2196:1: ruleUnparsedCommand
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getUnparsedExpressionAccess().getUnparsedCommandParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleUnparsedCommand_in_rule__UnparsedExpression__Alternatives4801);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2201:6: ( ruleUnparsedBlock )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2201:6: ( ruleUnparsedBlock )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2202:1: ruleUnparsedBlock
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getUnparsedExpressionAccess().getUnparsedBlockParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleUnparsedBlock_in_rule__UnparsedExpression__Alternatives4818);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2207:6: ( ruleScheme )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2207:6: ( ruleScheme )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2208:1: ruleScheme
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getUnparsedExpressionAccess().getSchemeParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleScheme_in_rule__UnparsedExpression__Alternatives4835);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2213:6: ( ruleText )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2213:6: ( ruleText )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2214:1: ruleText
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getUnparsedExpressionAccess().getTextParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleText_in_rule__UnparsedExpression__Alternatives4852);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2219:6: ( ruleNumber )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2219:6: ( ruleNumber )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2220:1: ruleNumber
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getUnparsedExpressionAccess().getNumberParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleNumber_in_rule__UnparsedExpression__Alternatives4869);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2230:1: rule__UnparsedCommand__CommandAlternatives_1_0 : ( ( RULE_ID ) | ( ruleSpecialCommandName ) );
    public final void rule__UnparsedCommand__CommandAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2234:1: ( ( RULE_ID ) | ( ruleSpecialCommandName ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            else if ( ((LA16_0>=KEYWORD_87 && LA16_0<=KEYWORD_29)) ) {
                alt16=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("2230:1: rule__UnparsedCommand__CommandAlternatives_1_0 : ( ( RULE_ID ) | ( ruleSpecialCommandName ) );", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2235:1: ( RULE_ID )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2235:1: ( RULE_ID )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2236:1: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getUnparsedCommandAccess().getCommandIDTerminalRuleCall_1_0_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__UnparsedCommand__CommandAlternatives_1_04901); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getUnparsedCommandAccess().getCommandIDTerminalRuleCall_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2241:6: ( ruleSpecialCommandName )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2241:6: ( ruleSpecialCommandName )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2242:1: ruleSpecialCommandName
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getUnparsedCommandAccess().getCommandSpecialCommandNameParserRuleCall_1_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleSpecialCommandName_in_rule__UnparsedCommand__CommandAlternatives_1_04918);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2252:1: rule__Text__ValueAlternatives_0 : ( ( ruleSchemeTextLiteral ) | ( KEYWORD_5 ) | ( KEYWORD_6 ) | ( KEYWORD_4 ) | ( KEYWORD_8 ) | ( KEYWORD_9 ) );
    public final void rule__Text__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2256:1: ( ( ruleSchemeTextLiteral ) | ( KEYWORD_5 ) | ( KEYWORD_6 ) | ( KEYWORD_4 ) | ( KEYWORD_8 ) | ( KEYWORD_9 ) )
            int alt17=6;
            switch ( input.LA(1) ) {
            case KEYWORD_87:
            case KEYWORD_85:
            case KEYWORD_86:
            case KEYWORD_83:
            case KEYWORD_84:
            case KEYWORD_80:
            case KEYWORD_81:
            case KEYWORD_82:
            case KEYWORD_78:
            case KEYWORD_79:
            case KEYWORD_73:
            case KEYWORD_74:
            case KEYWORD_75:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_65:
            case KEYWORD_66:
            case KEYWORD_67:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_58:
            case KEYWORD_59:
            case KEYWORD_60:
            case KEYWORD_61:
            case KEYWORD_62:
            case KEYWORD_63:
            case KEYWORD_64:
            case KEYWORD_47:
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
            case KEYWORD_40:
            case KEYWORD_41:
            case KEYWORD_42:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_30:
            case KEYWORD_31:
            case KEYWORD_32:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_27:
            case KEYWORD_28:
            case KEYWORD_29:
            case KEYWORD_26:
            case KEYWORD_1:
            case KEYWORD_7:
            case KEYWORD_10:
            case KEYWORD_11:
            case KEYWORD_12:
            case KEYWORD_13:
            case KEYWORD_15:
            case KEYWORD_19:
            case RULE_STRING:
            case RULE_ID:
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
            case KEYWORD_9:
                {
                alt17=6;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("2252:1: rule__Text__ValueAlternatives_0 : ( ( ruleSchemeTextLiteral ) | ( KEYWORD_5 ) | ( KEYWORD_6 ) | ( KEYWORD_4 ) | ( KEYWORD_8 ) | ( KEYWORD_9 ) );", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2257:1: ( ruleSchemeTextLiteral )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2257:1: ( ruleSchemeTextLiteral )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2258:1: ruleSchemeTextLiteral
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTextAccess().getValueSchemeTextLiteralParserRuleCall_0_0()); 
                    }
                    pushFollow(FOLLOW_ruleSchemeTextLiteral_in_rule__Text__ValueAlternatives_04950);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2263:6: ( KEYWORD_5 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2263:6: ( KEYWORD_5 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2264:1: KEYWORD_5
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTextAccess().getValueLeftParenthesisKeyword_0_1()); 
                    }
                    match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_rule__Text__ValueAlternatives_04968); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getTextAccess().getValueLeftParenthesisKeyword_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2271:6: ( KEYWORD_6 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2271:6: ( KEYWORD_6 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2272:1: KEYWORD_6
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTextAccess().getValueRightParenthesisKeyword_0_2()); 
                    }
                    match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_rule__Text__ValueAlternatives_04988); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getTextAccess().getValueRightParenthesisKeyword_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2279:6: ( KEYWORD_4 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2279:6: ( KEYWORD_4 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2280:1: KEYWORD_4
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTextAccess().getValueApostropheKeyword_0_3()); 
                    }
                    match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_rule__Text__ValueAlternatives_05008); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getTextAccess().getValueApostropheKeyword_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2287:6: ( KEYWORD_8 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2287:6: ( KEYWORD_8 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2288:1: KEYWORD_8
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTextAccess().getValueCommaKeyword_0_4()); 
                    }
                    match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_rule__Text__ValueAlternatives_05028); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getTextAccess().getValueCommaKeyword_0_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2295:6: ( KEYWORD_9 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2295:6: ( KEYWORD_9 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2296:1: KEYWORD_9
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getTextAccess().getValueColonKeyword_0_5()); 
                    }
                    match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_rule__Text__ValueAlternatives_05048); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );
    public final void rule__SchemeExpression__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2312:1: ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) )
            int alt21=4;
            switch ( input.LA(1) ) {
            case KEYWORD_4:
                {
                alt21=1;
                }
                break;
            case KEYWORD_2:
                {
                int LA21_2 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 2, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_5:
                {
                int LA21_3 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 3, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_22:
                {
                int LA21_4 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 4, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_21:
                {
                int LA21_5 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 5, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_26:
                {
                int LA21_6 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 6, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_11:
                {
                int LA21_7 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 7, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_1:
                {
                int LA21_8 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 8, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_7:
                {
                int LA21_9 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 9, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_10:
                {
                int LA21_10 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 10, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_12:
                {
                int LA21_11 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 11, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_13:
                {
                int LA21_12 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 12, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_15:
                {
                int LA21_13 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 13, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_19:
                {
                int LA21_14 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 14, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_62:
                {
                int LA21_15 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 15, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_64:
                {
                int LA21_16 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 16, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_53:
                {
                int LA21_17 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 17, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_82:
                {
                int LA21_18 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 18, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_59:
                {
                int LA21_19 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 19, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_58:
                {
                int LA21_20 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 20, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_73:
                {
                int LA21_21 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 21, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_40:
                {
                int LA21_22 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 22, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_80:
                {
                int LA21_23 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 23, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_30:
                {
                int LA21_24 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 24, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_65:
                {
                int LA21_25 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 25, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_47:
                {
                int LA21_26 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 26, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_74:
                {
                int LA21_27 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 27, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_48:
                {
                int LA21_28 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 28, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_66:
                {
                int LA21_29 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 29, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_60:
                {
                int LA21_30 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 30, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_83:
                {
                int LA21_31 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 31, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_49:
                {
                int LA21_32 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 32, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_81:
                {
                int LA21_33 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 33, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_67:
                {
                int LA21_34 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 34, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_41:
                {
                int LA21_35 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 35, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_78:
                {
                int LA21_36 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 36, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_61:
                {
                int LA21_37 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 37, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_87:
                {
                int LA21_38 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 38, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_50:
                {
                int LA21_39 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 39, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_27:
                {
                int LA21_40 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 40, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_51:
                {
                int LA21_41 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 41, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_75:
                {
                int LA21_42 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 42, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_52:
                {
                int LA21_43 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 43, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_68:
                {
                int LA21_44 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 44, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_76:
                {
                int LA21_45 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 45, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_31:
                {
                int LA21_46 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 46, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_32:
                {
                int LA21_47 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 47, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_33:
                {
                int LA21_48 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 48, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_28:
                {
                int LA21_49 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 49, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_69:
                {
                int LA21_50 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 50, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_70:
                {
                int LA21_51 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 51, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_54:
                {
                int LA21_52 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 52, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_34:
                {
                int LA21_53 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 53, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_71:
                {
                int LA21_54 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 54, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_42:
                {
                int LA21_55 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 55, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_63:
                {
                int LA21_56 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 56, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_72:
                {
                int LA21_57 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 57, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_55:
                {
                int LA21_58 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 58, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_56:
                {
                int LA21_59 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 59, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_35:
                {
                int LA21_60 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 60, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_57:
                {
                int LA21_61 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 61, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_43:
                {
                int LA21_62 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 62, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_79:
                {
                int LA21_63 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 63, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_29:
                {
                int LA21_64 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 64, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_84:
                {
                int LA21_65 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 65, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_36:
                {
                int LA21_66 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 66, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_85:
                {
                int LA21_67 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 67, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_86:
                {
                int LA21_68 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 68, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_44:
                {
                int LA21_69 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 69, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_37:
                {
                int LA21_70 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 70, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_45:
                {
                int LA21_71 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 71, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_77:
                {
                int LA21_72 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 72, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_38:
                {
                int LA21_73 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 73, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_46:
                {
                int LA21_74 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 74, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_39:
                {
                int LA21_75 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 75, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ID:
                {
                int LA21_76 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 76, input);

                    throw nvae;
                }
                }
                break;
            case RULE_STRING:
                {
                int LA21_77 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 77, input);

                    throw nvae;
                }
                }
                break;
            case RULE_ANY_OTHER:
                {
                int LA21_78 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 78, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA21_79 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 79, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_20:
                {
                int LA21_80 = input.LA(2);

                if ( (synpred98()) ) {
                    alt21=1;
                }
                else if ( (synpred100()) ) {
                    alt21=2;
                }
                else if ( (synpred102()) ) {
                    alt21=3;
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 80, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_16:
                {
                alt21=2;
                }
                break;
            case KEYWORD_8:
                {
                alt21=3;
                }
                break;
            case KEYWORD_3:
                {
                alt21=4;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("2308:1: rule__SchemeExpression__Alternatives_0 : ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) | ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) | ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) | ( ( rule__SchemeExpression__VariableAssignment_0_3 ) ) );", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2313:1: ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2313:1: ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2314:1: ( rule__SchemeExpression__QuotedAssignment_0_0 )?
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeExpressionAccess().getQuotedAssignment_0_0()); 
                    }
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2315:1: ( rule__SchemeExpression__QuotedAssignment_0_0 )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==KEYWORD_4) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2315:2: rule__SchemeExpression__QuotedAssignment_0_0
                            {
                            pushFollow(FOLLOW_rule__SchemeExpression__QuotedAssignment_0_0_in_rule__SchemeExpression__Alternatives_05082);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2319:6: ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2319:6: ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2320:1: ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )?
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeExpressionAccess().getQuasiquotedAssignment_0_1()); 
                    }
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2321:1: ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==KEYWORD_16) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2321:2: rule__SchemeExpression__QuasiquotedAssignment_0_1
                            {
                            pushFollow(FOLLOW_rule__SchemeExpression__QuasiquotedAssignment_0_1_in_rule__SchemeExpression__Alternatives_05101);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2325:6: ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2325:6: ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2326:1: ( rule__SchemeExpression__UnquotedAssignment_0_2 )?
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeExpressionAccess().getUnquotedAssignment_0_2()); 
                    }
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2327:1: ( rule__SchemeExpression__UnquotedAssignment_0_2 )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==KEYWORD_8) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2327:2: rule__SchemeExpression__UnquotedAssignment_0_2
                            {
                            pushFollow(FOLLOW_rule__SchemeExpression__UnquotedAssignment_0_2_in_rule__SchemeExpression__Alternatives_05120);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2331:6: ( ( rule__SchemeExpression__VariableAssignment_0_3 ) )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2331:6: ( ( rule__SchemeExpression__VariableAssignment_0_3 ) )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2332:1: ( rule__SchemeExpression__VariableAssignment_0_3 )
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeExpressionAccess().getVariableAssignment_0_3()); 
                    }
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2333:1: ( rule__SchemeExpression__VariableAssignment_0_3 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2333:2: rule__SchemeExpression__VariableAssignment_0_3
                    {
                    pushFollow(FOLLOW_rule__SchemeExpression__VariableAssignment_0_3_in_rule__SchemeExpression__Alternatives_05139);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2342:1: rule__SchemeValue__Alternatives : ( ( ruleSchemeBoolean ) | ( ruleSchemeList ) | ( ruleSchemeBlock ) | ( ruleSchemeCharacter ) | ( ruleSchemeText ) | ( ruleSchemeNumber ) | ( ruleSchemeMarkupCommand ) );
    public final void rule__SchemeValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2346:1: ( ( ruleSchemeBoolean ) | ( ruleSchemeList ) | ( ruleSchemeBlock ) | ( ruleSchemeCharacter ) | ( ruleSchemeText ) | ( ruleSchemeNumber ) | ( ruleSchemeMarkupCommand ) )
            int alt22=7;
            switch ( input.LA(1) ) {
            case KEYWORD_2:
                {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==KEYWORD_5) ) {
                    alt22=2;
                }
                else if ( (LA22_1==RULE_ID) ) {
                    int LA22_8 = input.LA(3);

                    if ( (synpred103()) ) {
                        alt22=1;
                    }
                    else if ( (synpred108()) ) {
                        alt22=6;
                    }
                    else {
                        if (backtracking>0) {failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("2342:1: rule__SchemeValue__Alternatives : ( ( ruleSchemeBoolean ) | ( ruleSchemeList ) | ( ruleSchemeBlock ) | ( ruleSchemeCharacter ) | ( ruleSchemeText ) | ( ruleSchemeNumber ) | ( ruleSchemeMarkupCommand ) );", 22, 8, input);

                        throw nvae;
                    }
                }
                else {
                    if (backtracking>0) {failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("2342:1: rule__SchemeValue__Alternatives : ( ( ruleSchemeBoolean ) | ( ruleSchemeList ) | ( ruleSchemeBlock ) | ( ruleSchemeCharacter ) | ( ruleSchemeText ) | ( ruleSchemeNumber ) | ( ruleSchemeMarkupCommand ) );", 22, 1, input);

                    throw nvae;
                }
                }
                break;
            case KEYWORD_5:
                {
                alt22=2;
                }
                break;
            case KEYWORD_22:
                {
                alt22=3;
                }
                break;
            case KEYWORD_21:
                {
                alt22=4;
                }
                break;
            case KEYWORD_87:
            case KEYWORD_85:
            case KEYWORD_86:
            case KEYWORD_83:
            case KEYWORD_84:
            case KEYWORD_80:
            case KEYWORD_81:
            case KEYWORD_82:
            case KEYWORD_78:
            case KEYWORD_79:
            case KEYWORD_73:
            case KEYWORD_74:
            case KEYWORD_75:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_65:
            case KEYWORD_66:
            case KEYWORD_67:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_58:
            case KEYWORD_59:
            case KEYWORD_60:
            case KEYWORD_61:
            case KEYWORD_62:
            case KEYWORD_63:
            case KEYWORD_64:
            case KEYWORD_47:
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
            case KEYWORD_40:
            case KEYWORD_41:
            case KEYWORD_42:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_30:
            case KEYWORD_31:
            case KEYWORD_32:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_27:
            case KEYWORD_28:
            case KEYWORD_29:
            case KEYWORD_26:
            case KEYWORD_1:
            case KEYWORD_7:
            case KEYWORD_10:
            case KEYWORD_11:
            case KEYWORD_12:
            case KEYWORD_13:
            case KEYWORD_15:
            case KEYWORD_19:
            case RULE_STRING:
            case RULE_ID:
            case RULE_ANY_OTHER:
                {
                alt22=5;
                }
                break;
            case RULE_INT:
                {
                alt22=6;
                }
                break;
            case KEYWORD_20:
                {
                alt22=7;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("2342:1: rule__SchemeValue__Alternatives : ( ( ruleSchemeBoolean ) | ( ruleSchemeList ) | ( ruleSchemeBlock ) | ( ruleSchemeCharacter ) | ( ruleSchemeText ) | ( ruleSchemeNumber ) | ( ruleSchemeMarkupCommand ) );", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2347:1: ( ruleSchemeBoolean )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2347:1: ( ruleSchemeBoolean )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2348:1: ruleSchemeBoolean
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeValueAccess().getSchemeBooleanParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_ruleSchemeBoolean_in_rule__SchemeValue__Alternatives5172);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2353:6: ( ruleSchemeList )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2353:6: ( ruleSchemeList )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2354:1: ruleSchemeList
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeValueAccess().getSchemeListParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_ruleSchemeList_in_rule__SchemeValue__Alternatives5189);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2359:6: ( ruleSchemeBlock )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2359:6: ( ruleSchemeBlock )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2360:1: ruleSchemeBlock
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeValueAccess().getSchemeBlockParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleSchemeBlock_in_rule__SchemeValue__Alternatives5206);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2365:6: ( ruleSchemeCharacter )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2365:6: ( ruleSchemeCharacter )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2366:1: ruleSchemeCharacter
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeValueAccess().getSchemeCharacterParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleSchemeCharacter_in_rule__SchemeValue__Alternatives5223);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2371:6: ( ruleSchemeText )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2371:6: ( ruleSchemeText )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2372:1: ruleSchemeText
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeValueAccess().getSchemeTextParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_ruleSchemeText_in_rule__SchemeValue__Alternatives5240);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2377:6: ( ruleSchemeNumber )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2377:6: ( ruleSchemeNumber )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2378:1: ruleSchemeNumber
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeValueAccess().getSchemeNumberParserRuleCall_5()); 
                    }
                    pushFollow(FOLLOW_ruleSchemeNumber_in_rule__SchemeValue__Alternatives5257);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2383:6: ( ruleSchemeMarkupCommand )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2383:6: ( ruleSchemeMarkupCommand )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2384:1: ruleSchemeMarkupCommand
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeValueAccess().getSchemeMarkupCommandParserRuleCall_6()); 
                    }
                    pushFollow(FOLLOW_ruleSchemeMarkupCommand_in_rule__SchemeValue__Alternatives5274);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2394:1: rule__SchemeCharacter__ValueAlternatives_1_0 : ( ( RULE_ID ) | ( ruleSpecialCharacter ) | ( RULE_ANY_OTHER ) );
    public final void rule__SchemeCharacter__ValueAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2398:1: ( ( RULE_ID ) | ( ruleSpecialCharacter ) | ( RULE_ANY_OTHER ) )
            int alt23=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt23=1;
                }
                break;
            case KEYWORD_1:
            case KEYWORD_7:
            case KEYWORD_10:
            case KEYWORD_12:
            case KEYWORD_13:
            case KEYWORD_15:
            case KEYWORD_19:
                {
                alt23=2;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt23=3;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("2394:1: rule__SchemeCharacter__ValueAlternatives_1_0 : ( ( RULE_ID ) | ( ruleSpecialCharacter ) | ( RULE_ANY_OTHER ) );", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2399:1: ( RULE_ID )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2399:1: ( RULE_ID )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2400:1: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeCharacterAccess().getValueIDTerminalRuleCall_1_0_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SchemeCharacter__ValueAlternatives_1_05306); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeCharacterAccess().getValueIDTerminalRuleCall_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2405:6: ( ruleSpecialCharacter )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2405:6: ( ruleSpecialCharacter )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2406:1: ruleSpecialCharacter
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeCharacterAccess().getValueSpecialCharacterParserRuleCall_1_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleSpecialCharacter_in_rule__SchemeCharacter__ValueAlternatives_1_05323);
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
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2411:6: ( RULE_ANY_OTHER )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2411:6: ( RULE_ANY_OTHER )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2412:1: RULE_ANY_OTHER
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeCharacterAccess().getValueANY_OTHERTerminalRuleCall_1_0_2()); 
                    }
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__SchemeCharacter__ValueAlternatives_1_05340); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2422:1: rule__SchemeTextLiteral__Alternatives : ( ( KEYWORD_26 ) | ( KEYWORD_11 ) | ( ruleSpecialCharacter ) | ( ruleSpecialCommandName ) | ( RULE_ID ) | ( RULE_STRING ) | ( RULE_ANY_OTHER ) );
    public final void rule__SchemeTextLiteral__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2426:1: ( ( KEYWORD_26 ) | ( KEYWORD_11 ) | ( ruleSpecialCharacter ) | ( ruleSpecialCommandName ) | ( RULE_ID ) | ( RULE_STRING ) | ( RULE_ANY_OTHER ) )
            int alt24=7;
            switch ( input.LA(1) ) {
            case KEYWORD_26:
                {
                alt24=1;
                }
                break;
            case KEYWORD_11:
                {
                alt24=2;
                }
                break;
            case KEYWORD_1:
            case KEYWORD_7:
            case KEYWORD_10:
            case KEYWORD_12:
            case KEYWORD_13:
            case KEYWORD_15:
            case KEYWORD_19:
                {
                alt24=3;
                }
                break;
            case KEYWORD_87:
            case KEYWORD_85:
            case KEYWORD_86:
            case KEYWORD_83:
            case KEYWORD_84:
            case KEYWORD_80:
            case KEYWORD_81:
            case KEYWORD_82:
            case KEYWORD_78:
            case KEYWORD_79:
            case KEYWORD_73:
            case KEYWORD_74:
            case KEYWORD_75:
            case KEYWORD_76:
            case KEYWORD_77:
            case KEYWORD_65:
            case KEYWORD_66:
            case KEYWORD_67:
            case KEYWORD_68:
            case KEYWORD_69:
            case KEYWORD_70:
            case KEYWORD_71:
            case KEYWORD_72:
            case KEYWORD_58:
            case KEYWORD_59:
            case KEYWORD_60:
            case KEYWORD_61:
            case KEYWORD_62:
            case KEYWORD_63:
            case KEYWORD_64:
            case KEYWORD_47:
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
            case KEYWORD_40:
            case KEYWORD_41:
            case KEYWORD_42:
            case KEYWORD_43:
            case KEYWORD_44:
            case KEYWORD_45:
            case KEYWORD_46:
            case KEYWORD_30:
            case KEYWORD_31:
            case KEYWORD_32:
            case KEYWORD_33:
            case KEYWORD_34:
            case KEYWORD_35:
            case KEYWORD_36:
            case KEYWORD_37:
            case KEYWORD_38:
            case KEYWORD_39:
            case KEYWORD_27:
            case KEYWORD_28:
            case KEYWORD_29:
                {
                alt24=4;
                }
                break;
            case RULE_ID:
                {
                alt24=5;
                }
                break;
            case RULE_STRING:
                {
                alt24=6;
                }
                break;
            case RULE_ANY_OTHER:
                {
                alt24=7;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("2422:1: rule__SchemeTextLiteral__Alternatives : ( ( KEYWORD_26 ) | ( KEYWORD_11 ) | ( ruleSpecialCharacter ) | ( ruleSpecialCommandName ) | ( RULE_ID ) | ( RULE_STRING ) | ( RULE_ANY_OTHER ) );", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2427:1: ( KEYWORD_26 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2427:1: ( KEYWORD_26 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2428:1: KEYWORD_26
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeTextLiteralAccess().getReverseSolidusReverseSolidusKeyword_0()); 
                    }
                    match(input,KEYWORD_26,FOLLOW_KEYWORD_26_in_rule__SchemeTextLiteral__Alternatives5373); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeTextLiteralAccess().getReverseSolidusReverseSolidusKeyword_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2435:6: ( KEYWORD_11 )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2435:6: ( KEYWORD_11 )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2436:1: KEYWORD_11
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeTextLiteralAccess().getEqualsSignKeyword_1()); 
                    }
                    match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_rule__SchemeTextLiteral__Alternatives5393); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeTextLiteralAccess().getEqualsSignKeyword_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2443:6: ( ruleSpecialCharacter )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2443:6: ( ruleSpecialCharacter )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2444:1: ruleSpecialCharacter
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeTextLiteralAccess().getSpecialCharacterParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_ruleSpecialCharacter_in_rule__SchemeTextLiteral__Alternatives5412);
                    ruleSpecialCharacter();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeTextLiteralAccess().getSpecialCharacterParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2449:6: ( ruleSpecialCommandName )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2449:6: ( ruleSpecialCommandName )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2450:1: ruleSpecialCommandName
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeTextLiteralAccess().getSpecialCommandNameParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_ruleSpecialCommandName_in_rule__SchemeTextLiteral__Alternatives5429);
                    ruleSpecialCommandName();
                    _fsp--;
                    if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeTextLiteralAccess().getSpecialCommandNameParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2455:6: ( RULE_ID )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2455:6: ( RULE_ID )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2456:1: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeTextLiteralAccess().getIDTerminalRuleCall_4()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SchemeTextLiteral__Alternatives5446); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeTextLiteralAccess().getIDTerminalRuleCall_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2461:6: ( RULE_STRING )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2461:6: ( RULE_STRING )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2462:1: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeTextLiteralAccess().getSTRINGTerminalRuleCall_5()); 
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__SchemeTextLiteral__Alternatives5463); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeTextLiteralAccess().getSTRINGTerminalRuleCall_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2467:6: ( RULE_ANY_OTHER )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2467:6: ( RULE_ANY_OTHER )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2468:1: RULE_ANY_OTHER
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeTextLiteralAccess().getANY_OTHERTerminalRuleCall_6()); 
                    }
                    match(input,RULE_ANY_OTHER,FOLLOW_RULE_ANY_OTHER_in_rule__SchemeTextLiteral__Alternatives5480); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeTextLiteralAccess().getANY_OTHERTerminalRuleCall_6()); 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2478:1: rule__SchemeMarkupCommand__CommandAlternatives_1_0 : ( ( RULE_ID ) | ( ruleSpecialCommandName ) );
    public final void rule__SchemeMarkupCommand__CommandAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2482:1: ( ( RULE_ID ) | ( ruleSpecialCommandName ) )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_ID) ) {
                alt25=1;
            }
            else if ( ((LA25_0>=KEYWORD_87 && LA25_0<=KEYWORD_29)) ) {
                alt25=2;
            }
            else {
                if (backtracking>0) {failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("2478:1: rule__SchemeMarkupCommand__CommandAlternatives_1_0 : ( ( RULE_ID ) | ( ruleSpecialCommandName ) );", 25, 0, input);

                throw nvae;
            }
            switch (alt25) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2483:1: ( RULE_ID )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2483:1: ( RULE_ID )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2484:1: RULE_ID
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeMarkupCommandAccess().getCommandIDTerminalRuleCall_1_0_0()); 
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SchemeMarkupCommand__CommandAlternatives_1_05512); if (failed) return ;
                    if ( backtracking==0 ) {
                       after(grammarAccess.getSchemeMarkupCommandAccess().getCommandIDTerminalRuleCall_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2489:6: ( ruleSpecialCommandName )
                    {
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2489:6: ( ruleSpecialCommandName )
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2490:1: ruleSpecialCommandName
                    {
                    if ( backtracking==0 ) {
                       before(grammarAccess.getSchemeMarkupCommandAccess().getCommandSpecialCommandNameParserRuleCall_1_0_1()); 
                    }
                    pushFollow(FOLLOW_ruleSpecialCommandName_in_rule__SchemeMarkupCommand__CommandAlternatives_1_05529);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2502:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2506:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2507:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__05559);
            rule__Assignment__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__05562);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2514:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__NameAssignment_0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2518:1: ( ( ( rule__Assignment__NameAssignment_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2519:1: ( ( rule__Assignment__NameAssignment_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2519:1: ( ( rule__Assignment__NameAssignment_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2520:1: ( rule__Assignment__NameAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getNameAssignment_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2521:1: ( rule__Assignment__NameAssignment_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2521:2: rule__Assignment__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__Assignment__NameAssignment_0_in_rule__Assignment__Group__0__Impl5589);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2531:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2535:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2536:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__15619);
            rule__Assignment__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__15622);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2543:1: rule__Assignment__Group__1__Impl : ( KEYWORD_11 ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2547:1: ( ( KEYWORD_11 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2548:1: ( KEYWORD_11 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2548:1: ( KEYWORD_11 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2549:1: KEYWORD_11
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_1()); 
            }
            match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_rule__Assignment__Group__1__Impl5650); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2562:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2566:1: ( rule__Assignment__Group__2__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2567:2: rule__Assignment__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__25681);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2573:1: rule__Assignment__Group__2__Impl : ( ( rule__Assignment__ValueAssignment_2 ) ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2577:1: ( ( ( rule__Assignment__ValueAssignment_2 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2578:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2578:1: ( ( rule__Assignment__ValueAssignment_2 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2579:1: ( rule__Assignment__ValueAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getValueAssignment_2()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2580:1: ( rule__Assignment__ValueAssignment_2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2580:2: rule__Assignment__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__Assignment__ValueAssignment_2_in_rule__Assignment__Group__2__Impl5708);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2596:1: rule__PropertyAssignment__Group__0 : rule__PropertyAssignment__Group__0__Impl rule__PropertyAssignment__Group__1 ;
    public final void rule__PropertyAssignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2600:1: ( rule__PropertyAssignment__Group__0__Impl rule__PropertyAssignment__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2601:2: rule__PropertyAssignment__Group__0__Impl rule__PropertyAssignment__Group__1
            {
            pushFollow(FOLLOW_rule__PropertyAssignment__Group__0__Impl_in_rule__PropertyAssignment__Group__05744);
            rule__PropertyAssignment__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PropertyAssignment__Group__1_in_rule__PropertyAssignment__Group__05747);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2608:1: rule__PropertyAssignment__Group__0__Impl : ( ( rule__PropertyAssignment__IdAssignment_0 ) ) ;
    public final void rule__PropertyAssignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2612:1: ( ( ( rule__PropertyAssignment__IdAssignment_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2613:1: ( ( rule__PropertyAssignment__IdAssignment_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2613:1: ( ( rule__PropertyAssignment__IdAssignment_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2614:1: ( rule__PropertyAssignment__IdAssignment_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPropertyAssignmentAccess().getIdAssignment_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2615:1: ( rule__PropertyAssignment__IdAssignment_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2615:2: rule__PropertyAssignment__IdAssignment_0
            {
            pushFollow(FOLLOW_rule__PropertyAssignment__IdAssignment_0_in_rule__PropertyAssignment__Group__0__Impl5774);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2625:1: rule__PropertyAssignment__Group__1 : rule__PropertyAssignment__Group__1__Impl rule__PropertyAssignment__Group__2 ;
    public final void rule__PropertyAssignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2629:1: ( rule__PropertyAssignment__Group__1__Impl rule__PropertyAssignment__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2630:2: rule__PropertyAssignment__Group__1__Impl rule__PropertyAssignment__Group__2
            {
            pushFollow(FOLLOW_rule__PropertyAssignment__Group__1__Impl_in_rule__PropertyAssignment__Group__15804);
            rule__PropertyAssignment__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__PropertyAssignment__Group__2_in_rule__PropertyAssignment__Group__15807);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2637:1: rule__PropertyAssignment__Group__1__Impl : ( KEYWORD_11 ) ;
    public final void rule__PropertyAssignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2641:1: ( ( KEYWORD_11 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2642:1: ( KEYWORD_11 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2642:1: ( KEYWORD_11 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2643:1: KEYWORD_11
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPropertyAssignmentAccess().getEqualsSignKeyword_1()); 
            }
            match(input,KEYWORD_11,FOLLOW_KEYWORD_11_in_rule__PropertyAssignment__Group__1__Impl5835); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2656:1: rule__PropertyAssignment__Group__2 : rule__PropertyAssignment__Group__2__Impl ;
    public final void rule__PropertyAssignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2660:1: ( rule__PropertyAssignment__Group__2__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2661:2: rule__PropertyAssignment__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__PropertyAssignment__Group__2__Impl_in_rule__PropertyAssignment__Group__25866);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2667:1: rule__PropertyAssignment__Group__2__Impl : ( ( rule__PropertyAssignment__ValueAssignment_2 ) ) ;
    public final void rule__PropertyAssignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2671:1: ( ( ( rule__PropertyAssignment__ValueAssignment_2 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2672:1: ( ( rule__PropertyAssignment__ValueAssignment_2 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2672:1: ( ( rule__PropertyAssignment__ValueAssignment_2 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2673:1: ( rule__PropertyAssignment__ValueAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPropertyAssignmentAccess().getValueAssignment_2()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2674:1: ( rule__PropertyAssignment__ValueAssignment_2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2674:2: rule__PropertyAssignment__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__PropertyAssignment__ValueAssignment_2_in_rule__PropertyAssignment__Group__2__Impl5893);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2690:1: rule__SimpleBlock__Group__0 : rule__SimpleBlock__Group__0__Impl rule__SimpleBlock__Group__1 ;
    public final void rule__SimpleBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2694:1: ( rule__SimpleBlock__Group__0__Impl rule__SimpleBlock__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2695:2: rule__SimpleBlock__Group__0__Impl rule__SimpleBlock__Group__1
            {
            pushFollow(FOLLOW_rule__SimpleBlock__Group__0__Impl_in_rule__SimpleBlock__Group__05929);
            rule__SimpleBlock__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SimpleBlock__Group__1_in_rule__SimpleBlock__Group__05932);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2702:1: rule__SimpleBlock__Group__0__Impl : ( () ) ;
    public final void rule__SimpleBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2706:1: ( ( () ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2707:1: ( () )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2707:1: ( () )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2708:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimpleBlockAccess().getSimpleBlockAction_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2709:1: ()
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2711:1: 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2721:1: rule__SimpleBlock__Group__1 : rule__SimpleBlock__Group__1__Impl rule__SimpleBlock__Group__2 ;
    public final void rule__SimpleBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2725:1: ( rule__SimpleBlock__Group__1__Impl rule__SimpleBlock__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2726:2: rule__SimpleBlock__Group__1__Impl rule__SimpleBlock__Group__2
            {
            pushFollow(FOLLOW_rule__SimpleBlock__Group__1__Impl_in_rule__SimpleBlock__Group__15990);
            rule__SimpleBlock__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SimpleBlock__Group__2_in_rule__SimpleBlock__Group__15993);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2733:1: rule__SimpleBlock__Group__1__Impl : ( KEYWORD_17 ) ;
    public final void rule__SimpleBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2737:1: ( ( KEYWORD_17 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2738:1: ( KEYWORD_17 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2738:1: ( KEYWORD_17 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2739:1: KEYWORD_17
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimpleBlockAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_rule__SimpleBlock__Group__1__Impl6021); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2752:1: rule__SimpleBlock__Group__2 : rule__SimpleBlock__Group__2__Impl rule__SimpleBlock__Group__3 ;
    public final void rule__SimpleBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2756:1: ( rule__SimpleBlock__Group__2__Impl rule__SimpleBlock__Group__3 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2757:2: rule__SimpleBlock__Group__2__Impl rule__SimpleBlock__Group__3
            {
            pushFollow(FOLLOW_rule__SimpleBlock__Group__2__Impl_in_rule__SimpleBlock__Group__26052);
            rule__SimpleBlock__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SimpleBlock__Group__3_in_rule__SimpleBlock__Group__26055);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2764:1: rule__SimpleBlock__Group__2__Impl : ( ( rule__SimpleBlock__ExpressionsAssignment_2 )* ) ;
    public final void rule__SimpleBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2768:1: ( ( ( rule__SimpleBlock__ExpressionsAssignment_2 )* ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2769:1: ( ( rule__SimpleBlock__ExpressionsAssignment_2 )* )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2769:1: ( ( rule__SimpleBlock__ExpressionsAssignment_2 )* )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2770:1: ( rule__SimpleBlock__ExpressionsAssignment_2 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimpleBlockAccess().getExpressionsAssignment_2()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2771:1: ( rule__SimpleBlock__ExpressionsAssignment_2 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=KEYWORD_87 && LA26_0<=KEYWORD_29)||LA26_0==KEYWORD_24||(LA26_0>=KEYWORD_26 && LA26_0<=KEYWORD_2)||(LA26_0>=KEYWORD_4 && LA26_0<=KEYWORD_15)||LA26_0==KEYWORD_17||(LA26_0>=KEYWORD_19 && LA26_0<=RULE_ID)||LA26_0==RULE_ANY_OTHER) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2771:2: rule__SimpleBlock__ExpressionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__SimpleBlock__ExpressionsAssignment_2_in_rule__SimpleBlock__Group__2__Impl6082);
            	    rule__SimpleBlock__ExpressionsAssignment_2();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2781:1: rule__SimpleBlock__Group__3 : rule__SimpleBlock__Group__3__Impl ;
    public final void rule__SimpleBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2785:1: ( rule__SimpleBlock__Group__3__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2786:2: rule__SimpleBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SimpleBlock__Group__3__Impl_in_rule__SimpleBlock__Group__36113);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2792:1: rule__SimpleBlock__Group__3__Impl : ( KEYWORD_18 ) ;
    public final void rule__SimpleBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2796:1: ( ( KEYWORD_18 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2797:1: ( KEYWORD_18 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2797:1: ( KEYWORD_18 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2798:1: KEYWORD_18
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimpleBlockAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_rule__SimpleBlock__Group__3__Impl6141); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2819:1: rule__SimultaneousBlock__Group__0 : rule__SimultaneousBlock__Group__0__Impl rule__SimultaneousBlock__Group__1 ;
    public final void rule__SimultaneousBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2823:1: ( rule__SimultaneousBlock__Group__0__Impl rule__SimultaneousBlock__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2824:2: rule__SimultaneousBlock__Group__0__Impl rule__SimultaneousBlock__Group__1
            {
            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__0__Impl_in_rule__SimultaneousBlock__Group__06180);
            rule__SimultaneousBlock__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__1_in_rule__SimultaneousBlock__Group__06183);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2831:1: rule__SimultaneousBlock__Group__0__Impl : ( () ) ;
    public final void rule__SimultaneousBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2835:1: ( ( () ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2836:1: ( () )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2836:1: ( () )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2837:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimultaneousBlockAccess().getSimultaneousBlockAction_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2838:1: ()
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2840:1: 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2850:1: rule__SimultaneousBlock__Group__1 : rule__SimultaneousBlock__Group__1__Impl rule__SimultaneousBlock__Group__2 ;
    public final void rule__SimultaneousBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2854:1: ( rule__SimultaneousBlock__Group__1__Impl rule__SimultaneousBlock__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2855:2: rule__SimultaneousBlock__Group__1__Impl rule__SimultaneousBlock__Group__2
            {
            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__1__Impl_in_rule__SimultaneousBlock__Group__16241);
            rule__SimultaneousBlock__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__2_in_rule__SimultaneousBlock__Group__16244);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2862:1: rule__SimultaneousBlock__Group__1__Impl : ( KEYWORD_24 ) ;
    public final void rule__SimultaneousBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2866:1: ( ( KEYWORD_24 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2867:1: ( KEYWORD_24 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2867:1: ( KEYWORD_24 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2868:1: KEYWORD_24
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimultaneousBlockAccess().getLessThanSignLessThanSignKeyword_1()); 
            }
            match(input,KEYWORD_24,FOLLOW_KEYWORD_24_in_rule__SimultaneousBlock__Group__1__Impl6272); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2881:1: rule__SimultaneousBlock__Group__2 : rule__SimultaneousBlock__Group__2__Impl rule__SimultaneousBlock__Group__3 ;
    public final void rule__SimultaneousBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2885:1: ( rule__SimultaneousBlock__Group__2__Impl rule__SimultaneousBlock__Group__3 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2886:2: rule__SimultaneousBlock__Group__2__Impl rule__SimultaneousBlock__Group__3
            {
            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__2__Impl_in_rule__SimultaneousBlock__Group__26303);
            rule__SimultaneousBlock__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__3_in_rule__SimultaneousBlock__Group__26306);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2893:1: rule__SimultaneousBlock__Group__2__Impl : ( ( rule__SimultaneousBlock__ExpressionsAssignment_2 )* ) ;
    public final void rule__SimultaneousBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2897:1: ( ( ( rule__SimultaneousBlock__ExpressionsAssignment_2 )* ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2898:1: ( ( rule__SimultaneousBlock__ExpressionsAssignment_2 )* )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2898:1: ( ( rule__SimultaneousBlock__ExpressionsAssignment_2 )* )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2899:1: ( rule__SimultaneousBlock__ExpressionsAssignment_2 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimultaneousBlockAccess().getExpressionsAssignment_2()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2900:1: ( rule__SimultaneousBlock__ExpressionsAssignment_2 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=KEYWORD_87 && LA27_0<=KEYWORD_29)||LA27_0==KEYWORD_24||(LA27_0>=KEYWORD_26 && LA27_0<=KEYWORD_2)||(LA27_0>=KEYWORD_4 && LA27_0<=KEYWORD_15)||LA27_0==KEYWORD_17||(LA27_0>=KEYWORD_19 && LA27_0<=RULE_ID)||LA27_0==RULE_ANY_OTHER) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2900:2: rule__SimultaneousBlock__ExpressionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__SimultaneousBlock__ExpressionsAssignment_2_in_rule__SimultaneousBlock__Group__2__Impl6333);
            	    rule__SimultaneousBlock__ExpressionsAssignment_2();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2910:1: rule__SimultaneousBlock__Group__3 : rule__SimultaneousBlock__Group__3__Impl ;
    public final void rule__SimultaneousBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2914:1: ( rule__SimultaneousBlock__Group__3__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2915:2: rule__SimultaneousBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SimultaneousBlock__Group__3__Impl_in_rule__SimultaneousBlock__Group__36364);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2921:1: rule__SimultaneousBlock__Group__3__Impl : ( KEYWORD_25 ) ;
    public final void rule__SimultaneousBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2925:1: ( ( KEYWORD_25 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2926:1: ( KEYWORD_25 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2926:1: ( KEYWORD_25 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2927:1: KEYWORD_25
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimultaneousBlockAccess().getGreaterThanSignGreaterThanSignKeyword_3()); 
            }
            match(input,KEYWORD_25,FOLLOW_KEYWORD_25_in_rule__SimultaneousBlock__Group__3__Impl6392); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2948:1: rule__Include__Group__0 : rule__Include__Group__0__Impl rule__Include__Group__1 ;
    public final void rule__Include__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2952:1: ( rule__Include__Group__0__Impl rule__Include__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2953:2: rule__Include__Group__0__Impl rule__Include__Group__1
            {
            pushFollow(FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__06431);
            rule__Include__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Include__Group__1_in_rule__Include__Group__06434);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2960:1: rule__Include__Group__0__Impl : ( KEYWORD_14 ) ;
    public final void rule__Include__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2964:1: ( ( KEYWORD_14 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2965:1: ( KEYWORD_14 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2965:1: ( KEYWORD_14 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2966:1: KEYWORD_14
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getReverseSolidusKeyword_0()); 
            }
            match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_rule__Include__Group__0__Impl6462); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2979:1: rule__Include__Group__1 : rule__Include__Group__1__Impl rule__Include__Group__2 ;
    public final void rule__Include__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2983:1: ( rule__Include__Group__1__Impl rule__Include__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2984:2: rule__Include__Group__1__Impl rule__Include__Group__2
            {
            pushFollow(FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__16493);
            rule__Include__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Include__Group__2_in_rule__Include__Group__16496);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2991:1: rule__Include__Group__1__Impl : ( KEYWORD_62 ) ;
    public final void rule__Include__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2995:1: ( ( KEYWORD_62 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2996:1: ( KEYWORD_62 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2996:1: ( KEYWORD_62 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2997:1: KEYWORD_62
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getIncludeKeyword_1()); 
            }
            match(input,KEYWORD_62,FOLLOW_KEYWORD_62_in_rule__Include__Group__1__Impl6524); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3010:1: rule__Include__Group__2 : rule__Include__Group__2__Impl ;
    public final void rule__Include__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3014:1: ( rule__Include__Group__2__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3015:2: rule__Include__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Include__Group__2__Impl_in_rule__Include__Group__26555);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3021:1: rule__Include__Group__2__Impl : ( ( rule__Include__ImportURIAssignment_2 ) ) ;
    public final void rule__Include__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3025:1: ( ( ( rule__Include__ImportURIAssignment_2 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3026:1: ( ( rule__Include__ImportURIAssignment_2 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3026:1: ( ( rule__Include__ImportURIAssignment_2 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3027:1: ( rule__Include__ImportURIAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getImportURIAssignment_2()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3028:1: ( rule__Include__ImportURIAssignment_2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3028:2: rule__Include__ImportURIAssignment_2
            {
            pushFollow(FOLLOW_rule__Include__ImportURIAssignment_2_in_rule__Include__Group__2__Impl6582);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3044:1: rule__Version__Group__0 : rule__Version__Group__0__Impl rule__Version__Group__1 ;
    public final void rule__Version__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3048:1: ( rule__Version__Group__0__Impl rule__Version__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3049:2: rule__Version__Group__0__Impl rule__Version__Group__1
            {
            pushFollow(FOLLOW_rule__Version__Group__0__Impl_in_rule__Version__Group__06618);
            rule__Version__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Version__Group__1_in_rule__Version__Group__06621);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3056:1: rule__Version__Group__0__Impl : ( KEYWORD_14 ) ;
    public final void rule__Version__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3060:1: ( ( KEYWORD_14 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3061:1: ( KEYWORD_14 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3061:1: ( KEYWORD_14 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3062:1: KEYWORD_14
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getReverseSolidusKeyword_0()); 
            }
            match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_rule__Version__Group__0__Impl6649); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3075:1: rule__Version__Group__1 : rule__Version__Group__1__Impl rule__Version__Group__2 ;
    public final void rule__Version__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3079:1: ( rule__Version__Group__1__Impl rule__Version__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3080:2: rule__Version__Group__1__Impl rule__Version__Group__2
            {
            pushFollow(FOLLOW_rule__Version__Group__1__Impl_in_rule__Version__Group__16680);
            rule__Version__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Version__Group__2_in_rule__Version__Group__16683);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3087:1: rule__Version__Group__1__Impl : ( KEYWORD_64 ) ;
    public final void rule__Version__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3091:1: ( ( KEYWORD_64 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3092:1: ( KEYWORD_64 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3092:1: ( KEYWORD_64 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3093:1: KEYWORD_64
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getVersionKeyword_1()); 
            }
            match(input,KEYWORD_64,FOLLOW_KEYWORD_64_in_rule__Version__Group__1__Impl6711); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3106:1: rule__Version__Group__2 : rule__Version__Group__2__Impl ;
    public final void rule__Version__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3110:1: ( rule__Version__Group__2__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3111:2: rule__Version__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Version__Group__2__Impl_in_rule__Version__Group__26742);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3117:1: rule__Version__Group__2__Impl : ( ( rule__Version__VersionAssignment_2 ) ) ;
    public final void rule__Version__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3121:1: ( ( ( rule__Version__VersionAssignment_2 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3122:1: ( ( rule__Version__VersionAssignment_2 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3122:1: ( ( rule__Version__VersionAssignment_2 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3123:1: ( rule__Version__VersionAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getVersionAssignment_2()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3124:1: ( rule__Version__VersionAssignment_2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3124:2: rule__Version__VersionAssignment_2
            {
            pushFollow(FOLLOW_rule__Version__VersionAssignment_2_in_rule__Version__Group__2__Impl6769);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3140:1: rule__Markup__Group__0 : rule__Markup__Group__0__Impl rule__Markup__Group__1 ;
    public final void rule__Markup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3144:1: ( rule__Markup__Group__0__Impl rule__Markup__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3145:2: rule__Markup__Group__0__Impl rule__Markup__Group__1
            {
            pushFollow(FOLLOW_rule__Markup__Group__0__Impl_in_rule__Markup__Group__06805);
            rule__Markup__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Markup__Group__1_in_rule__Markup__Group__06808);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3152:1: rule__Markup__Group__0__Impl : ( KEYWORD_14 ) ;
    public final void rule__Markup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3156:1: ( ( KEYWORD_14 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3157:1: ( KEYWORD_14 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3157:1: ( KEYWORD_14 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3158:1: KEYWORD_14
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupAccess().getReverseSolidusKeyword_0()); 
            }
            match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_rule__Markup__Group__0__Impl6836); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3171:1: rule__Markup__Group__1 : rule__Markup__Group__1__Impl rule__Markup__Group__2 ;
    public final void rule__Markup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3175:1: ( rule__Markup__Group__1__Impl rule__Markup__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3176:2: rule__Markup__Group__1__Impl rule__Markup__Group__2
            {
            pushFollow(FOLLOW_rule__Markup__Group__1__Impl_in_rule__Markup__Group__16867);
            rule__Markup__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Markup__Group__2_in_rule__Markup__Group__16870);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3183:1: rule__Markup__Group__1__Impl : ( KEYWORD_53 ) ;
    public final void rule__Markup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3187:1: ( ( KEYWORD_53 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3188:1: ( KEYWORD_53 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3188:1: ( KEYWORD_53 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3189:1: KEYWORD_53
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupAccess().getMarkupKeyword_1()); 
            }
            match(input,KEYWORD_53,FOLLOW_KEYWORD_53_in_rule__Markup__Group__1__Impl6898); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3202:1: rule__Markup__Group__2 : rule__Markup__Group__2__Impl ;
    public final void rule__Markup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3206:1: ( rule__Markup__Group__2__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3207:2: rule__Markup__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Markup__Group__2__Impl_in_rule__Markup__Group__26929);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3213:1: rule__Markup__Group__2__Impl : ( ( rule__Markup__BodyAssignment_2 ) ) ;
    public final void rule__Markup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3217:1: ( ( ( rule__Markup__BodyAssignment_2 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3218:1: ( ( rule__Markup__BodyAssignment_2 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3218:1: ( ( rule__Markup__BodyAssignment_2 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3219:1: ( rule__Markup__BodyAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupAccess().getBodyAssignment_2()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3220:1: ( rule__Markup__BodyAssignment_2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3220:2: rule__Markup__BodyAssignment_2
            {
            pushFollow(FOLLOW_rule__Markup__BodyAssignment_2_in_rule__Markup__Group__2__Impl6956);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3236:1: rule__MarkupLines__Group__0 : rule__MarkupLines__Group__0__Impl rule__MarkupLines__Group__1 ;
    public final void rule__MarkupLines__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3240:1: ( rule__MarkupLines__Group__0__Impl rule__MarkupLines__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3241:2: rule__MarkupLines__Group__0__Impl rule__MarkupLines__Group__1
            {
            pushFollow(FOLLOW_rule__MarkupLines__Group__0__Impl_in_rule__MarkupLines__Group__06992);
            rule__MarkupLines__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MarkupLines__Group__1_in_rule__MarkupLines__Group__06995);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3248:1: rule__MarkupLines__Group__0__Impl : ( KEYWORD_14 ) ;
    public final void rule__MarkupLines__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3252:1: ( ( KEYWORD_14 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3253:1: ( KEYWORD_14 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3253:1: ( KEYWORD_14 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3254:1: KEYWORD_14
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupLinesAccess().getReverseSolidusKeyword_0()); 
            }
            match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_rule__MarkupLines__Group__0__Impl7023); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3267:1: rule__MarkupLines__Group__1 : rule__MarkupLines__Group__1__Impl rule__MarkupLines__Group__2 ;
    public final void rule__MarkupLines__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3271:1: ( rule__MarkupLines__Group__1__Impl rule__MarkupLines__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3272:2: rule__MarkupLines__Group__1__Impl rule__MarkupLines__Group__2
            {
            pushFollow(FOLLOW_rule__MarkupLines__Group__1__Impl_in_rule__MarkupLines__Group__17054);
            rule__MarkupLines__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MarkupLines__Group__2_in_rule__MarkupLines__Group__17057);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3279:1: rule__MarkupLines__Group__1__Impl : ( KEYWORD_82 ) ;
    public final void rule__MarkupLines__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3283:1: ( ( KEYWORD_82 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3284:1: ( KEYWORD_82 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3284:1: ( KEYWORD_82 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3285:1: KEYWORD_82
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupLinesAccess().getMarkuplinesKeyword_1()); 
            }
            match(input,KEYWORD_82,FOLLOW_KEYWORD_82_in_rule__MarkupLines__Group__1__Impl7085); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3298:1: rule__MarkupLines__Group__2 : rule__MarkupLines__Group__2__Impl ;
    public final void rule__MarkupLines__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3302:1: ( rule__MarkupLines__Group__2__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3303:2: rule__MarkupLines__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__MarkupLines__Group__2__Impl_in_rule__MarkupLines__Group__27116);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3309:1: rule__MarkupLines__Group__2__Impl : ( ( rule__MarkupLines__BodyAssignment_2 ) ) ;
    public final void rule__MarkupLines__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3313:1: ( ( ( rule__MarkupLines__BodyAssignment_2 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3314:1: ( ( rule__MarkupLines__BodyAssignment_2 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3314:1: ( ( rule__MarkupLines__BodyAssignment_2 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3315:1: ( rule__MarkupLines__BodyAssignment_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupLinesAccess().getBodyAssignment_2()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3316:1: ( rule__MarkupLines__BodyAssignment_2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3316:2: rule__MarkupLines__BodyAssignment_2
            {
            pushFollow(FOLLOW_rule__MarkupLines__BodyAssignment_2_in_rule__MarkupLines__Group__2__Impl7143);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3332:1: rule__MarkupBody__Group__0 : rule__MarkupBody__Group__0__Impl rule__MarkupBody__Group__1 ;
    public final void rule__MarkupBody__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3336:1: ( rule__MarkupBody__Group__0__Impl rule__MarkupBody__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3337:2: rule__MarkupBody__Group__0__Impl rule__MarkupBody__Group__1
            {
            pushFollow(FOLLOW_rule__MarkupBody__Group__0__Impl_in_rule__MarkupBody__Group__07179);
            rule__MarkupBody__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MarkupBody__Group__1_in_rule__MarkupBody__Group__07182);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3344:1: rule__MarkupBody__Group__0__Impl : ( () ) ;
    public final void rule__MarkupBody__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3348:1: ( ( () ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3349:1: ( () )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3349:1: ( () )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3350:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupBodyAccess().getMarkupBodyAction_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3351:1: ()
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3353:1: 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3363:1: rule__MarkupBody__Group__1 : rule__MarkupBody__Group__1__Impl rule__MarkupBody__Group__2 ;
    public final void rule__MarkupBody__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3367:1: ( rule__MarkupBody__Group__1__Impl rule__MarkupBody__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3368:2: rule__MarkupBody__Group__1__Impl rule__MarkupBody__Group__2
            {
            pushFollow(FOLLOW_rule__MarkupBody__Group__1__Impl_in_rule__MarkupBody__Group__17240);
            rule__MarkupBody__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__MarkupBody__Group__2_in_rule__MarkupBody__Group__17243);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3375:1: rule__MarkupBody__Group__1__Impl : ( ( rule__MarkupBody__CommandAssignment_1 )* ) ;
    public final void rule__MarkupBody__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3379:1: ( ( ( rule__MarkupBody__CommandAssignment_1 )* ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3380:1: ( ( rule__MarkupBody__CommandAssignment_1 )* )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3380:1: ( ( rule__MarkupBody__CommandAssignment_1 )* )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3381:1: ( rule__MarkupBody__CommandAssignment_1 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupBodyAccess().getCommandAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3382:1: ( rule__MarkupBody__CommandAssignment_1 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==KEYWORD_14) ) {
                    int LA28_5 = input.LA(2);

                    if ( (synpred120()) ) {
                        alt28=1;
                    }


                }
                else if ( (LA28_0==KEYWORD_2) ) {
                    int LA28_7 = input.LA(2);

                    if ( (synpred120()) ) {
                        alt28=1;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3382:2: rule__MarkupBody__CommandAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__MarkupBody__CommandAssignment_1_in_rule__MarkupBody__Group__1__Impl7270);
            	    rule__MarkupBody__CommandAssignment_1();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3392:1: rule__MarkupBody__Group__2 : rule__MarkupBody__Group__2__Impl ;
    public final void rule__MarkupBody__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3396:1: ( rule__MarkupBody__Group__2__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3397:2: rule__MarkupBody__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__MarkupBody__Group__2__Impl_in_rule__MarkupBody__Group__27301);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3403:1: rule__MarkupBody__Group__2__Impl : ( ( rule__MarkupBody__BlockAssignment_2 )? ) ;
    public final void rule__MarkupBody__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3407:1: ( ( ( rule__MarkupBody__BlockAssignment_2 )? ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3408:1: ( ( rule__MarkupBody__BlockAssignment_2 )? )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3408:1: ( ( rule__MarkupBody__BlockAssignment_2 )? )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3409:1: ( rule__MarkupBody__BlockAssignment_2 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupBodyAccess().getBlockAssignment_2()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3410:1: ( rule__MarkupBody__BlockAssignment_2 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==KEYWORD_17) ) {
                int LA29_1 = input.LA(2);

                if ( (synpred121()) ) {
                    alt29=1;
                }
            }
            switch (alt29) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3410:2: rule__MarkupBody__BlockAssignment_2
                    {
                    pushFollow(FOLLOW_rule__MarkupBody__BlockAssignment_2_in_rule__MarkupBody__Group__2__Impl7328);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3426:1: rule__Context__Group__0 : rule__Context__Group__0__Impl rule__Context__Group__1 ;
    public final void rule__Context__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3430:1: ( rule__Context__Group__0__Impl rule__Context__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3431:2: rule__Context__Group__0__Impl rule__Context__Group__1
            {
            pushFollow(FOLLOW_rule__Context__Group__0__Impl_in_rule__Context__Group__07365);
            rule__Context__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Context__Group__1_in_rule__Context__Group__07368);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3438:1: rule__Context__Group__0__Impl : ( () ) ;
    public final void rule__Context__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3442:1: ( ( () ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3443:1: ( () )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3443:1: ( () )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3444:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getContextAccess().getContextAction_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3445:1: ()
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3447:1: 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3457:1: rule__Context__Group__1 : rule__Context__Group__1__Impl rule__Context__Group__2 ;
    public final void rule__Context__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3461:1: ( rule__Context__Group__1__Impl rule__Context__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3462:2: rule__Context__Group__1__Impl rule__Context__Group__2
            {
            pushFollow(FOLLOW_rule__Context__Group__1__Impl_in_rule__Context__Group__17426);
            rule__Context__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Context__Group__2_in_rule__Context__Group__17429);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3469:1: rule__Context__Group__1__Impl : ( KEYWORD_14 ) ;
    public final void rule__Context__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3473:1: ( ( KEYWORD_14 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3474:1: ( KEYWORD_14 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3474:1: ( KEYWORD_14 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3475:1: KEYWORD_14
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getContextAccess().getReverseSolidusKeyword_1()); 
            }
            match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_rule__Context__Group__1__Impl7457); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3488:1: rule__Context__Group__2 : rule__Context__Group__2__Impl rule__Context__Group__3 ;
    public final void rule__Context__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3492:1: ( rule__Context__Group__2__Impl rule__Context__Group__3 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3493:2: rule__Context__Group__2__Impl rule__Context__Group__3
            {
            pushFollow(FOLLOW_rule__Context__Group__2__Impl_in_rule__Context__Group__27488);
            rule__Context__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Context__Group__3_in_rule__Context__Group__27491);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3500:1: rule__Context__Group__2__Impl : ( KEYWORD_59 ) ;
    public final void rule__Context__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3504:1: ( ( KEYWORD_59 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3505:1: ( KEYWORD_59 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3505:1: ( KEYWORD_59 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3506:1: KEYWORD_59
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getContextAccess().getContextKeyword_2()); 
            }
            match(input,KEYWORD_59,FOLLOW_KEYWORD_59_in_rule__Context__Group__2__Impl7519); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3519:1: rule__Context__Group__3 : rule__Context__Group__3__Impl ;
    public final void rule__Context__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3523:1: ( rule__Context__Group__3__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3524:2: rule__Context__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Context__Group__3__Impl_in_rule__Context__Group__37550);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3530:1: rule__Context__Group__3__Impl : ( ( rule__Context__BlockAssignment_3 )? ) ;
    public final void rule__Context__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3534:1: ( ( ( rule__Context__BlockAssignment_3 )? ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3535:1: ( ( rule__Context__BlockAssignment_3 )? )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3535:1: ( ( rule__Context__BlockAssignment_3 )? )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3536:1: ( rule__Context__BlockAssignment_3 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getContextAccess().getBlockAssignment_3()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3537:1: ( rule__Context__BlockAssignment_3 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==KEYWORD_17) ) {
                int LA30_1 = input.LA(2);

                if ( (synpred122()) ) {
                    alt30=1;
                }
            }
            switch (alt30) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3537:2: rule__Context__BlockAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Context__BlockAssignment_3_in_rule__Context__Group__3__Impl7577);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3555:1: rule__Other__Group__0 : rule__Other__Group__0__Impl rule__Other__Group__1 ;
    public final void rule__Other__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3559:1: ( rule__Other__Group__0__Impl rule__Other__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3560:2: rule__Other__Group__0__Impl rule__Other__Group__1
            {
            pushFollow(FOLLOW_rule__Other__Group__0__Impl_in_rule__Other__Group__07616);
            rule__Other__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Other__Group__1_in_rule__Other__Group__07619);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3567:1: rule__Other__Group__0__Impl : ( KEYWORD_14 ) ;
    public final void rule__Other__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3571:1: ( ( KEYWORD_14 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3572:1: ( KEYWORD_14 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3572:1: ( KEYWORD_14 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3573:1: KEYWORD_14
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOtherAccess().getReverseSolidusKeyword_0()); 
            }
            match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_rule__Other__Group__0__Impl7647); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3586:1: rule__Other__Group__1 : rule__Other__Group__1__Impl ;
    public final void rule__Other__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3590:1: ( rule__Other__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3591:2: rule__Other__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Other__Group__1__Impl_in_rule__Other__Group__17678);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3597:1: rule__Other__Group__1__Impl : ( ( rule__Other__KeywordAssignment_1 ) ) ;
    public final void rule__Other__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3601:1: ( ( ( rule__Other__KeywordAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3602:1: ( ( rule__Other__KeywordAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3602:1: ( ( rule__Other__KeywordAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3603:1: ( rule__Other__KeywordAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOtherAccess().getKeywordAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3604:1: ( rule__Other__KeywordAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3604:2: rule__Other__KeywordAssignment_1
            {
            pushFollow(FOLLOW_rule__Other__KeywordAssignment_1_in_rule__Other__Group__1__Impl7705);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3618:1: rule__UnparsedBlock__Group__0 : rule__UnparsedBlock__Group__0__Impl rule__UnparsedBlock__Group__1 ;
    public final void rule__UnparsedBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3622:1: ( rule__UnparsedBlock__Group__0__Impl rule__UnparsedBlock__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3623:2: rule__UnparsedBlock__Group__0__Impl rule__UnparsedBlock__Group__1
            {
            pushFollow(FOLLOW_rule__UnparsedBlock__Group__0__Impl_in_rule__UnparsedBlock__Group__07739);
            rule__UnparsedBlock__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__UnparsedBlock__Group__1_in_rule__UnparsedBlock__Group__07742);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3630:1: rule__UnparsedBlock__Group__0__Impl : ( () ) ;
    public final void rule__UnparsedBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3634:1: ( ( () ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3635:1: ( () )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3635:1: ( () )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3636:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnparsedBlockAccess().getUnparsedBlockAction_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3637:1: ()
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3639:1: 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3649:1: rule__UnparsedBlock__Group__1 : rule__UnparsedBlock__Group__1__Impl rule__UnparsedBlock__Group__2 ;
    public final void rule__UnparsedBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3653:1: ( rule__UnparsedBlock__Group__1__Impl rule__UnparsedBlock__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3654:2: rule__UnparsedBlock__Group__1__Impl rule__UnparsedBlock__Group__2
            {
            pushFollow(FOLLOW_rule__UnparsedBlock__Group__1__Impl_in_rule__UnparsedBlock__Group__17800);
            rule__UnparsedBlock__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__UnparsedBlock__Group__2_in_rule__UnparsedBlock__Group__17803);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3661:1: rule__UnparsedBlock__Group__1__Impl : ( KEYWORD_17 ) ;
    public final void rule__UnparsedBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3665:1: ( ( KEYWORD_17 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3666:1: ( KEYWORD_17 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3666:1: ( KEYWORD_17 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3667:1: KEYWORD_17
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnparsedBlockAccess().getLeftCurlyBracketKeyword_1()); 
            }
            match(input,KEYWORD_17,FOLLOW_KEYWORD_17_in_rule__UnparsedBlock__Group__1__Impl7831); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3680:1: rule__UnparsedBlock__Group__2 : rule__UnparsedBlock__Group__2__Impl rule__UnparsedBlock__Group__3 ;
    public final void rule__UnparsedBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3684:1: ( rule__UnparsedBlock__Group__2__Impl rule__UnparsedBlock__Group__3 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3685:2: rule__UnparsedBlock__Group__2__Impl rule__UnparsedBlock__Group__3
            {
            pushFollow(FOLLOW_rule__UnparsedBlock__Group__2__Impl_in_rule__UnparsedBlock__Group__27862);
            rule__UnparsedBlock__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__UnparsedBlock__Group__3_in_rule__UnparsedBlock__Group__27865);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3692:1: rule__UnparsedBlock__Group__2__Impl : ( ( rule__UnparsedBlock__ExpressionsAssignment_2 )* ) ;
    public final void rule__UnparsedBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3696:1: ( ( ( rule__UnparsedBlock__ExpressionsAssignment_2 )* ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3697:1: ( ( rule__UnparsedBlock__ExpressionsAssignment_2 )* )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3697:1: ( ( rule__UnparsedBlock__ExpressionsAssignment_2 )* )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3698:1: ( rule__UnparsedBlock__ExpressionsAssignment_2 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnparsedBlockAccess().getExpressionsAssignment_2()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3699:1: ( rule__UnparsedBlock__ExpressionsAssignment_2 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=KEYWORD_87 && LA31_0<=KEYWORD_29)||(LA31_0>=KEYWORD_26 && LA31_0<=KEYWORD_2)||(LA31_0>=KEYWORD_4 && LA31_0<=KEYWORD_15)||LA31_0==KEYWORD_17||(LA31_0>=KEYWORD_19 && LA31_0<=RULE_ID)||LA31_0==RULE_ANY_OTHER) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3699:2: rule__UnparsedBlock__ExpressionsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__UnparsedBlock__ExpressionsAssignment_2_in_rule__UnparsedBlock__Group__2__Impl7892);
            	    rule__UnparsedBlock__ExpressionsAssignment_2();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3709:1: rule__UnparsedBlock__Group__3 : rule__UnparsedBlock__Group__3__Impl ;
    public final void rule__UnparsedBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3713:1: ( rule__UnparsedBlock__Group__3__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3714:2: rule__UnparsedBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__UnparsedBlock__Group__3__Impl_in_rule__UnparsedBlock__Group__37923);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3720:1: rule__UnparsedBlock__Group__3__Impl : ( KEYWORD_18 ) ;
    public final void rule__UnparsedBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3724:1: ( ( KEYWORD_18 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3725:1: ( KEYWORD_18 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3725:1: ( KEYWORD_18 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3726:1: KEYWORD_18
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnparsedBlockAccess().getRightCurlyBracketKeyword_3()); 
            }
            match(input,KEYWORD_18,FOLLOW_KEYWORD_18_in_rule__UnparsedBlock__Group__3__Impl7951); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3747:1: rule__UnparsedCommand__Group__0 : rule__UnparsedCommand__Group__0__Impl rule__UnparsedCommand__Group__1 ;
    public final void rule__UnparsedCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3751:1: ( rule__UnparsedCommand__Group__0__Impl rule__UnparsedCommand__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3752:2: rule__UnparsedCommand__Group__0__Impl rule__UnparsedCommand__Group__1
            {
            pushFollow(FOLLOW_rule__UnparsedCommand__Group__0__Impl_in_rule__UnparsedCommand__Group__07990);
            rule__UnparsedCommand__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__UnparsedCommand__Group__1_in_rule__UnparsedCommand__Group__07993);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3759:1: rule__UnparsedCommand__Group__0__Impl : ( KEYWORD_14 ) ;
    public final void rule__UnparsedCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3763:1: ( ( KEYWORD_14 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3764:1: ( KEYWORD_14 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3764:1: ( KEYWORD_14 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3765:1: KEYWORD_14
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnparsedCommandAccess().getReverseSolidusKeyword_0()); 
            }
            match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_rule__UnparsedCommand__Group__0__Impl8021); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3778:1: rule__UnparsedCommand__Group__1 : rule__UnparsedCommand__Group__1__Impl ;
    public final void rule__UnparsedCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3782:1: ( rule__UnparsedCommand__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3783:2: rule__UnparsedCommand__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__UnparsedCommand__Group__1__Impl_in_rule__UnparsedCommand__Group__18052);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3789:1: rule__UnparsedCommand__Group__1__Impl : ( ( rule__UnparsedCommand__CommandAssignment_1 ) ) ;
    public final void rule__UnparsedCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3793:1: ( ( ( rule__UnparsedCommand__CommandAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3794:1: ( ( rule__UnparsedCommand__CommandAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3794:1: ( ( rule__UnparsedCommand__CommandAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3795:1: ( rule__UnparsedCommand__CommandAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnparsedCommandAccess().getCommandAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3796:1: ( rule__UnparsedCommand__CommandAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3796:2: rule__UnparsedCommand__CommandAssignment_1
            {
            pushFollow(FOLLOW_rule__UnparsedCommand__CommandAssignment_1_in_rule__UnparsedCommand__Group__1__Impl8079);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3810:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3814:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3815:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__08113);
            rule__Reference__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__08116);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3822:1: rule__Reference__Group__0__Impl : ( KEYWORD_14 ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3826:1: ( ( KEYWORD_14 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3827:1: ( KEYWORD_14 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3827:1: ( KEYWORD_14 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3828:1: KEYWORD_14
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getReverseSolidusKeyword_0()); 
            }
            match(input,KEYWORD_14,FOLLOW_KEYWORD_14_in_rule__Reference__Group__0__Impl8144); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3841:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3845:1: ( rule__Reference__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3846:2: rule__Reference__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__18175);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3852:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__AssignmentAssignment_1 ) ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3856:1: ( ( ( rule__Reference__AssignmentAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3857:1: ( ( rule__Reference__AssignmentAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3857:1: ( ( rule__Reference__AssignmentAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3858:1: ( rule__Reference__AssignmentAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getAssignmentAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3859:1: ( rule__Reference__AssignmentAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3859:2: rule__Reference__AssignmentAssignment_1
            {
            pushFollow(FOLLOW_rule__Reference__AssignmentAssignment_1_in_rule__Reference__Group__1__Impl8202);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3873:1: rule__Scheme__Group__0 : rule__Scheme__Group__0__Impl rule__Scheme__Group__1 ;
    public final void rule__Scheme__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3877:1: ( rule__Scheme__Group__0__Impl rule__Scheme__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3878:2: rule__Scheme__Group__0__Impl rule__Scheme__Group__1
            {
            pushFollow(FOLLOW_rule__Scheme__Group__0__Impl_in_rule__Scheme__Group__08236);
            rule__Scheme__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__Scheme__Group__1_in_rule__Scheme__Group__08239);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3885:1: rule__Scheme__Group__0__Impl : ( KEYWORD_2 ) ;
    public final void rule__Scheme__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3889:1: ( ( KEYWORD_2 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3890:1: ( KEYWORD_2 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3890:1: ( KEYWORD_2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3891:1: KEYWORD_2
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeAccess().getNumberSignKeyword_0()); 
            }
            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_rule__Scheme__Group__0__Impl8267); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3904:1: rule__Scheme__Group__1 : rule__Scheme__Group__1__Impl ;
    public final void rule__Scheme__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3908:1: ( rule__Scheme__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3909:2: rule__Scheme__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Scheme__Group__1__Impl_in_rule__Scheme__Group__18298);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3915:1: rule__Scheme__Group__1__Impl : ( ( rule__Scheme__ValueAssignment_1 ) ) ;
    public final void rule__Scheme__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3919:1: ( ( ( rule__Scheme__ValueAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3920:1: ( ( rule__Scheme__ValueAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3920:1: ( ( rule__Scheme__ValueAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3921:1: ( rule__Scheme__ValueAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeAccess().getValueAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3922:1: ( rule__Scheme__ValueAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3922:2: rule__Scheme__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__Scheme__ValueAssignment_1_in_rule__Scheme__Group__1__Impl8325);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3936:1: rule__SchemeExpression__Group__0 : rule__SchemeExpression__Group__0__Impl rule__SchemeExpression__Group__1 ;
    public final void rule__SchemeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3940:1: ( rule__SchemeExpression__Group__0__Impl rule__SchemeExpression__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3941:2: rule__SchemeExpression__Group__0__Impl rule__SchemeExpression__Group__1
            {
            pushFollow(FOLLOW_rule__SchemeExpression__Group__0__Impl_in_rule__SchemeExpression__Group__08359);
            rule__SchemeExpression__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeExpression__Group__1_in_rule__SchemeExpression__Group__08362);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3948:1: rule__SchemeExpression__Group__0__Impl : ( ( rule__SchemeExpression__Alternatives_0 ) ) ;
    public final void rule__SchemeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3952:1: ( ( ( rule__SchemeExpression__Alternatives_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3953:1: ( ( rule__SchemeExpression__Alternatives_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3953:1: ( ( rule__SchemeExpression__Alternatives_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3954:1: ( rule__SchemeExpression__Alternatives_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getAlternatives_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3955:1: ( rule__SchemeExpression__Alternatives_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3955:2: rule__SchemeExpression__Alternatives_0
            {
            pushFollow(FOLLOW_rule__SchemeExpression__Alternatives_0_in_rule__SchemeExpression__Group__0__Impl8389);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3965:1: rule__SchemeExpression__Group__1 : rule__SchemeExpression__Group__1__Impl ;
    public final void rule__SchemeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3969:1: ( rule__SchemeExpression__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3970:2: rule__SchemeExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SchemeExpression__Group__1__Impl_in_rule__SchemeExpression__Group__18419);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3976:1: rule__SchemeExpression__Group__1__Impl : ( ( rule__SchemeExpression__ValueAssignment_1 ) ) ;
    public final void rule__SchemeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3980:1: ( ( ( rule__SchemeExpression__ValueAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3981:1: ( ( rule__SchemeExpression__ValueAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3981:1: ( ( rule__SchemeExpression__ValueAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3982:1: ( rule__SchemeExpression__ValueAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getValueAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3983:1: ( rule__SchemeExpression__ValueAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3983:2: rule__SchemeExpression__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__SchemeExpression__ValueAssignment_1_in_rule__SchemeExpression__Group__1__Impl8446);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3997:1: rule__SchemeList__Group__0 : rule__SchemeList__Group__0__Impl rule__SchemeList__Group__1 ;
    public final void rule__SchemeList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4001:1: ( rule__SchemeList__Group__0__Impl rule__SchemeList__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4002:2: rule__SchemeList__Group__0__Impl rule__SchemeList__Group__1
            {
            pushFollow(FOLLOW_rule__SchemeList__Group__0__Impl_in_rule__SchemeList__Group__08480);
            rule__SchemeList__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeList__Group__1_in_rule__SchemeList__Group__08483);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4009:1: rule__SchemeList__Group__0__Impl : ( () ) ;
    public final void rule__SchemeList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4013:1: ( ( () ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4014:1: ( () )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4014:1: ( () )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4015:1: ()
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeListAccess().getSchemeListAction_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4016:1: ()
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4018:1: 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4028:1: rule__SchemeList__Group__1 : rule__SchemeList__Group__1__Impl rule__SchemeList__Group__2 ;
    public final void rule__SchemeList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4032:1: ( rule__SchemeList__Group__1__Impl rule__SchemeList__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4033:2: rule__SchemeList__Group__1__Impl rule__SchemeList__Group__2
            {
            pushFollow(FOLLOW_rule__SchemeList__Group__1__Impl_in_rule__SchemeList__Group__18541);
            rule__SchemeList__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeList__Group__2_in_rule__SchemeList__Group__18544);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4040:1: rule__SchemeList__Group__1__Impl : ( ( rule__SchemeList__VectorAssignment_1 )? ) ;
    public final void rule__SchemeList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4044:1: ( ( ( rule__SchemeList__VectorAssignment_1 )? ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4045:1: ( ( rule__SchemeList__VectorAssignment_1 )? )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4045:1: ( ( rule__SchemeList__VectorAssignment_1 )? )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4046:1: ( rule__SchemeList__VectorAssignment_1 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeListAccess().getVectorAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4047:1: ( rule__SchemeList__VectorAssignment_1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==KEYWORD_2) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4047:2: rule__SchemeList__VectorAssignment_1
                    {
                    pushFollow(FOLLOW_rule__SchemeList__VectorAssignment_1_in_rule__SchemeList__Group__1__Impl8571);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4057:1: rule__SchemeList__Group__2 : rule__SchemeList__Group__2__Impl rule__SchemeList__Group__3 ;
    public final void rule__SchemeList__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4061:1: ( rule__SchemeList__Group__2__Impl rule__SchemeList__Group__3 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4062:2: rule__SchemeList__Group__2__Impl rule__SchemeList__Group__3
            {
            pushFollow(FOLLOW_rule__SchemeList__Group__2__Impl_in_rule__SchemeList__Group__28602);
            rule__SchemeList__Group__2__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeList__Group__3_in_rule__SchemeList__Group__28605);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4069:1: rule__SchemeList__Group__2__Impl : ( KEYWORD_5 ) ;
    public final void rule__SchemeList__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4073:1: ( ( KEYWORD_5 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4074:1: ( KEYWORD_5 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4074:1: ( KEYWORD_5 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4075:1: KEYWORD_5
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeListAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,KEYWORD_5,FOLLOW_KEYWORD_5_in_rule__SchemeList__Group__2__Impl8633); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4088:1: rule__SchemeList__Group__3 : rule__SchemeList__Group__3__Impl rule__SchemeList__Group__4 ;
    public final void rule__SchemeList__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4092:1: ( rule__SchemeList__Group__3__Impl rule__SchemeList__Group__4 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4093:2: rule__SchemeList__Group__3__Impl rule__SchemeList__Group__4
            {
            pushFollow(FOLLOW_rule__SchemeList__Group__3__Impl_in_rule__SchemeList__Group__38664);
            rule__SchemeList__Group__3__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeList__Group__4_in_rule__SchemeList__Group__38667);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4100:1: rule__SchemeList__Group__3__Impl : ( ( rule__SchemeList__ExpressionsAssignment_3 )* ) ;
    public final void rule__SchemeList__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4104:1: ( ( ( rule__SchemeList__ExpressionsAssignment_3 )* ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4105:1: ( ( rule__SchemeList__ExpressionsAssignment_3 )* )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4105:1: ( ( rule__SchemeList__ExpressionsAssignment_3 )* )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4106:1: ( rule__SchemeList__ExpressionsAssignment_3 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeListAccess().getExpressionsAssignment_3()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4107:1: ( rule__SchemeList__ExpressionsAssignment_3 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=KEYWORD_87 && LA33_0<=KEYWORD_22)||(LA33_0>=KEYWORD_26 && LA33_0<=KEYWORD_5)||(LA33_0>=KEYWORD_7 && LA33_0<=KEYWORD_8)||(LA33_0>=KEYWORD_10 && LA33_0<=KEYWORD_13)||(LA33_0>=KEYWORD_15 && LA33_0<=KEYWORD_16)||(LA33_0>=KEYWORD_19 && LA33_0<=RULE_ID)||LA33_0==RULE_ANY_OTHER) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4107:2: rule__SchemeList__ExpressionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__SchemeList__ExpressionsAssignment_3_in_rule__SchemeList__Group__3__Impl8694);
            	    rule__SchemeList__ExpressionsAssignment_3();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4117:1: rule__SchemeList__Group__4 : rule__SchemeList__Group__4__Impl ;
    public final void rule__SchemeList__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4121:1: ( rule__SchemeList__Group__4__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4122:2: rule__SchemeList__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__SchemeList__Group__4__Impl_in_rule__SchemeList__Group__48725);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4128:1: rule__SchemeList__Group__4__Impl : ( KEYWORD_6 ) ;
    public final void rule__SchemeList__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4132:1: ( ( KEYWORD_6 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4133:1: ( KEYWORD_6 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4133:1: ( KEYWORD_6 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4134:1: KEYWORD_6
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeListAccess().getRightParenthesisKeyword_4()); 
            }
            match(input,KEYWORD_6,FOLLOW_KEYWORD_6_in_rule__SchemeList__Group__4__Impl8753); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4157:1: rule__SchemeBlock__Group__0 : rule__SchemeBlock__Group__0__Impl rule__SchemeBlock__Group__1 ;
    public final void rule__SchemeBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4161:1: ( rule__SchemeBlock__Group__0__Impl rule__SchemeBlock__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4162:2: rule__SchemeBlock__Group__0__Impl rule__SchemeBlock__Group__1
            {
            pushFollow(FOLLOW_rule__SchemeBlock__Group__0__Impl_in_rule__SchemeBlock__Group__08794);
            rule__SchemeBlock__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeBlock__Group__1_in_rule__SchemeBlock__Group__08797);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4169:1: rule__SchemeBlock__Group__0__Impl : ( KEYWORD_22 ) ;
    public final void rule__SchemeBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4173:1: ( ( KEYWORD_22 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4174:1: ( KEYWORD_22 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4174:1: ( KEYWORD_22 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4175:1: KEYWORD_22
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeBlockAccess().getNumberSignLeftCurlyBracketKeyword_0()); 
            }
            match(input,KEYWORD_22,FOLLOW_KEYWORD_22_in_rule__SchemeBlock__Group__0__Impl8825); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4188:1: rule__SchemeBlock__Group__1 : rule__SchemeBlock__Group__1__Impl rule__SchemeBlock__Group__2 ;
    public final void rule__SchemeBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4192:1: ( rule__SchemeBlock__Group__1__Impl rule__SchemeBlock__Group__2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4193:2: rule__SchemeBlock__Group__1__Impl rule__SchemeBlock__Group__2
            {
            pushFollow(FOLLOW_rule__SchemeBlock__Group__1__Impl_in_rule__SchemeBlock__Group__18856);
            rule__SchemeBlock__Group__1__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeBlock__Group__2_in_rule__SchemeBlock__Group__18859);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4200:1: rule__SchemeBlock__Group__1__Impl : ( ( ( rule__SchemeBlock__ExpressionsAssignment_1 ) ) ( ( rule__SchemeBlock__ExpressionsAssignment_1 )* ) ) ;
    public final void rule__SchemeBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4204:1: ( ( ( ( rule__SchemeBlock__ExpressionsAssignment_1 ) ) ( ( rule__SchemeBlock__ExpressionsAssignment_1 )* ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4205:1: ( ( ( rule__SchemeBlock__ExpressionsAssignment_1 ) ) ( ( rule__SchemeBlock__ExpressionsAssignment_1 )* ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4205:1: ( ( ( rule__SchemeBlock__ExpressionsAssignment_1 ) ) ( ( rule__SchemeBlock__ExpressionsAssignment_1 )* ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4206:1: ( ( rule__SchemeBlock__ExpressionsAssignment_1 ) ) ( ( rule__SchemeBlock__ExpressionsAssignment_1 )* )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4206:1: ( ( rule__SchemeBlock__ExpressionsAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4207:1: ( rule__SchemeBlock__ExpressionsAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeBlockAccess().getExpressionsAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4208:1: ( rule__SchemeBlock__ExpressionsAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4208:2: rule__SchemeBlock__ExpressionsAssignment_1
            {
            pushFollow(FOLLOW_rule__SchemeBlock__ExpressionsAssignment_1_in_rule__SchemeBlock__Group__1__Impl8888);
            rule__SchemeBlock__ExpressionsAssignment_1();
            _fsp--;
            if (failed) return ;

            }

            if ( backtracking==0 ) {
               after(grammarAccess.getSchemeBlockAccess().getExpressionsAssignment_1()); 
            }

            }

            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4211:1: ( ( rule__SchemeBlock__ExpressionsAssignment_1 )* )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4212:1: ( rule__SchemeBlock__ExpressionsAssignment_1 )*
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeBlockAccess().getExpressionsAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4213:1: ( rule__SchemeBlock__ExpressionsAssignment_1 )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( ((LA34_0>=KEYWORD_87 && LA34_0<=KEYWORD_29)||LA34_0==KEYWORD_24||(LA34_0>=KEYWORD_26 && LA34_0<=KEYWORD_2)||(LA34_0>=KEYWORD_4 && LA34_0<=KEYWORD_15)||LA34_0==KEYWORD_17||(LA34_0>=KEYWORD_19 && LA34_0<=RULE_ID)||LA34_0==RULE_ANY_OTHER) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4213:2: rule__SchemeBlock__ExpressionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__SchemeBlock__ExpressionsAssignment_1_in_rule__SchemeBlock__Group__1__Impl8900);
            	    rule__SchemeBlock__ExpressionsAssignment_1();
            	    _fsp--;
            	    if (failed) return ;

            	    }
            	    break;

            	default :
            	    break loop34;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4224:1: rule__SchemeBlock__Group__2 : rule__SchemeBlock__Group__2__Impl ;
    public final void rule__SchemeBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4228:1: ( rule__SchemeBlock__Group__2__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4229:2: rule__SchemeBlock__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SchemeBlock__Group__2__Impl_in_rule__SchemeBlock__Group__28933);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4235:1: rule__SchemeBlock__Group__2__Impl : ( KEYWORD_23 ) ;
    public final void rule__SchemeBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4239:1: ( ( KEYWORD_23 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4240:1: ( KEYWORD_23 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4240:1: ( KEYWORD_23 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4241:1: KEYWORD_23
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeBlockAccess().getNumberSignRightCurlyBracketKeyword_2()); 
            }
            match(input,KEYWORD_23,FOLLOW_KEYWORD_23_in_rule__SchemeBlock__Group__2__Impl8961); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4260:1: rule__SchemeCharacter__Group__0 : rule__SchemeCharacter__Group__0__Impl rule__SchemeCharacter__Group__1 ;
    public final void rule__SchemeCharacter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4264:1: ( rule__SchemeCharacter__Group__0__Impl rule__SchemeCharacter__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4265:2: rule__SchemeCharacter__Group__0__Impl rule__SchemeCharacter__Group__1
            {
            pushFollow(FOLLOW_rule__SchemeCharacter__Group__0__Impl_in_rule__SchemeCharacter__Group__08998);
            rule__SchemeCharacter__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeCharacter__Group__1_in_rule__SchemeCharacter__Group__09001);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4272:1: rule__SchemeCharacter__Group__0__Impl : ( KEYWORD_21 ) ;
    public final void rule__SchemeCharacter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4276:1: ( ( KEYWORD_21 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4277:1: ( KEYWORD_21 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4277:1: ( KEYWORD_21 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4278:1: KEYWORD_21
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeCharacterAccess().getNumberSignReverseSolidusKeyword_0()); 
            }
            match(input,KEYWORD_21,FOLLOW_KEYWORD_21_in_rule__SchemeCharacter__Group__0__Impl9029); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4291:1: rule__SchemeCharacter__Group__1 : rule__SchemeCharacter__Group__1__Impl ;
    public final void rule__SchemeCharacter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4295:1: ( rule__SchemeCharacter__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4296:2: rule__SchemeCharacter__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SchemeCharacter__Group__1__Impl_in_rule__SchemeCharacter__Group__19060);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4302:1: rule__SchemeCharacter__Group__1__Impl : ( ( rule__SchemeCharacter__ValueAssignment_1 ) ) ;
    public final void rule__SchemeCharacter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4306:1: ( ( ( rule__SchemeCharacter__ValueAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4307:1: ( ( rule__SchemeCharacter__ValueAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4307:1: ( ( rule__SchemeCharacter__ValueAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4308:1: ( rule__SchemeCharacter__ValueAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeCharacterAccess().getValueAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4309:1: ( rule__SchemeCharacter__ValueAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4309:2: rule__SchemeCharacter__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__SchemeCharacter__ValueAssignment_1_in_rule__SchemeCharacter__Group__1__Impl9087);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4323:1: rule__SchemeId__Group__0 : rule__SchemeId__Group__0__Impl rule__SchemeId__Group__1 ;
    public final void rule__SchemeId__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4327:1: ( rule__SchemeId__Group__0__Impl rule__SchemeId__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4328:2: rule__SchemeId__Group__0__Impl rule__SchemeId__Group__1
            {
            pushFollow(FOLLOW_rule__SchemeId__Group__0__Impl_in_rule__SchemeId__Group__09121);
            rule__SchemeId__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeId__Group__1_in_rule__SchemeId__Group__09124);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4335:1: rule__SchemeId__Group__0__Impl : ( ruleSchemeTextLiteral ) ;
    public final void rule__SchemeId__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4339:1: ( ( ruleSchemeTextLiteral ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4340:1: ( ruleSchemeTextLiteral )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4340:1: ( ruleSchemeTextLiteral )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4341:1: ruleSchemeTextLiteral
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeIdAccess().getSchemeTextLiteralParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleSchemeTextLiteral_in_rule__SchemeId__Group__0__Impl9151);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4352:1: rule__SchemeId__Group__1 : rule__SchemeId__Group__1__Impl ;
    public final void rule__SchemeId__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4356:1: ( rule__SchemeId__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4357:2: rule__SchemeId__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SchemeId__Group__1__Impl_in_rule__SchemeId__Group__19180);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4363:1: rule__SchemeId__Group__1__Impl : ( ( rule__SchemeId__Group_1__0 )? ) ;
    public final void rule__SchemeId__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4367:1: ( ( ( rule__SchemeId__Group_1__0 )? ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4368:1: ( ( rule__SchemeId__Group_1__0 )? )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4368:1: ( ( rule__SchemeId__Group_1__0 )? )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4369:1: ( rule__SchemeId__Group_1__0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeIdAccess().getGroup_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4370:1: ( rule__SchemeId__Group_1__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==KEYWORD_9) ) {
                switch ( input.LA(2) ) {
                    case RULE_ID:
                        {
                        int LA35_3 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case RULE_STRING:
                        {
                        int LA35_4 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_26:
                        {
                        int LA35_5 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_11:
                        {
                        int LA35_6 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_1:
                        {
                        int LA35_7 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_7:
                        {
                        int LA35_8 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_10:
                        {
                        int LA35_9 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_12:
                        {
                        int LA35_10 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_13:
                        {
                        int LA35_11 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_15:
                        {
                        int LA35_12 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_19:
                        {
                        int LA35_13 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_62:
                        {
                        int LA35_14 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_64:
                        {
                        int LA35_15 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_53:
                        {
                        int LA35_16 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_82:
                        {
                        int LA35_17 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_59:
                        {
                        int LA35_18 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_58:
                        {
                        int LA35_19 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_73:
                        {
                        int LA35_20 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_40:
                        {
                        int LA35_21 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_80:
                        {
                        int LA35_22 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_30:
                        {
                        int LA35_23 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_65:
                        {
                        int LA35_24 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_47:
                        {
                        int LA35_25 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_74:
                        {
                        int LA35_26 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_48:
                        {
                        int LA35_27 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_66:
                        {
                        int LA35_28 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_60:
                        {
                        int LA35_29 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_83:
                        {
                        int LA35_30 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_49:
                        {
                        int LA35_31 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_81:
                        {
                        int LA35_32 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_67:
                        {
                        int LA35_33 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_41:
                        {
                        int LA35_34 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_78:
                        {
                        int LA35_35 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_61:
                        {
                        int LA35_36 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_87:
                        {
                        int LA35_37 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_50:
                        {
                        int LA35_38 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_27:
                        {
                        int LA35_39 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_51:
                        {
                        int LA35_40 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_75:
                        {
                        int LA35_41 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_52:
                        {
                        int LA35_42 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_68:
                        {
                        int LA35_43 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_76:
                        {
                        int LA35_44 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_31:
                        {
                        int LA35_45 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_32:
                        {
                        int LA35_46 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_33:
                        {
                        int LA35_47 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_28:
                        {
                        int LA35_48 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_69:
                        {
                        int LA35_49 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_70:
                        {
                        int LA35_50 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_54:
                        {
                        int LA35_51 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_34:
                        {
                        int LA35_52 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_71:
                        {
                        int LA35_53 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_42:
                        {
                        int LA35_54 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_63:
                        {
                        int LA35_55 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_72:
                        {
                        int LA35_56 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_55:
                        {
                        int LA35_57 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_56:
                        {
                        int LA35_58 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_35:
                        {
                        int LA35_59 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_57:
                        {
                        int LA35_60 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_43:
                        {
                        int LA35_61 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_79:
                        {
                        int LA35_62 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_29:
                        {
                        int LA35_63 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_84:
                        {
                        int LA35_64 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_36:
                        {
                        int LA35_65 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_85:
                        {
                        int LA35_66 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_86:
                        {
                        int LA35_67 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_44:
                        {
                        int LA35_68 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_37:
                        {
                        int LA35_69 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_45:
                        {
                        int LA35_70 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_77:
                        {
                        int LA35_71 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_38:
                        {
                        int LA35_72 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_46:
                        {
                        int LA35_73 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case KEYWORD_39:
                        {
                        int LA35_74 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                    case RULE_ANY_OTHER:
                        {
                        int LA35_75 = input.LA(3);

                        if ( (synpred127()) ) {
                            alt35=1;
                        }
                        }
                        break;
                }

            }
            switch (alt35) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4370:2: rule__SchemeId__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__SchemeId__Group_1__0_in_rule__SchemeId__Group__1__Impl9207);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4384:1: rule__SchemeId__Group_1__0 : rule__SchemeId__Group_1__0__Impl rule__SchemeId__Group_1__1 ;
    public final void rule__SchemeId__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4388:1: ( rule__SchemeId__Group_1__0__Impl rule__SchemeId__Group_1__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4389:2: rule__SchemeId__Group_1__0__Impl rule__SchemeId__Group_1__1
            {
            pushFollow(FOLLOW_rule__SchemeId__Group_1__0__Impl_in_rule__SchemeId__Group_1__09242);
            rule__SchemeId__Group_1__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeId__Group_1__1_in_rule__SchemeId__Group_1__09245);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4396:1: rule__SchemeId__Group_1__0__Impl : ( KEYWORD_9 ) ;
    public final void rule__SchemeId__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4400:1: ( ( KEYWORD_9 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4401:1: ( KEYWORD_9 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4401:1: ( KEYWORD_9 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4402:1: KEYWORD_9
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeIdAccess().getColonKeyword_1_0()); 
            }
            match(input,KEYWORD_9,FOLLOW_KEYWORD_9_in_rule__SchemeId__Group_1__0__Impl9273); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4415:1: rule__SchemeId__Group_1__1 : rule__SchemeId__Group_1__1__Impl ;
    public final void rule__SchemeId__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4419:1: ( rule__SchemeId__Group_1__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4420:2: rule__SchemeId__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SchemeId__Group_1__1__Impl_in_rule__SchemeId__Group_1__19304);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4426:1: rule__SchemeId__Group_1__1__Impl : ( ruleSchemeTextLiteral ) ;
    public final void rule__SchemeId__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4430:1: ( ( ruleSchemeTextLiteral ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4431:1: ( ruleSchemeTextLiteral )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4431:1: ( ruleSchemeTextLiteral )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4432:1: ruleSchemeTextLiteral
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeIdAccess().getSchemeTextLiteralParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_ruleSchemeTextLiteral_in_rule__SchemeId__Group_1__1__Impl9331);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4447:1: rule__SchemeNumber__Group__0 : rule__SchemeNumber__Group__0__Impl rule__SchemeNumber__Group__1 ;
    public final void rule__SchemeNumber__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4451:1: ( rule__SchemeNumber__Group__0__Impl rule__SchemeNumber__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4452:2: rule__SchemeNumber__Group__0__Impl rule__SchemeNumber__Group__1
            {
            pushFollow(FOLLOW_rule__SchemeNumber__Group__0__Impl_in_rule__SchemeNumber__Group__09364);
            rule__SchemeNumber__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeNumber__Group__1_in_rule__SchemeNumber__Group__09367);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4459:1: rule__SchemeNumber__Group__0__Impl : ( ( rule__SchemeNumber__RadixAssignment_0 )? ) ;
    public final void rule__SchemeNumber__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4463:1: ( ( ( rule__SchemeNumber__RadixAssignment_0 )? ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4464:1: ( ( rule__SchemeNumber__RadixAssignment_0 )? )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4464:1: ( ( rule__SchemeNumber__RadixAssignment_0 )? )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4465:1: ( rule__SchemeNumber__RadixAssignment_0 )?
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeNumberAccess().getRadixAssignment_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4466:1: ( rule__SchemeNumber__RadixAssignment_0 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==KEYWORD_2) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4466:2: rule__SchemeNumber__RadixAssignment_0
                    {
                    pushFollow(FOLLOW_rule__SchemeNumber__RadixAssignment_0_in_rule__SchemeNumber__Group__0__Impl9394);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4476:1: rule__SchemeNumber__Group__1 : rule__SchemeNumber__Group__1__Impl ;
    public final void rule__SchemeNumber__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4480:1: ( rule__SchemeNumber__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4481:2: rule__SchemeNumber__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SchemeNumber__Group__1__Impl_in_rule__SchemeNumber__Group__19425);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4487:1: rule__SchemeNumber__Group__1__Impl : ( ( rule__SchemeNumber__ValueAssignment_1 ) ) ;
    public final void rule__SchemeNumber__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4491:1: ( ( ( rule__SchemeNumber__ValueAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4492:1: ( ( rule__SchemeNumber__ValueAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4492:1: ( ( rule__SchemeNumber__ValueAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4493:1: ( rule__SchemeNumber__ValueAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeNumberAccess().getValueAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4494:1: ( rule__SchemeNumber__ValueAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4494:2: rule__SchemeNumber__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__SchemeNumber__ValueAssignment_1_in_rule__SchemeNumber__Group__1__Impl9452);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4508:1: rule__SchemeNumberRadix__Group__0 : rule__SchemeNumberRadix__Group__0__Impl rule__SchemeNumberRadix__Group__1 ;
    public final void rule__SchemeNumberRadix__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4512:1: ( rule__SchemeNumberRadix__Group__0__Impl rule__SchemeNumberRadix__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4513:2: rule__SchemeNumberRadix__Group__0__Impl rule__SchemeNumberRadix__Group__1
            {
            pushFollow(FOLLOW_rule__SchemeNumberRadix__Group__0__Impl_in_rule__SchemeNumberRadix__Group__09486);
            rule__SchemeNumberRadix__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeNumberRadix__Group__1_in_rule__SchemeNumberRadix__Group__09489);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4520:1: rule__SchemeNumberRadix__Group__0__Impl : ( KEYWORD_2 ) ;
    public final void rule__SchemeNumberRadix__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4524:1: ( ( KEYWORD_2 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4525:1: ( KEYWORD_2 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4525:1: ( KEYWORD_2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4526:1: KEYWORD_2
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeNumberRadixAccess().getNumberSignKeyword_0()); 
            }
            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_rule__SchemeNumberRadix__Group__0__Impl9517); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4539:1: rule__SchemeNumberRadix__Group__1 : rule__SchemeNumberRadix__Group__1__Impl ;
    public final void rule__SchemeNumberRadix__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4543:1: ( rule__SchemeNumberRadix__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4544:2: rule__SchemeNumberRadix__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SchemeNumberRadix__Group__1__Impl_in_rule__SchemeNumberRadix__Group__19548);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4550:1: rule__SchemeNumberRadix__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__SchemeNumberRadix__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4554:1: ( ( RULE_ID ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4555:1: ( RULE_ID )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4555:1: ( RULE_ID )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4556:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeNumberRadixAccess().getIDTerminalRuleCall_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__SchemeNumberRadix__Group__1__Impl9575); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4571:1: rule__SchemeMarkupCommand__Group__0 : rule__SchemeMarkupCommand__Group__0__Impl rule__SchemeMarkupCommand__Group__1 ;
    public final void rule__SchemeMarkupCommand__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4575:1: ( rule__SchemeMarkupCommand__Group__0__Impl rule__SchemeMarkupCommand__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4576:2: rule__SchemeMarkupCommand__Group__0__Impl rule__SchemeMarkupCommand__Group__1
            {
            pushFollow(FOLLOW_rule__SchemeMarkupCommand__Group__0__Impl_in_rule__SchemeMarkupCommand__Group__09608);
            rule__SchemeMarkupCommand__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__SchemeMarkupCommand__Group__1_in_rule__SchemeMarkupCommand__Group__09611);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4583:1: rule__SchemeMarkupCommand__Group__0__Impl : ( KEYWORD_20 ) ;
    public final void rule__SchemeMarkupCommand__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4587:1: ( ( KEYWORD_20 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4588:1: ( KEYWORD_20 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4588:1: ( KEYWORD_20 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4589:1: KEYWORD_20
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeMarkupCommandAccess().getNumberSignColonKeyword_0()); 
            }
            match(input,KEYWORD_20,FOLLOW_KEYWORD_20_in_rule__SchemeMarkupCommand__Group__0__Impl9639); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4602:1: rule__SchemeMarkupCommand__Group__1 : rule__SchemeMarkupCommand__Group__1__Impl ;
    public final void rule__SchemeMarkupCommand__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4606:1: ( rule__SchemeMarkupCommand__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4607:2: rule__SchemeMarkupCommand__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SchemeMarkupCommand__Group__1__Impl_in_rule__SchemeMarkupCommand__Group__19670);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4613:1: rule__SchemeMarkupCommand__Group__1__Impl : ( ( rule__SchemeMarkupCommand__CommandAssignment_1 ) ) ;
    public final void rule__SchemeMarkupCommand__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4617:1: ( ( ( rule__SchemeMarkupCommand__CommandAssignment_1 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4618:1: ( ( rule__SchemeMarkupCommand__CommandAssignment_1 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4618:1: ( ( rule__SchemeMarkupCommand__CommandAssignment_1 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4619:1: ( rule__SchemeMarkupCommand__CommandAssignment_1 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeMarkupCommandAccess().getCommandAssignment_1()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4620:1: ( rule__SchemeMarkupCommand__CommandAssignment_1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4620:2: rule__SchemeMarkupCommand__CommandAssignment_1
            {
            pushFollow(FOLLOW_rule__SchemeMarkupCommand__CommandAssignment_1_in_rule__SchemeMarkupCommand__Group__1__Impl9697);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4634:1: rule__BOOL__Group__0 : rule__BOOL__Group__0__Impl rule__BOOL__Group__1 ;
    public final void rule__BOOL__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4638:1: ( rule__BOOL__Group__0__Impl rule__BOOL__Group__1 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4639:2: rule__BOOL__Group__0__Impl rule__BOOL__Group__1
            {
            pushFollow(FOLLOW_rule__BOOL__Group__0__Impl_in_rule__BOOL__Group__09731);
            rule__BOOL__Group__0__Impl();
            _fsp--;
            if (failed) return ;
            pushFollow(FOLLOW_rule__BOOL__Group__1_in_rule__BOOL__Group__09734);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4646:1: rule__BOOL__Group__0__Impl : ( KEYWORD_2 ) ;
    public final void rule__BOOL__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4650:1: ( ( KEYWORD_2 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4651:1: ( KEYWORD_2 )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4651:1: ( KEYWORD_2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4652:1: KEYWORD_2
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBOOLAccess().getNumberSignKeyword_0()); 
            }
            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_rule__BOOL__Group__0__Impl9762); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4665:1: rule__BOOL__Group__1 : rule__BOOL__Group__1__Impl ;
    public final void rule__BOOL__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4669:1: ( rule__BOOL__Group__1__Impl )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4670:2: rule__BOOL__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__BOOL__Group__1__Impl_in_rule__BOOL__Group__19793);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4676:1: rule__BOOL__Group__1__Impl : ( RULE_ID ) ;
    public final void rule__BOOL__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4680:1: ( ( RULE_ID ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4681:1: ( RULE_ID )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4681:1: ( RULE_ID )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4682:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getBOOLAccess().getIDTerminalRuleCall_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__BOOL__Group__1__Impl9820); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4698:1: rule__LilyPond__ExpressionsAssignment : ( ruleToplevelExpression ) ;
    public final void rule__LilyPond__ExpressionsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4702:1: ( ( ruleToplevelExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4703:1: ( ruleToplevelExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4703:1: ( ruleToplevelExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4704:1: ruleToplevelExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getLilyPondAccess().getExpressionsToplevelExpressionParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleToplevelExpression_in_rule__LilyPond__ExpressionsAssignment9858);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4713:1: rule__Assignment__NameAssignment_0 : ( ( rule__Assignment__NameAlternatives_0_0 ) ) ;
    public final void rule__Assignment__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4717:1: ( ( ( rule__Assignment__NameAlternatives_0_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4718:1: ( ( rule__Assignment__NameAlternatives_0_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4718:1: ( ( rule__Assignment__NameAlternatives_0_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4719:1: ( rule__Assignment__NameAlternatives_0_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getNameAlternatives_0_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4720:1: ( rule__Assignment__NameAlternatives_0_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4720:2: rule__Assignment__NameAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__Assignment__NameAlternatives_0_0_in_rule__Assignment__NameAssignment_09889);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4729:1: rule__Assignment__ValueAssignment_2 : ( ruleExpression ) ;
    public final void rule__Assignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4733:1: ( ( ruleExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4734:1: ( ruleExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4734:1: ( ruleExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4735:1: ruleExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getAssignmentAccess().getValueExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__Assignment__ValueAssignment_29922);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4744:1: rule__PropertyAssignment__IdAssignment_0 : ( ( rule__PropertyAssignment__IdAlternatives_0_0 ) ) ;
    public final void rule__PropertyAssignment__IdAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4748:1: ( ( ( rule__PropertyAssignment__IdAlternatives_0_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4749:1: ( ( rule__PropertyAssignment__IdAlternatives_0_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4749:1: ( ( rule__PropertyAssignment__IdAlternatives_0_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4750:1: ( rule__PropertyAssignment__IdAlternatives_0_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPropertyAssignmentAccess().getIdAlternatives_0_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4751:1: ( rule__PropertyAssignment__IdAlternatives_0_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4751:2: rule__PropertyAssignment__IdAlternatives_0_0
            {
            pushFollow(FOLLOW_rule__PropertyAssignment__IdAlternatives_0_0_in_rule__PropertyAssignment__IdAssignment_09953);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4760:1: rule__PropertyAssignment__ValueAssignment_2 : ( ruleExpression ) ;
    public final void rule__PropertyAssignment__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4764:1: ( ( ruleExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4765:1: ( ruleExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4765:1: ( ruleExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4766:1: ruleExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getPropertyAssignmentAccess().getValueExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__PropertyAssignment__ValueAssignment_29986);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4775:1: rule__SimpleBlock__ExpressionsAssignment_2 : ( ruleExpression ) ;
    public final void rule__SimpleBlock__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4779:1: ( ( ruleExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4780:1: ( ruleExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4780:1: ( ruleExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4781:1: ruleExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimpleBlockAccess().getExpressionsExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__SimpleBlock__ExpressionsAssignment_210017);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4790:1: rule__SimultaneousBlock__ExpressionsAssignment_2 : ( ruleExpression ) ;
    public final void rule__SimultaneousBlock__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4794:1: ( ( ruleExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4795:1: ( ruleExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4795:1: ( ruleExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4796:1: ruleExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSimultaneousBlockAccess().getExpressionsExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__SimultaneousBlock__ExpressionsAssignment_210048);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4805:1: rule__Include__ImportURIAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Include__ImportURIAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4809:1: ( ( RULE_STRING ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4810:1: ( RULE_STRING )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4810:1: ( RULE_STRING )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4811:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getIncludeAccess().getImportURISTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Include__ImportURIAssignment_210079); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4820:1: rule__Version__VersionAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Version__VersionAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4824:1: ( ( RULE_STRING ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4825:1: ( RULE_STRING )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4825:1: ( RULE_STRING )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4826:1: RULE_STRING
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getVersionAccess().getVersionSTRINGTerminalRuleCall_2_0()); 
            }
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Version__VersionAssignment_210110); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4835:1: rule__Markup__BodyAssignment_2 : ( ruleMarkupBody ) ;
    public final void rule__Markup__BodyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4839:1: ( ( ruleMarkupBody ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4840:1: ( ruleMarkupBody )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4840:1: ( ruleMarkupBody )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4841:1: ruleMarkupBody
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupAccess().getBodyMarkupBodyParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleMarkupBody_in_rule__Markup__BodyAssignment_210141);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4850:1: rule__MarkupLines__BodyAssignment_2 : ( ruleMarkupBody ) ;
    public final void rule__MarkupLines__BodyAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4854:1: ( ( ruleMarkupBody ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4855:1: ( ruleMarkupBody )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4855:1: ( ruleMarkupBody )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4856:1: ruleMarkupBody
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupLinesAccess().getBodyMarkupBodyParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleMarkupBody_in_rule__MarkupLines__BodyAssignment_210172);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4865:1: rule__MarkupBody__CommandAssignment_1 : ( ( rule__MarkupBody__CommandAlternatives_1_0 ) ) ;
    public final void rule__MarkupBody__CommandAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4869:1: ( ( ( rule__MarkupBody__CommandAlternatives_1_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4870:1: ( ( rule__MarkupBody__CommandAlternatives_1_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4870:1: ( ( rule__MarkupBody__CommandAlternatives_1_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4871:1: ( rule__MarkupBody__CommandAlternatives_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupBodyAccess().getCommandAlternatives_1_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4872:1: ( rule__MarkupBody__CommandAlternatives_1_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4872:2: rule__MarkupBody__CommandAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__MarkupBody__CommandAlternatives_1_0_in_rule__MarkupBody__CommandAssignment_110203);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4881:1: rule__MarkupBody__BlockAssignment_2 : ( ruleUnparsedBlock ) ;
    public final void rule__MarkupBody__BlockAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4885:1: ( ( ruleUnparsedBlock ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4886:1: ( ruleUnparsedBlock )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4886:1: ( ruleUnparsedBlock )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4887:1: ruleUnparsedBlock
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getMarkupBodyAccess().getBlockUnparsedBlockParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleUnparsedBlock_in_rule__MarkupBody__BlockAssignment_210236);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4896:1: rule__Context__BlockAssignment_3 : ( ruleUnparsedBlock ) ;
    public final void rule__Context__BlockAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4900:1: ( ( ruleUnparsedBlock ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4901:1: ( ruleUnparsedBlock )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4901:1: ( ruleUnparsedBlock )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4902:1: ruleUnparsedBlock
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getContextAccess().getBlockUnparsedBlockParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleUnparsedBlock_in_rule__Context__BlockAssignment_310267);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4911:1: rule__Other__KeywordAssignment_1 : ( ( rule__Other__KeywordAlternatives_1_0 ) ) ;
    public final void rule__Other__KeywordAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4915:1: ( ( ( rule__Other__KeywordAlternatives_1_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4916:1: ( ( rule__Other__KeywordAlternatives_1_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4916:1: ( ( rule__Other__KeywordAlternatives_1_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4917:1: ( rule__Other__KeywordAlternatives_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getOtherAccess().getKeywordAlternatives_1_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4918:1: ( rule__Other__KeywordAlternatives_1_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4918:2: rule__Other__KeywordAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__Other__KeywordAlternatives_1_0_in_rule__Other__KeywordAssignment_110298);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4927:1: rule__UnparsedBlock__ExpressionsAssignment_2 : ( ruleUnparsedExpression ) ;
    public final void rule__UnparsedBlock__ExpressionsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4931:1: ( ( ruleUnparsedExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4932:1: ( ruleUnparsedExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4932:1: ( ruleUnparsedExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4933:1: ruleUnparsedExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnparsedBlockAccess().getExpressionsUnparsedExpressionParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_ruleUnparsedExpression_in_rule__UnparsedBlock__ExpressionsAssignment_210331);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4942:1: rule__UnparsedCommand__CommandAssignment_1 : ( ( rule__UnparsedCommand__CommandAlternatives_1_0 ) ) ;
    public final void rule__UnparsedCommand__CommandAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4946:1: ( ( ( rule__UnparsedCommand__CommandAlternatives_1_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4947:1: ( ( rule__UnparsedCommand__CommandAlternatives_1_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4947:1: ( ( rule__UnparsedCommand__CommandAlternatives_1_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4948:1: ( rule__UnparsedCommand__CommandAlternatives_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getUnparsedCommandAccess().getCommandAlternatives_1_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4949:1: ( rule__UnparsedCommand__CommandAlternatives_1_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4949:2: rule__UnparsedCommand__CommandAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__UnparsedCommand__CommandAlternatives_1_0_in_rule__UnparsedCommand__CommandAssignment_110362);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4958:1: rule__Reference__AssignmentAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Reference__AssignmentAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4962:1: ( ( ( RULE_ID ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4963:1: ( ( RULE_ID ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4963:1: ( ( RULE_ID ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4964:1: ( RULE_ID )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getAssignmentAssignmentCrossReference_1_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4965:1: ( RULE_ID )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4966:1: RULE_ID
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getReferenceAccess().getAssignmentAssignmentIDTerminalRuleCall_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Reference__AssignmentAssignment_110399); if (failed) return ;
            if ( backtracking==0 ) {
               after(grammarAccess.getReferenceAccess().getAssignmentAssignmentIDTerminalRuleCall_1_0_1()); 
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4977:1: rule__Text__ValueAssignment : ( ( rule__Text__ValueAlternatives_0 ) ) ;
    public final void rule__Text__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4981:1: ( ( ( rule__Text__ValueAlternatives_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4982:1: ( ( rule__Text__ValueAlternatives_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4982:1: ( ( rule__Text__ValueAlternatives_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4983:1: ( rule__Text__ValueAlternatives_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getTextAccess().getValueAlternatives_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4984:1: ( rule__Text__ValueAlternatives_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4984:2: rule__Text__ValueAlternatives_0
            {
            pushFollow(FOLLOW_rule__Text__ValueAlternatives_0_in_rule__Text__ValueAssignment10434);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4993:1: rule__Number__ValueAssignment : ( RULE_INT ) ;
    public final void rule__Number__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4997:1: ( ( RULE_INT ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4998:1: ( RULE_INT )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4998:1: ( RULE_INT )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4999:1: RULE_INT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Number__ValueAssignment10467); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5008:1: rule__Scheme__ValueAssignment_1 : ( ruleSchemeExpression ) ;
    public final void rule__Scheme__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5012:1: ( ( ruleSchemeExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5013:1: ( ruleSchemeExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5013:1: ( ruleSchemeExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5014:1: ruleSchemeExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeAccess().getValueSchemeExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleSchemeExpression_in_rule__Scheme__ValueAssignment_110498);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5023:1: rule__SchemeExpression__QuotedAssignment_0_0 : ( ( KEYWORD_4 ) ) ;
    public final void rule__SchemeExpression__QuotedAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5027:1: ( ( ( KEYWORD_4 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5028:1: ( ( KEYWORD_4 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5028:1: ( ( KEYWORD_4 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5029:1: ( KEYWORD_4 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getQuotedApostropheKeyword_0_0_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5030:1: ( KEYWORD_4 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5031:1: KEYWORD_4
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getQuotedApostropheKeyword_0_0_0()); 
            }
            match(input,KEYWORD_4,FOLLOW_KEYWORD_4_in_rule__SchemeExpression__QuotedAssignment_0_010534); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5046:1: rule__SchemeExpression__QuasiquotedAssignment_0_1 : ( ( KEYWORD_16 ) ) ;
    public final void rule__SchemeExpression__QuasiquotedAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5050:1: ( ( ( KEYWORD_16 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5051:1: ( ( KEYWORD_16 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5051:1: ( ( KEYWORD_16 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5052:1: ( KEYWORD_16 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getQuasiquotedGraveAccentKeyword_0_1_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5053:1: ( KEYWORD_16 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5054:1: KEYWORD_16
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getQuasiquotedGraveAccentKeyword_0_1_0()); 
            }
            match(input,KEYWORD_16,FOLLOW_KEYWORD_16_in_rule__SchemeExpression__QuasiquotedAssignment_0_110578); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5069:1: rule__SchemeExpression__UnquotedAssignment_0_2 : ( ( KEYWORD_8 ) ) ;
    public final void rule__SchemeExpression__UnquotedAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5073:1: ( ( ( KEYWORD_8 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5074:1: ( ( KEYWORD_8 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5074:1: ( ( KEYWORD_8 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5075:1: ( KEYWORD_8 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getUnquotedCommaKeyword_0_2_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5076:1: ( KEYWORD_8 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5077:1: KEYWORD_8
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getUnquotedCommaKeyword_0_2_0()); 
            }
            match(input,KEYWORD_8,FOLLOW_KEYWORD_8_in_rule__SchemeExpression__UnquotedAssignment_0_210622); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5092:1: rule__SchemeExpression__VariableAssignment_0_3 : ( ( KEYWORD_3 ) ) ;
    public final void rule__SchemeExpression__VariableAssignment_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5096:1: ( ( ( KEYWORD_3 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5097:1: ( ( KEYWORD_3 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5097:1: ( ( KEYWORD_3 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5098:1: ( KEYWORD_3 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getVariableDollarSignKeyword_0_3_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5099:1: ( KEYWORD_3 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5100:1: KEYWORD_3
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getVariableDollarSignKeyword_0_3_0()); 
            }
            match(input,KEYWORD_3,FOLLOW_KEYWORD_3_in_rule__SchemeExpression__VariableAssignment_0_310666); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5115:1: rule__SchemeExpression__ValueAssignment_1 : ( ruleSchemeValue ) ;
    public final void rule__SchemeExpression__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5119:1: ( ( ruleSchemeValue ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5120:1: ( ruleSchemeValue )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5120:1: ( ruleSchemeValue )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5121:1: ruleSchemeValue
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeExpressionAccess().getValueSchemeValueParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleSchemeValue_in_rule__SchemeExpression__ValueAssignment_110705);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5130:1: rule__SchemeBoolean__ValueAssignment : ( ruleBOOL ) ;
    public final void rule__SchemeBoolean__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5134:1: ( ( ruleBOOL ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5135:1: ( ruleBOOL )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5135:1: ( ruleBOOL )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5136:1: ruleBOOL
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeBooleanAccess().getValueBOOLParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleBOOL_in_rule__SchemeBoolean__ValueAssignment10736);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5145:1: rule__SchemeList__VectorAssignment_1 : ( ( KEYWORD_2 ) ) ;
    public final void rule__SchemeList__VectorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5149:1: ( ( ( KEYWORD_2 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5150:1: ( ( KEYWORD_2 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5150:1: ( ( KEYWORD_2 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5151:1: ( KEYWORD_2 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeListAccess().getVectorNumberSignKeyword_1_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5152:1: ( KEYWORD_2 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5153:1: KEYWORD_2
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeListAccess().getVectorNumberSignKeyword_1_0()); 
            }
            match(input,KEYWORD_2,FOLLOW_KEYWORD_2_in_rule__SchemeList__VectorAssignment_110772); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5168:1: rule__SchemeList__ExpressionsAssignment_3 : ( ruleSchemeExpression ) ;
    public final void rule__SchemeList__ExpressionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5172:1: ( ( ruleSchemeExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5173:1: ( ruleSchemeExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5173:1: ( ruleSchemeExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5174:1: ruleSchemeExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeListAccess().getExpressionsSchemeExpressionParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_ruleSchemeExpression_in_rule__SchemeList__ExpressionsAssignment_310811);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5183:1: rule__SchemeBlock__ExpressionsAssignment_1 : ( ruleExpression ) ;
    public final void rule__SchemeBlock__ExpressionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5187:1: ( ( ruleExpression ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5188:1: ( ruleExpression )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5188:1: ( ruleExpression )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5189:1: ruleExpression
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeBlockAccess().getExpressionsExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_ruleExpression_in_rule__SchemeBlock__ExpressionsAssignment_110842);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5198:1: rule__SchemeCharacter__ValueAssignment_1 : ( ( rule__SchemeCharacter__ValueAlternatives_1_0 ) ) ;
    public final void rule__SchemeCharacter__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5202:1: ( ( ( rule__SchemeCharacter__ValueAlternatives_1_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5203:1: ( ( rule__SchemeCharacter__ValueAlternatives_1_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5203:1: ( ( rule__SchemeCharacter__ValueAlternatives_1_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5204:1: ( rule__SchemeCharacter__ValueAlternatives_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeCharacterAccess().getValueAlternatives_1_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5205:1: ( rule__SchemeCharacter__ValueAlternatives_1_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5205:2: rule__SchemeCharacter__ValueAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__SchemeCharacter__ValueAlternatives_1_0_in_rule__SchemeCharacter__ValueAssignment_110873);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5214:1: rule__SchemeText__ValueAssignment : ( ruleSchemeId ) ;
    public final void rule__SchemeText__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5218:1: ( ( ruleSchemeId ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5219:1: ( ruleSchemeId )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5219:1: ( ruleSchemeId )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5220:1: ruleSchemeId
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeTextAccess().getValueSchemeIdParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_ruleSchemeId_in_rule__SchemeText__ValueAssignment10906);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5229:1: rule__SchemeNumber__RadixAssignment_0 : ( ruleSchemeNumberRadix ) ;
    public final void rule__SchemeNumber__RadixAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5233:1: ( ( ruleSchemeNumberRadix ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5234:1: ( ruleSchemeNumberRadix )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5234:1: ( ruleSchemeNumberRadix )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5235:1: ruleSchemeNumberRadix
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeNumberAccess().getRadixSchemeNumberRadixParserRuleCall_0_0()); 
            }
            pushFollow(FOLLOW_ruleSchemeNumberRadix_in_rule__SchemeNumber__RadixAssignment_010937);
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5244:1: rule__SchemeNumber__ValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__SchemeNumber__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5248:1: ( ( RULE_INT ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5249:1: ( RULE_INT )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5249:1: ( RULE_INT )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5250:1: RULE_INT
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeNumberAccess().getValueINTTerminalRuleCall_1_0()); 
            }
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__SchemeNumber__ValueAssignment_110968); if (failed) return ;
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
    // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5259:1: rule__SchemeMarkupCommand__CommandAssignment_1 : ( ( rule__SchemeMarkupCommand__CommandAlternatives_1_0 ) ) ;
    public final void rule__SchemeMarkupCommand__CommandAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5263:1: ( ( ( rule__SchemeMarkupCommand__CommandAlternatives_1_0 ) ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5264:1: ( ( rule__SchemeMarkupCommand__CommandAlternatives_1_0 ) )
            {
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5264:1: ( ( rule__SchemeMarkupCommand__CommandAlternatives_1_0 ) )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5265:1: ( rule__SchemeMarkupCommand__CommandAlternatives_1_0 )
            {
            if ( backtracking==0 ) {
               before(grammarAccess.getSchemeMarkupCommandAccess().getCommandAlternatives_1_0()); 
            }
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5266:1: ( rule__SchemeMarkupCommand__CommandAlternatives_1_0 )
            // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:5266:2: rule__SchemeMarkupCommand__CommandAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__SchemeMarkupCommand__CommandAlternatives_1_0_in_rule__SchemeMarkupCommand__CommandAssignment_110999);
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
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1337:1: ( ( ruleAssignment ) )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1337:1: ( ruleAssignment )
        {
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1337:1: ( ruleAssignment )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1338:1: ruleAssignment
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getToplevelExpressionAccess().getAssignmentParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_ruleAssignment_in_synpred22730);
        ruleAssignment();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred2

    // $ANTLR start synpred3
    public final void synpred3_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1359:1: ( ( rulePropertyAssignment ) )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1359:1: ( rulePropertyAssignment )
        {
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1359:1: ( rulePropertyAssignment )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:1360:1: rulePropertyAssignment
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getExpressionAccess().getPropertyAssignmentParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_rulePropertyAssignment_in_synpred32779);
        rulePropertyAssignment();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred3

    // $ANTLR start synpred98
    public final void synpred98_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2313:1: ( ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? ) )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2313:1: ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? )
        {
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2313:1: ( ( rule__SchemeExpression__QuotedAssignment_0_0 )? )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2314:1: ( rule__SchemeExpression__QuotedAssignment_0_0 )?
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getSchemeExpressionAccess().getQuotedAssignment_0_0()); 
        }
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2315:1: ( rule__SchemeExpression__QuotedAssignment_0_0 )?
        int alt37=2;
        int LA37_0 = input.LA(1);

        if ( (LA37_0==KEYWORD_4) ) {
            alt37=1;
        }
        switch (alt37) {
            case 1 :
                // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2315:2: rule__SchemeExpression__QuotedAssignment_0_0
                {
                pushFollow(FOLLOW_rule__SchemeExpression__QuotedAssignment_0_0_in_synpred985082);
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
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2319:6: ( ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? ) )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2319:6: ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? )
        {
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2319:6: ( ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )? )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2320:1: ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )?
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getSchemeExpressionAccess().getQuasiquotedAssignment_0_1()); 
        }
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2321:1: ( rule__SchemeExpression__QuasiquotedAssignment_0_1 )?
        int alt38=2;
        int LA38_0 = input.LA(1);

        if ( (LA38_0==KEYWORD_16) ) {
            alt38=1;
        }
        switch (alt38) {
            case 1 :
                // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2321:2: rule__SchemeExpression__QuasiquotedAssignment_0_1
                {
                pushFollow(FOLLOW_rule__SchemeExpression__QuasiquotedAssignment_0_1_in_synpred1005101);
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
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2325:6: ( ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? ) )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2325:6: ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? )
        {
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2325:6: ( ( rule__SchemeExpression__UnquotedAssignment_0_2 )? )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2326:1: ( rule__SchemeExpression__UnquotedAssignment_0_2 )?
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getSchemeExpressionAccess().getUnquotedAssignment_0_2()); 
        }
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2327:1: ( rule__SchemeExpression__UnquotedAssignment_0_2 )?
        int alt39=2;
        int LA39_0 = input.LA(1);

        if ( (LA39_0==KEYWORD_8) ) {
            alt39=1;
        }
        switch (alt39) {
            case 1 :
                // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2327:2: rule__SchemeExpression__UnquotedAssignment_0_2
                {
                pushFollow(FOLLOW_rule__SchemeExpression__UnquotedAssignment_0_2_in_synpred1025120);
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

    // $ANTLR start synpred103
    public final void synpred103_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2347:1: ( ( ruleSchemeBoolean ) )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2347:1: ( ruleSchemeBoolean )
        {
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2347:1: ( ruleSchemeBoolean )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2348:1: ruleSchemeBoolean
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getSchemeValueAccess().getSchemeBooleanParserRuleCall_0()); 
        }
        pushFollow(FOLLOW_ruleSchemeBoolean_in_synpred1035172);
        ruleSchemeBoolean();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred103

    // $ANTLR start synpred108
    public final void synpred108_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2377:6: ( ( ruleSchemeNumber ) )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2377:6: ( ruleSchemeNumber )
        {
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2377:6: ( ruleSchemeNumber )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:2378:1: ruleSchemeNumber
        {
        if ( backtracking==0 ) {
           before(grammarAccess.getSchemeValueAccess().getSchemeNumberParserRuleCall_5()); 
        }
        pushFollow(FOLLOW_ruleSchemeNumber_in_synpred1085257);
        ruleSchemeNumber();
        _fsp--;
        if (failed) return ;

        }


        }
    }
    // $ANTLR end synpred108

    // $ANTLR start synpred120
    public final void synpred120_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3382:2: ( rule__MarkupBody__CommandAssignment_1 )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3382:2: rule__MarkupBody__CommandAssignment_1
        {
        pushFollow(FOLLOW_rule__MarkupBody__CommandAssignment_1_in_synpred1207270);
        rule__MarkupBody__CommandAssignment_1();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred120

    // $ANTLR start synpred121
    public final void synpred121_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3410:2: ( rule__MarkupBody__BlockAssignment_2 )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3410:2: rule__MarkupBody__BlockAssignment_2
        {
        pushFollow(FOLLOW_rule__MarkupBody__BlockAssignment_2_in_synpred1217328);
        rule__MarkupBody__BlockAssignment_2();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred121

    // $ANTLR start synpred122
    public final void synpred122_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3537:2: ( rule__Context__BlockAssignment_3 )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:3537:2: rule__Context__BlockAssignment_3
        {
        pushFollow(FOLLOW_rule__Context__BlockAssignment_3_in_synpred1227577);
        rule__Context__BlockAssignment_3();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred122

    // $ANTLR start synpred127
    public final void synpred127_fragment() throws RecognitionException {   
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4370:2: ( rule__SchemeId__Group_1__0 )
        // ../org.elysium.ui/src-gen/org/elysium/ui/contentassist/antlr/internal/InternalLilyPond.g:4370:2: rule__SchemeId__Group_1__0
        {
        pushFollow(FOLLOW_rule__SchemeId__Group_1__0_in_synpred1279207);
        rule__SchemeId__Group_1__0();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred127

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
    public final boolean synpred127() {
        backtracking++;
        int start = input.mark();
        try {
            synpred127_fragment(); // can never throw exception
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
    public final boolean synpred120() {
        backtracking++;
        int start = input.mark();
        try {
            synpred120_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred103() {
        backtracking++;
        int start = input.mark();
        try {
            synpred103_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred121() {
        backtracking++;
        int start = input.mark();
        try {
            synpred121_fragment(); // can never throw exception
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
    public static final BitSet FOLLOW_rule__LilyPond__ExpressionsAssignment_in_ruleLilyPond97 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0x000000083D7FFBA1L});
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
    public static final BitSet FOLLOW_ruleBOOL_in_entryRuleBOOL2657 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBOOL2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOOL__Group__0_in_ruleBOOL2694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_rule__ToplevelExpression__Alternatives2730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonExpression_in_rule__ToplevelExpression__Alternatives2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyAssignment_in_rule__Expression__Alternatives2779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommonExpression_in_rule__Expression__Alternatives2796 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCommand_in_rule__CommonExpression__Alternatives2828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBlock_in_rule__CommonExpression__Alternatives2845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_rule__CommonExpression__Alternatives2862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__CommonExpression__Alternatives2879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_rule__CommonExpression__Alternatives2896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Assignment__NameAlternatives_0_02928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Assignment__NameAlternatives_0_02945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__PropertyAssignment__IdAlternatives_0_02977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__PropertyAssignment__IdAlternatives_0_02994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimpleBlock_in_rule__Block__Alternatives3026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSimultaneousBlock_in_rule__Block__Alternatives3043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCommand_in_rule__Command__Alternatives3075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReference_in_rule__Command__Alternatives3092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInclude_in_rule__SpecialCommand__Alternatives3124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVersion_in_rule__SpecialCommand__Alternatives3141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkup_in_rule__SpecialCommand__Alternatives3158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupLines_in_rule__SpecialCommand__Alternatives3175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContext_in_rule__SpecialCommand__Alternatives3192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOther_in_rule__SpecialCommand__Alternatives3209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_rule__MarkupBody__CommandAlternatives_1_03241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedCommand_in_rule__MarkupBody__CommandAlternatives_1_03258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCharacter_in_rule__Other__KeywordAlternatives_1_03290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_5_in_rule__Other__KeywordAlternatives_1_03308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_rule__Other__KeywordAlternatives_1_03328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherName_in_rule__Other__KeywordAlternatives_1_03347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_58_in_rule__OtherName__Alternatives3380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_73_in_rule__OtherName__Alternatives3400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_40_in_rule__OtherName__Alternatives3420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_80_in_rule__OtherName__Alternatives3440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_30_in_rule__OtherName__Alternatives3460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_65_in_rule__OtherName__Alternatives3480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_47_in_rule__OtherName__Alternatives3500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_74_in_rule__OtherName__Alternatives3520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_48_in_rule__OtherName__Alternatives3540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_66_in_rule__OtherName__Alternatives3560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_60_in_rule__OtherName__Alternatives3580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_83_in_rule__OtherName__Alternatives3600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_49_in_rule__OtherName__Alternatives3620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_81_in_rule__OtherName__Alternatives3640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_67_in_rule__OtherName__Alternatives3660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_41_in_rule__OtherName__Alternatives3680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_78_in_rule__OtherName__Alternatives3700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_61_in_rule__OtherName__Alternatives3720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_87_in_rule__OtherName__Alternatives3740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_50_in_rule__OtherName__Alternatives3760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_27_in_rule__OtherName__Alternatives3780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_51_in_rule__OtherName__Alternatives3800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_75_in_rule__OtherName__Alternatives3820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_52_in_rule__OtherName__Alternatives3840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_68_in_rule__OtherName__Alternatives3860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_76_in_rule__OtherName__Alternatives3880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_31_in_rule__OtherName__Alternatives3900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_32_in_rule__OtherName__Alternatives3920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_33_in_rule__OtherName__Alternatives3940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_28_in_rule__OtherName__Alternatives3960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_69_in_rule__OtherName__Alternatives3980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_70_in_rule__OtherName__Alternatives4000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_54_in_rule__OtherName__Alternatives4020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_34_in_rule__OtherName__Alternatives4040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_71_in_rule__OtherName__Alternatives4060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_42_in_rule__OtherName__Alternatives4080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_63_in_rule__OtherName__Alternatives4100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_72_in_rule__OtherName__Alternatives4120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_55_in_rule__OtherName__Alternatives4140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_56_in_rule__OtherName__Alternatives4160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_35_in_rule__OtherName__Alternatives4180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_57_in_rule__OtherName__Alternatives4200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_43_in_rule__OtherName__Alternatives4220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_79_in_rule__OtherName__Alternatives4240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_29_in_rule__OtherName__Alternatives4260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_84_in_rule__OtherName__Alternatives4280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_36_in_rule__OtherName__Alternatives4300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_85_in_rule__OtherName__Alternatives4320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_86_in_rule__OtherName__Alternatives4340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_44_in_rule__OtherName__Alternatives4360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_37_in_rule__OtherName__Alternatives4380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_45_in_rule__OtherName__Alternatives4400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_77_in_rule__OtherName__Alternatives4420 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_38_in_rule__OtherName__Alternatives4440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_46_in_rule__OtherName__Alternatives4460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_39_in_rule__OtherName__Alternatives4480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_62_in_rule__SpecialCommandName__Alternatives4515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_64_in_rule__SpecialCommandName__Alternatives4535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_53_in_rule__SpecialCommandName__Alternatives4555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_82_in_rule__SpecialCommandName__Alternatives4575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_59_in_rule__SpecialCommandName__Alternatives4595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOtherName_in_rule__SpecialCommandName__Alternatives4614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_1_in_rule__SpecialCharacter__Alternatives4647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_7_in_rule__SpecialCharacter__Alternatives4667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_10_in_rule__SpecialCharacter__Alternatives4687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_12_in_rule__SpecialCharacter__Alternatives4707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_13_in_rule__SpecialCharacter__Alternatives4727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_15_in_rule__SpecialCharacter__Alternatives4747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_19_in_rule__SpecialCharacter__Alternatives4767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedCommand_in_rule__UnparsedExpression__Alternatives4801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedBlock_in_rule__UnparsedExpression__Alternatives4818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScheme_in_rule__UnparsedExpression__Alternatives4835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleText_in_rule__UnparsedExpression__Alternatives4852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNumber_in_rule__UnparsedExpression__Alternatives4869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__UnparsedCommand__CommandAlternatives_1_04901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCommandName_in_rule__UnparsedCommand__CommandAlternatives_1_04918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextLiteral_in_rule__Text__ValueAlternatives_04950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_5_in_rule__Text__ValueAlternatives_04968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_rule__Text__ValueAlternatives_04988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_rule__Text__ValueAlternatives_05008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_rule__Text__ValueAlternatives_05028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_rule__Text__ValueAlternatives_05048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__QuotedAssignment_0_0_in_rule__SchemeExpression__Alternatives_05082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__QuasiquotedAssignment_0_1_in_rule__SchemeExpression__Alternatives_05101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__UnquotedAssignment_0_2_in_rule__SchemeExpression__Alternatives_05120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__VariableAssignment_0_3_in_rule__SchemeExpression__Alternatives_05139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBoolean_in_rule__SchemeValue__Alternatives5172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeList_in_rule__SchemeValue__Alternatives5189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBlock_in_rule__SchemeValue__Alternatives5206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeCharacter_in_rule__SchemeValue__Alternatives5223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeText_in_rule__SchemeValue__Alternatives5240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumber_in_rule__SchemeValue__Alternatives5257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeMarkupCommand_in_rule__SchemeValue__Alternatives5274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SchemeCharacter__ValueAlternatives_1_05306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCharacter_in_rule__SchemeCharacter__ValueAlternatives_1_05323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__SchemeCharacter__ValueAlternatives_1_05340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_26_in_rule__SchemeTextLiteral__Alternatives5373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_rule__SchemeTextLiteral__Alternatives5393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCharacter_in_rule__SchemeTextLiteral__Alternatives5412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCommandName_in_rule__SchemeTextLiteral__Alternatives5429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SchemeTextLiteral__Alternatives5446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__SchemeTextLiteral__Alternatives5463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ANY_OTHER_in_rule__SchemeTextLiteral__Alternatives5480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SchemeMarkupCommand__CommandAlternatives_1_05512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSpecialCommandName_in_rule__SchemeMarkupCommand__CommandAlternatives_1_05529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__05559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__05562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__NameAssignment_0_in_rule__Assignment__Group__0__Impl5589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__15619 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x000000083D7FFBA1L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__15622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_rule__Assignment__Group__1__Impl5650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__25681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__ValueAssignment_2_in_rule__Assignment__Group__2__Impl5708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyAssignment__Group__0__Impl_in_rule__PropertyAssignment__Group__05744 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_rule__PropertyAssignment__Group__1_in_rule__PropertyAssignment__Group__05747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyAssignment__IdAssignment_0_in_rule__PropertyAssignment__Group__0__Impl5774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyAssignment__Group__1__Impl_in_rule__PropertyAssignment__Group__15804 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x000000083D7FFBA1L});
    public static final BitSet FOLLOW_rule__PropertyAssignment__Group__2_in_rule__PropertyAssignment__Group__15807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_11_in_rule__PropertyAssignment__Group__1__Impl5835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyAssignment__Group__2__Impl_in_rule__PropertyAssignment__Group__25866 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyAssignment__ValueAssignment_2_in_rule__PropertyAssignment__Group__2__Impl5893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__0__Impl_in_rule__SimpleBlock__Group__05929 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__1_in_rule__SimpleBlock__Group__05932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__1__Impl_in_rule__SimpleBlock__Group__15990 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x000000083F7FFBA1L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__2_in_rule__SimpleBlock__Group__15993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_rule__SimpleBlock__Group__1__Impl6021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__2__Impl_in_rule__SimpleBlock__Group__26052 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__3_in_rule__SimpleBlock__Group__26055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimpleBlock__ExpressionsAssignment_2_in_rule__SimpleBlock__Group__2__Impl6082 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0x000000083D7FFBA1L});
    public static final BitSet FOLLOW_rule__SimpleBlock__Group__3__Impl_in_rule__SimpleBlock__Group__36113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_rule__SimpleBlock__Group__3__Impl6141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__0__Impl_in_rule__SimultaneousBlock__Group__06180 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__1_in_rule__SimultaneousBlock__Group__06183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__1__Impl_in_rule__SimultaneousBlock__Group__16241 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x000000083D7FFBE1L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__2_in_rule__SimultaneousBlock__Group__16244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_24_in_rule__SimultaneousBlock__Group__1__Impl6272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__2__Impl_in_rule__SimultaneousBlock__Group__26303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__3_in_rule__SimultaneousBlock__Group__26306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__ExpressionsAssignment_2_in_rule__SimultaneousBlock__Group__2__Impl6333 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0x000000083D7FFBA1L});
    public static final BitSet FOLLOW_rule__SimultaneousBlock__Group__3__Impl_in_rule__SimultaneousBlock__Group__36364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_25_in_rule__SimultaneousBlock__Group__3__Impl6392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__0__Impl_in_rule__Include__Group__06431 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__Include__Group__1_in_rule__Include__Group__06434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_rule__Include__Group__0__Impl6462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__1__Impl_in_rule__Include__Group__16493 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Include__Group__2_in_rule__Include__Group__16496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_62_in_rule__Include__Group__1__Impl6524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__Group__2__Impl_in_rule__Include__Group__26555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Include__ImportURIAssignment_2_in_rule__Include__Group__2__Impl6582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__0__Impl_in_rule__Version__Group__06618 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__Version__Group__1_in_rule__Version__Group__06621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_rule__Version__Group__0__Impl6649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__1__Impl_in_rule__Version__Group__16680 = new BitSet(new long[]{0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_rule__Version__Group__2_in_rule__Version__Group__16683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_64_in_rule__Version__Group__1__Impl6711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__Group__2__Impl_in_rule__Version__Group__26742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Version__VersionAssignment_2_in_rule__Version__Group__2__Impl6769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Markup__Group__0__Impl_in_rule__Markup__Group__06805 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Markup__Group__1_in_rule__Markup__Group__06808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_rule__Markup__Group__0__Impl6836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Markup__Group__1__Impl_in_rule__Markup__Group__16867 = new BitSet(new long[]{0x0000000000000002L,0x0000000001200200L});
    public static final BitSet FOLLOW_rule__Markup__Group__2_in_rule__Markup__Group__16870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_53_in_rule__Markup__Group__1__Impl6898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Markup__Group__2__Impl_in_rule__Markup__Group__26929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Markup__BodyAssignment_2_in_rule__Markup__Group__2__Impl6956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupLines__Group__0__Impl_in_rule__MarkupLines__Group__06992 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__MarkupLines__Group__1_in_rule__MarkupLines__Group__06995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_rule__MarkupLines__Group__0__Impl7023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupLines__Group__1__Impl_in_rule__MarkupLines__Group__17054 = new BitSet(new long[]{0x0000000000000002L,0x0000000001200200L});
    public static final BitSet FOLLOW_rule__MarkupLines__Group__2_in_rule__MarkupLines__Group__17057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_82_in_rule__MarkupLines__Group__1__Impl7085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupLines__Group__2__Impl_in_rule__MarkupLines__Group__27116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupLines__BodyAssignment_2_in_rule__MarkupLines__Group__2__Impl7143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupBody__Group__0__Impl_in_rule__MarkupBody__Group__07179 = new BitSet(new long[]{0x0000000000000002L,0x0000000001200200L});
    public static final BitSet FOLLOW_rule__MarkupBody__Group__1_in_rule__MarkupBody__Group__07182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupBody__Group__1__Impl_in_rule__MarkupBody__Group__17240 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_rule__MarkupBody__Group__2_in_rule__MarkupBody__Group__17243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupBody__CommandAssignment_1_in_rule__MarkupBody__Group__1__Impl7270 = new BitSet(new long[]{0x0000000000000002L,0x0000000000200200L});
    public static final BitSet FOLLOW_rule__MarkupBody__Group__2__Impl_in_rule__MarkupBody__Group__27301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupBody__BlockAssignment_2_in_rule__MarkupBody__Group__2__Impl7328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__Group__0__Impl_in_rule__Context__Group__07365 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_rule__Context__Group__1_in_rule__Context__Group__07368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__Group__1__Impl_in_rule__Context__Group__17426 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__Context__Group__2_in_rule__Context__Group__17429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_rule__Context__Group__1__Impl7457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__Group__2__Impl_in_rule__Context__Group__27488 = new BitSet(new long[]{0x0000000000000002L,0x0000000001000000L});
    public static final BitSet FOLLOW_rule__Context__Group__3_in_rule__Context__Group__27491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_59_in_rule__Context__Group__2__Impl7519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__Group__3__Impl_in_rule__Context__Group__37550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__BlockAssignment_3_in_rule__Context__Group__3__Impl7577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Other__Group__0__Impl_in_rule__Other__Group__07616 = new BitSet(new long[]{0xFFFFFEFD6FFFF7F0L,0x00000000045A7101L});
    public static final BitSet FOLLOW_rule__Other__Group__1_in_rule__Other__Group__07619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_rule__Other__Group__0__Impl7647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Other__Group__1__Impl_in_rule__Other__Group__17678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Other__KeywordAssignment_1_in_rule__Other__Group__1__Impl7705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnparsedBlock__Group__0__Impl_in_rule__UnparsedBlock__Group__07739 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_rule__UnparsedBlock__Group__1_in_rule__UnparsedBlock__Group__07742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnparsedBlock__Group__1__Impl_in_rule__UnparsedBlock__Group__17800 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x000000083F7FFB81L});
    public static final BitSet FOLLOW_rule__UnparsedBlock__Group__2_in_rule__UnparsedBlock__Group__17803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_17_in_rule__UnparsedBlock__Group__1__Impl7831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnparsedBlock__Group__2__Impl_in_rule__UnparsedBlock__Group__27862 = new BitSet(new long[]{0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_rule__UnparsedBlock__Group__3_in_rule__UnparsedBlock__Group__27865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnparsedBlock__ExpressionsAssignment_2_in_rule__UnparsedBlock__Group__2__Impl7892 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0x000000083D7FFB81L});
    public static final BitSet FOLLOW_rule__UnparsedBlock__Group__3__Impl_in_rule__UnparsedBlock__Group__37923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_18_in_rule__UnparsedBlock__Group__3__Impl7951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnparsedCommand__Group__0__Impl_in_rule__UnparsedCommand__Group__07990 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x0000000020000001L});
    public static final BitSet FOLLOW_rule__UnparsedCommand__Group__1_in_rule__UnparsedCommand__Group__07993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_rule__UnparsedCommand__Group__0__Impl8021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnparsedCommand__Group__1__Impl_in_rule__UnparsedCommand__Group__18052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnparsedCommand__CommandAssignment_1_in_rule__UnparsedCommand__Group__1__Impl8079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__0__Impl_in_rule__Reference__Group__08113 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Reference__Group__1_in_rule__Reference__Group__08116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_14_in_rule__Reference__Group__0__Impl8144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__Group__1__Impl_in_rule__Reference__Group__18175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Reference__AssignmentAssignment_1_in_rule__Reference__Group__1__Impl8202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scheme__Group__0__Impl_in_rule__Scheme__Group__08236 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x000000083CDEDF8FL});
    public static final BitSet FOLLOW_rule__Scheme__Group__1_in_rule__Scheme__Group__08239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_rule__Scheme__Group__0__Impl8267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scheme__Group__1__Impl_in_rule__Scheme__Group__18298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Scheme__ValueAssignment_1_in_rule__Scheme__Group__1__Impl8325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__Group__0__Impl_in_rule__SchemeExpression__Group__08359 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x000000083C5E538FL});
    public static final BitSet FOLLOW_rule__SchemeExpression__Group__1_in_rule__SchemeExpression__Group__08362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__Alternatives_0_in_rule__SchemeExpression__Group__0__Impl8389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__Group__1__Impl_in_rule__SchemeExpression__Group__18419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__ValueAssignment_1_in_rule__SchemeExpression__Group__1__Impl8446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__0__Impl_in_rule__SchemeList__Group__08480 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001200L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__1_in_rule__SchemeList__Group__08483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__1__Impl_in_rule__SchemeList__Group__18541 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__2_in_rule__SchemeList__Group__18544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeList__VectorAssignment_1_in_rule__SchemeList__Group__1__Impl8571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__2__Impl_in_rule__SchemeList__Group__28602 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x000000083CDEFF8FL});
    public static final BitSet FOLLOW_rule__SchemeList__Group__3_in_rule__SchemeList__Group__28605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_5_in_rule__SchemeList__Group__2__Impl8633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__3__Impl_in_rule__SchemeList__Group__38664 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_rule__SchemeList__Group__4_in_rule__SchemeList__Group__38667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeList__ExpressionsAssignment_3_in_rule__SchemeList__Group__3__Impl8694 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0x000000083CDEDF8FL});
    public static final BitSet FOLLOW_rule__SchemeList__Group__4__Impl_in_rule__SchemeList__Group__48725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_6_in_rule__SchemeList__Group__4__Impl8753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeBlock__Group__0__Impl_in_rule__SchemeBlock__Group__08794 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x000000083D7FFBA1L});
    public static final BitSet FOLLOW_rule__SchemeBlock__Group__1_in_rule__SchemeBlock__Group__08797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_22_in_rule__SchemeBlock__Group__0__Impl8825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeBlock__Group__1__Impl_in_rule__SchemeBlock__Group__18856 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_rule__SchemeBlock__Group__2_in_rule__SchemeBlock__Group__18859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeBlock__ExpressionsAssignment_1_in_rule__SchemeBlock__Group__1__Impl8888 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0x000000083D7FFBA1L});
    public static final BitSet FOLLOW_rule__SchemeBlock__ExpressionsAssignment_1_in_rule__SchemeBlock__Group__1__Impl8900 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF2L,0x000000083D7FFBA1L});
    public static final BitSet FOLLOW_rule__SchemeBlock__Group__2__Impl_in_rule__SchemeBlock__Group__28933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_23_in_rule__SchemeBlock__Group__2__Impl8961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeCharacter__Group__0__Impl_in_rule__SchemeCharacter__Group__08998 = new BitSet(new long[]{0x0000000000000000L,0x00000008245A4100L});
    public static final BitSet FOLLOW_rule__SchemeCharacter__Group__1_in_rule__SchemeCharacter__Group__09001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_21_in_rule__SchemeCharacter__Group__0__Impl9029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeCharacter__Group__1__Impl_in_rule__SchemeCharacter__Group__19060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeCharacter__ValueAssignment_1_in_rule__SchemeCharacter__Group__1__Impl9087 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeId__Group__0__Impl_in_rule__SchemeId__Group__09121 = new BitSet(new long[]{0x0000000000000002L,0x0000000000010000L});
    public static final BitSet FOLLOW_rule__SchemeId__Group__1_in_rule__SchemeId__Group__09124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextLiteral_in_rule__SchemeId__Group__0__Impl9151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeId__Group__1__Impl_in_rule__SchemeId__Group__19180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeId__Group_1__0_in_rule__SchemeId__Group__1__Impl9207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeId__Group_1__0__Impl_in_rule__SchemeId__Group_1__09242 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x000000082C5E4181L});
    public static final BitSet FOLLOW_rule__SchemeId__Group_1__1_in_rule__SchemeId__Group_1__09245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_9_in_rule__SchemeId__Group_1__0__Impl9273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeId__Group_1__1__Impl_in_rule__SchemeId__Group_1__19304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeTextLiteral_in_rule__SchemeId__Group_1__1__Impl9331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeNumber__Group__0__Impl_in_rule__SchemeNumber__Group__09364 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_rule__SchemeNumber__Group__1_in_rule__SchemeNumber__Group__09367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeNumber__RadixAssignment_0_in_rule__SchemeNumber__Group__0__Impl9394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeNumber__Group__1__Impl_in_rule__SchemeNumber__Group__19425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeNumber__ValueAssignment_1_in_rule__SchemeNumber__Group__1__Impl9452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeNumberRadix__Group__0__Impl_in_rule__SchemeNumberRadix__Group__09486 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_rule__SchemeNumberRadix__Group__1_in_rule__SchemeNumberRadix__Group__09489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_rule__SchemeNumberRadix__Group__0__Impl9517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeNumberRadix__Group__1__Impl_in_rule__SchemeNumberRadix__Group__19548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__SchemeNumberRadix__Group__1__Impl9575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeMarkupCommand__Group__0__Impl_in_rule__SchemeMarkupCommand__Group__09608 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x0000000020000001L});
    public static final BitSet FOLLOW_rule__SchemeMarkupCommand__Group__1_in_rule__SchemeMarkupCommand__Group__09611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_20_in_rule__SchemeMarkupCommand__Group__0__Impl9639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeMarkupCommand__Group__1__Impl_in_rule__SchemeMarkupCommand__Group__19670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeMarkupCommand__CommandAssignment_1_in_rule__SchemeMarkupCommand__Group__1__Impl9697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOOL__Group__0__Impl_in_rule__BOOL__Group__09731 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_rule__BOOL__Group__1_in_rule__BOOL__Group__09734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_rule__BOOL__Group__0__Impl9762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOOL__Group__1__Impl_in_rule__BOOL__Group__19793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__BOOL__Group__1__Impl9820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleToplevelExpression_in_rule__LilyPond__ExpressionsAssignment9858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__NameAlternatives_0_0_in_rule__Assignment__NameAssignment_09889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__Assignment__ValueAssignment_29922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyAssignment__IdAlternatives_0_0_in_rule__PropertyAssignment__IdAssignment_09953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__PropertyAssignment__ValueAssignment_29986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__SimpleBlock__ExpressionsAssignment_210017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__SimultaneousBlock__ExpressionsAssignment_210048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Include__ImportURIAssignment_210079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Version__VersionAssignment_210110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupBody_in_rule__Markup__BodyAssignment_210141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMarkupBody_in_rule__MarkupLines__BodyAssignment_210172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupBody__CommandAlternatives_1_0_in_rule__MarkupBody__CommandAssignment_110203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedBlock_in_rule__MarkupBody__BlockAssignment_210236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedBlock_in_rule__Context__BlockAssignment_310267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Other__KeywordAlternatives_1_0_in_rule__Other__KeywordAssignment_110298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleUnparsedExpression_in_rule__UnparsedBlock__ExpressionsAssignment_210331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__UnparsedCommand__CommandAlternatives_1_0_in_rule__UnparsedCommand__CommandAssignment_110362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Reference__AssignmentAssignment_110399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Text__ValueAlternatives_0_in_rule__Text__ValueAssignment10434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Number__ValueAssignment10467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeExpression_in_rule__Scheme__ValueAssignment_110498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_4_in_rule__SchemeExpression__QuotedAssignment_0_010534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_16_in_rule__SchemeExpression__QuasiquotedAssignment_0_110578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_8_in_rule__SchemeExpression__UnquotedAssignment_0_210622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_3_in_rule__SchemeExpression__VariableAssignment_0_310666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeValue_in_rule__SchemeExpression__ValueAssignment_110705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOL_in_rule__SchemeBoolean__ValueAssignment10736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEYWORD_2_in_rule__SchemeList__VectorAssignment_110772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeExpression_in_rule__SchemeList__ExpressionsAssignment_310811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExpression_in_rule__SchemeBlock__ExpressionsAssignment_110842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeCharacter__ValueAlternatives_1_0_in_rule__SchemeCharacter__ValueAssignment_110873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeId_in_rule__SchemeText__ValueAssignment10906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumberRadix_in_rule__SchemeNumber__RadixAssignment_010937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__SchemeNumber__ValueAssignment_110968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeMarkupCommand__CommandAlternatives_1_0_in_rule__SchemeMarkupCommand__CommandAssignment_110999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_synpred22730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyAssignment_in_synpred32779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__QuotedAssignment_0_0_in_synpred985082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__QuasiquotedAssignment_0_1_in_synpred1005101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeExpression__UnquotedAssignment_0_2_in_synpred1025120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeBoolean_in_synpred1035172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSchemeNumber_in_synpred1085257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupBody__CommandAssignment_1_in_synpred1207270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__MarkupBody__BlockAssignment_2_in_synpred1217328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Context__BlockAssignment_3_in_synpred1227577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SchemeId__Group_1__0_in_synpred1279207 = new BitSet(new long[]{0x0000000000000002L});

}