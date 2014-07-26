package org.elysium.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.elysium.lilypond.Assignment;
import org.elysium.lilypond.BlockCommand;
import org.elysium.lilypond.ContextDef;
import org.elysium.lilypond.ContextModification;
import org.elysium.lilypond.Include;
import org.elysium.lilypond.LilyPond;
import org.elysium.lilypond.LilypondPackage;
import org.elysium.lilypond.Markup;
import org.elysium.lilypond.MarkupBody;
import org.elysium.lilypond.MarkupLines;
import org.elysium.lilypond.ModeChange;
import org.elysium.lilypond.MusicWithLyrics;
import org.elysium.lilypond.NewContext;
import org.elysium.lilypond.Octave;
import org.elysium.lilypond.Other;
import org.elysium.lilypond.OutputDefinition;
import org.elysium.lilypond.Pitch;
import org.elysium.lilypond.PropertyAssignment;
import org.elysium.lilypond.Reference;
import org.elysium.lilypond.RelativeMusic;
import org.elysium.lilypond.Scheme;
import org.elysium.lilypond.SchemeBlock;
import org.elysium.lilypond.SchemeBoolean;
import org.elysium.lilypond.SchemeCharacter;
import org.elysium.lilypond.SchemeExpression;
import org.elysium.lilypond.SchemeList;
import org.elysium.lilypond.SchemeMarkupCommand;
import org.elysium.lilypond.SchemeNumber;
import org.elysium.lilypond.SchemeText;
import org.elysium.lilypond.SimpleBlock;
import org.elysium.lilypond.SimultaneousBlock;
import org.elysium.lilypond.SourceFileLine;
import org.elysium.lilypond.SourceFileName;
import org.elysium.lilypond.StringIndication;
import org.elysium.lilypond.Text;
import org.elysium.lilypond.TransposedMusic;
import org.elysium.lilypond.UnparsedBlock;
import org.elysium.lilypond.UnparsedCommand;
import org.elysium.lilypond.Version;
import org.elysium.services.LilyPondGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractLilyPondSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private LilyPondGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == LilypondPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case LilypondPackage.ASSIGNMENT:
				if(context == grammarAccess.getAssignmentRule() ||
				   context == grammarAccess.getExpressionRule()) {
					sequence_Assignment(context, (Assignment) semanticObject); 
					return; 
				}
				else break;
			case LilypondPackage.BLOCK_COMMAND:
				if(context == grammarAccess.getBlockCommandRule() ||
				   context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getCommonExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getSpecialCommandRule()) {
					sequence_BlockCommand(context, (BlockCommand) semanticObject); 
					return; 
				}
				else break;
			case LilypondPackage.CONTEXT_DEF:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getCommonExpressionRule() ||
				   context == grammarAccess.getContextDefRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getSpecialCommandRule()) {
					sequence_ContextDef(context, (ContextDef) semanticObject); 
					return; 
				}
				else break;
			case LilypondPackage.CONTEXT_MODIFICATION:
				if(context == grammarAccess.getContextModificationRule()) {
					sequence_ContextModification(context, (ContextModification) semanticObject); 
					return; 
				}
				else break;
			case LilypondPackage.INCLUDE:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getCommonExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getIncludeRule() ||
				   context == grammarAccess.getSpecialCommandRule()) {
					sequence_Include(context, (Include) semanticObject); 
					return; 
				}
				else break;
			case LilypondPackage.LILY_POND:
				if(context == grammarAccess.getLilyPondRule()) {
					sequence_LilyPond(context, (LilyPond) semanticObject); 
					return; 
				}
				else break;
			case LilypondPackage.MARKUP:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getCommonExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMarkupRule() ||
				   context == grammarAccess.getSpecialCommandRule()) {
					sequence_Markup(context, (Markup) semanticObject); 
					return; 
				}
				else break;
			case LilypondPackage.MARKUP_BODY:
				if(context == grammarAccess.getMarkupBodyRule()) {
					sequence_MarkupBody(context, (MarkupBody) semanticObject); 
					return; 
				}
				else break;
			case LilypondPackage.MARKUP_LINES:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getCommonExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMarkupLinesRule() ||
				   context == grammarAccess.getSpecialCommandRule()) {
					sequence_MarkupLines(context, (MarkupLines) semanticObject); 
					return; 
				}
				else break;
			case LilypondPackage.MODE_CHANGE:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getCommonExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getModeChangeRule() ||
				   context == grammarAccess.getSpecialCommandRule()) {
					sequence_ModeChange(context, (ModeChange) semanticObject); 
					return; 
				}
				else break;
			case LilypondPackage.MUSIC_WITH_LYRICS:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getCommonExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMusicWithLyricsRule() ||
				   context == grammarAccess.getSpecialCommandRule()) {
					sequence_MusicWithLyrics(context, (MusicWithLyrics) semanticObject); 
					return; 
				}
				else break;
			case LilypondPackage.NEW_CONTEXT:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getCommonExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getNewContextRule() ||
				   context == grammarAccess.getSpecialCommandRule()) {
					sequence_NewContext(context, (NewContext) semanticObject); 
					return; 
				}
				else break;
			case LilypondPackage.NUMBER:
				if(context == grammarAccess.getCommonExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getNumberRule() ||
				   context == grammarAccess.getUnparsedExpressionRule()) {
					sequence_Number(context, (org.elysium.lilypond.Number) semanticObject); 
					return; 
				}
				else break;
			case LilypondPackage.OCTAVE:
				if(context == grammarAccess.getOctaveRule()) {
					sequence_Octave(context, (Octave) semanticObject); 
					return; 
				}
				else break;
			case LilypondPackage.OTHER:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getCommonExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getOtherRule() ||
				   context == grammarAccess.getSpecialCommandRule()) {
					sequence_Other(context, (Other) semanticObject); 
					return; 
				}
				else break;
			case LilypondPackage.OUTPUT_DEFINITION:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getCommonExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getOutputDefinitionRule() ||
				   context == grammarAccess.getSpecialCommandRule()) {
					sequence_OutputDefinition(context, (OutputDefinition) semanticObject); 
					return; 
				}
				else break;
			case LilypondPackage.PITCH:
				if(context == grammarAccess.getPitchRule()) {
					sequence_Pitch(context, (Pitch) semanticObject); 
					return; 
				}
				else break;
			case LilypondPackage.PROPERTY_ASSIGNMENT:
				if(context == grammarAccess.getPropertyAssignmentRule() ||
				   context == grammarAccess.getUnparsedExpressionRule()) {
					sequence_PropertyAssignment(context, (PropertyAssignment) semanticObject); 
					return; 
				}
				else break;
			case LilypondPackage.REFERENCE:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getCommonExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getReferenceRule()) {
					sequence_Reference(context, (Reference) semanticObject); 
					return; 
				}
				else break;
			case LilypondPackage.RELATIVE_MUSIC:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getCommonExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getRelativeMusicRule() ||
				   context == grammarAccess.getSpecialCommandRule()) {
					sequence_RelativeMusic(context, (RelativeMusic) semanticObject); 
					return; 
				}
				else break;
			case LilypondPackage.SCHEME:
				if(context == grammarAccess.getCommonExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getSchemeRule() ||
				   context == grammarAccess.getUnparsedExpressionRule()) {
					sequence_Scheme(context, (Scheme) semanticObject); 
					return; 
				}
				else break;
			case LilypondPackage.SCHEME_BLOCK:
				if(context == grammarAccess.getSchemeBlockRule() ||
				   context == grammarAccess.getSchemeValueRule()) {
					sequence_SchemeBlock(context, (SchemeBlock) semanticObject); 
					return; 
				}
				else break;
			case LilypondPackage.SCHEME_BOOLEAN:
				if(context == grammarAccess.getSchemeBooleanRule() ||
				   context == grammarAccess.getSchemeValueRule()) {
					sequence_SchemeBoolean(context, (SchemeBoolean) semanticObject); 
					return; 
				}
				else break;
			case LilypondPackage.SCHEME_CHARACTER:
				if(context == grammarAccess.getSchemeCharacterRule() ||
				   context == grammarAccess.getSchemeValueRule()) {
					sequence_SchemeCharacter(context, (SchemeCharacter) semanticObject); 
					return; 
				}
				else break;
			case LilypondPackage.SCHEME_EXPRESSION:
				if(context == grammarAccess.getSchemeExpressionRule()) {
					sequence_SchemeExpression(context, (SchemeExpression) semanticObject); 
					return; 
				}
				else break;
			case LilypondPackage.SCHEME_LIST:
				if(context == grammarAccess.getSchemeListRule() ||
				   context == grammarAccess.getSchemeValueRule()) {
					sequence_SchemeList(context, (SchemeList) semanticObject); 
					return; 
				}
				else break;
			case LilypondPackage.SCHEME_MARKUP_COMMAND:
				if(context == grammarAccess.getSchemeMarkupCommandRule() ||
				   context == grammarAccess.getSchemeValueRule()) {
					sequence_SchemeMarkupCommand(context, (SchemeMarkupCommand) semanticObject); 
					return; 
				}
				else break;
			case LilypondPackage.SCHEME_NUMBER:
				if(context == grammarAccess.getSchemeNumberRule() ||
				   context == grammarAccess.getSchemeValueRule()) {
					sequence_SchemeNumber(context, (SchemeNumber) semanticObject); 
					return; 
				}
				else break;
			case LilypondPackage.SCHEME_TEXT:
				if(context == grammarAccess.getSchemeTextRule() ||
				   context == grammarAccess.getSchemeValueRule()) {
					sequence_SchemeText(context, (SchemeText) semanticObject); 
					return; 
				}
				else break;
			case LilypondPackage.SIMPLE_BLOCK:
				if(context == grammarAccess.getBlockRule() ||
				   context == grammarAccess.getCommonExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getSimpleBlockRule()) {
					sequence_SimpleBlock(context, (SimpleBlock) semanticObject); 
					return; 
				}
				else break;
			case LilypondPackage.SIMULTANEOUS_BLOCK:
				if(context == grammarAccess.getBlockRule() ||
				   context == grammarAccess.getCommonExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getSimultaneousBlockRule()) {
					sequence_SimultaneousBlock(context, (SimultaneousBlock) semanticObject); 
					return; 
				}
				else break;
			case LilypondPackage.SOURCE_FILE_LINE:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getCommonExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getSourceFileLineRule() ||
				   context == grammarAccess.getSpecialCommandRule()) {
					sequence_SourceFileLine(context, (SourceFileLine) semanticObject); 
					return; 
				}
				else break;
			case LilypondPackage.SOURCE_FILE_NAME:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getCommonExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getSourceFileNameRule() ||
				   context == grammarAccess.getSpecialCommandRule()) {
					sequence_SourceFileName(context, (SourceFileName) semanticObject); 
					return; 
				}
				else break;
			case LilypondPackage.STRING_INDICATION:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getCommonExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getStringIndicationRule()) {
					sequence_StringIndication(context, (StringIndication) semanticObject); 
					return; 
				}
				else break;
			case LilypondPackage.TEXT:
				if(context == grammarAccess.getCommonExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getTextRule() ||
				   context == grammarAccess.getUnparsedExpressionRule()) {
					sequence_Text(context, (Text) semanticObject); 
					return; 
				}
				else break;
			case LilypondPackage.TRANSPOSED_MUSIC:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getCommonExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getSpecialCommandRule() ||
				   context == grammarAccess.getTransposedMusicRule()) {
					sequence_TransposedMusic(context, (TransposedMusic) semanticObject); 
					return; 
				}
				else break;
			case LilypondPackage.UNPARSED_BLOCK:
				if(context == grammarAccess.getUnparsedBlockRule() ||
				   context == grammarAccess.getUnparsedExpressionRule()) {
					sequence_UnparsedBlock(context, (UnparsedBlock) semanticObject); 
					return; 
				}
				else break;
			case LilypondPackage.UNPARSED_COMMAND:
				if(context == grammarAccess.getUnparsedCommandRule() ||
				   context == grammarAccess.getUnparsedExpressionRule()) {
					sequence_UnparsedCommand(context, (UnparsedCommand) semanticObject); 
					return; 
				}
				else break;
			case LilypondPackage.VERSION:
				if(context == grammarAccess.getCommandRule() ||
				   context == grammarAccess.getCommonExpressionRule() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getSpecialCommandRule() ||
				   context == grammarAccess.getVersionRule()) {
					sequence_Version(context, (Version) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     ((name=ID | name=STRING) value=Expression)
	 */
	protected void sequence_Assignment(EObject context, Assignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((keyword='book' | keyword='bookpart' | keyword='header' | keyword='score') block=SimpleBlock)
	 */
	protected void sequence_BlockCommand(EObject context, BlockCommand semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (keyword='context' block=UnparsedBlock)
	 */
	protected void sequence_ContextDef(EObject context, ContextDef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilypondPackage.Literals.SPECIAL_COMMAND__KEYWORD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilypondPackage.Literals.SPECIAL_COMMAND__KEYWORD));
			if(transientValues.isValueTransient(semanticObject, LilypondPackage.Literals.CONTEXT_DEF__BLOCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilypondPackage.Literals.CONTEXT_DEF__BLOCK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getContextDefAccess().getKeywordContextKeyword_1_0(), semanticObject.getKeyword());
		feeder.accept(grammarAccess.getContextDefAccess().getBlockUnparsedBlockParserRuleCall_2_0(), semanticObject.getBlock());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     block=UnparsedBlock
	 */
	protected void sequence_ContextModification(EObject context, ContextModification semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilypondPackage.Literals.CONTEXT_MODIFICATION__BLOCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilypondPackage.Literals.CONTEXT_MODIFICATION__BLOCK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getContextModificationAccess().getBlockUnparsedBlockParserRuleCall_2_0(), semanticObject.getBlock());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (keyword='include' importURI=STRING)
	 */
	protected void sequence_Include(EObject context, Include semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilypondPackage.Literals.SPECIAL_COMMAND__KEYWORD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilypondPackage.Literals.SPECIAL_COMMAND__KEYWORD));
			if(transientValues.isValueTransient(semanticObject, LilypondPackage.Literals.INCLUDE__IMPORT_URI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilypondPackage.Literals.INCLUDE__IMPORT_URI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getIncludeAccess().getKeywordIncludeKeyword_1_0(), semanticObject.getKeyword());
		feeder.accept(grammarAccess.getIncludeAccess().getImportURISTRINGTerminalRuleCall_2_0(), semanticObject.getImportURI());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expressions+=Expression*
	 */
	protected void sequence_LilyPond(EObject context, LilyPond semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((command+=Scheme | command+=SchemeText | command+=UnparsedCommand)* block=UnparsedBlock?)
	 */
	protected void sequence_MarkupBody(EObject context, MarkupBody semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (keyword='markuplines' body=MarkupBody)
	 */
	protected void sequence_MarkupLines(EObject context, MarkupLines semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilypondPackage.Literals.SPECIAL_COMMAND__KEYWORD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilypondPackage.Literals.SPECIAL_COMMAND__KEYWORD));
			if(transientValues.isValueTransient(semanticObject, LilypondPackage.Literals.MARKUP_LINES__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilypondPackage.Literals.MARKUP_LINES__BODY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMarkupLinesAccess().getKeywordMarkuplinesKeyword_1_0(), semanticObject.getKeyword());
		feeder.accept(grammarAccess.getMarkupLinesAccess().getBodyMarkupBodyParserRuleCall_2_0(), semanticObject.getBody());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (keyword='markup' body=MarkupBody)
	 */
	protected void sequence_Markup(EObject context, Markup semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilypondPackage.Literals.SPECIAL_COMMAND__KEYWORD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilypondPackage.Literals.SPECIAL_COMMAND__KEYWORD));
			if(transientValues.isValueTransient(semanticObject, LilypondPackage.Literals.MARKUP__BODY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilypondPackage.Literals.MARKUP__BODY));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMarkupAccess().getKeywordMarkupKeyword_1_0(), semanticObject.getKeyword());
		feeder.accept(grammarAccess.getMarkupAccess().getBodyMarkupBodyParserRuleCall_2_0(), semanticObject.getBody());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((keyword='chordmode' | keyword='drummode' | keyword='figuremode' | keyword='lyricmode' | keyword='notemode') music=Block)
	 */
	protected void sequence_ModeChange(EObject context, ModeChange semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (keyword='lyricsto' (id=ID | id=STRING) lyrics=Expression)
	 */
	protected void sequence_MusicWithLyrics(EObject context, MusicWithLyrics semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((keyword='new' | keyword='context') context=ID (id=ID | id=STRING)? modification=ContextModification? music=Expression)
	 */
	protected void sequence_NewContext(EObject context, NewContext semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_Number(EObject context, org.elysium.lilypond.Number semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilypondPackage.Literals.NUMBER__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilypondPackage.Literals.NUMBER__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (up+='''+ | down+=','+)
	 */
	protected void sequence_Octave(EObject context, Octave semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (keyword=SpecialCharacter | keyword='(' | keyword=')' | keyword=OtherName)
	 */
	protected void sequence_Other(EObject context, Other semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((keyword='paper' | keyword='midi' | keyword='layout') block=UnparsedBlock)
	 */
	protected void sequence_OutputDefinition(EObject context, OutputDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (base=ID octaveCheck?='='? octaveShift=Octave? reminderAccidental?='!'? cautionaryAccidental?='?'?)
	 */
	protected void sequence_Pitch(EObject context, Pitch semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (id=SchemeIdentifier value=Expression)
	 */
	protected void sequence_PropertyAssignment(EObject context, PropertyAssignment semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilypondPackage.Literals.PROPERTY_ASSIGNMENT__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilypondPackage.Literals.PROPERTY_ASSIGNMENT__ID));
			if(transientValues.isValueTransient(semanticObject, LilypondPackage.Literals.PROPERTY_ASSIGNMENT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilypondPackage.Literals.PROPERTY_ASSIGNMENT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPropertyAssignmentAccess().getIdSchemeIdentifierParserRuleCall_0_0(), semanticObject.getId());
		feeder.accept(grammarAccess.getPropertyAssignmentAccess().getValueExpressionParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     assignment=[Assignment|ID]
	 */
	protected void sequence_Reference(EObject context, Reference semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilypondPackage.Literals.REFERENCE__ASSIGNMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilypondPackage.Literals.REFERENCE__ASSIGNMENT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getReferenceAccess().getAssignmentAssignmentIDTerminalRuleCall_1_0_1(), semanticObject.getAssignment());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (keyword='relative' pitch=Pitch? music=Expression)
	 */
	protected void sequence_RelativeMusic(EObject context, RelativeMusic semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     elements+=Expression+
	 */
	protected void sequence_SchemeBlock(EObject context, SchemeBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=SchemeBooleanValue
	 */
	protected void sequence_SchemeBoolean(EObject context, SchemeBoolean semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilypondPackage.Literals.SCHEME_BOOLEAN__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilypondPackage.Literals.SCHEME_BOOLEAN__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSchemeBooleanAccess().getValueSchemeBooleanValueParserRuleCall_0(), semanticObject.isValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value=ID | value=SpecialCharacter | value=ANY_OTHER)
	 */
	protected void sequence_SchemeCharacter(EObject context, SchemeCharacter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((quotations+=''' | quotations+='`' | quotations+=',' | quotations+='@')* reference?='$'? value=SchemeValue)
	 */
	protected void sequence_SchemeExpression(EObject context, SchemeExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (vector?='#'? expressions+=SchemeExpression*)
	 */
	protected void sequence_SchemeList(EObject context, SchemeList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     command=SchemeIdentifier
	 */
	protected void sequence_SchemeMarkupCommand(EObject context, SchemeMarkupCommand semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilypondPackage.Literals.SCHEME_MARKUP_COMMAND__COMMAND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilypondPackage.Literals.SCHEME_MARKUP_COMMAND__COMMAND));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSchemeMarkupCommandAccess().getCommandSchemeIdentifierParserRuleCall_1_0(), semanticObject.getCommand());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (radix=SchemeNumberRadix? value=SignedInteger)
	 */
	protected void sequence_SchemeNumber(EObject context, SchemeNumber semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=SchemeTextValue
	 */
	protected void sequence_SchemeText(EObject context, SchemeText semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilypondPackage.Literals.SCHEME_TEXT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilypondPackage.Literals.SCHEME_TEXT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSchemeTextAccess().getValueSchemeTextValueParserRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=SchemeExpression
	 */
	protected void sequence_Scheme(EObject context, Scheme semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilypondPackage.Literals.SCHEME__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilypondPackage.Literals.SCHEME__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSchemeAccess().getValueSchemeExpressionParserRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (expressions+=Expression*)
	 */
	protected void sequence_SimpleBlock(EObject context, SimpleBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expressions+=Expression*)
	 */
	protected void sequence_SimultaneousBlock(EObject context, SimultaneousBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (keyword='sourcefileline' line=INT)
	 */
	protected void sequence_SourceFileLine(EObject context, SourceFileLine semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilypondPackage.Literals.SPECIAL_COMMAND__KEYWORD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilypondPackage.Literals.SPECIAL_COMMAND__KEYWORD));
			if(transientValues.isValueTransient(semanticObject, LilypondPackage.Literals.SOURCE_FILE_LINE__LINE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilypondPackage.Literals.SOURCE_FILE_LINE__LINE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSourceFileLineAccess().getKeywordSourcefilelineKeyword_1_0(), semanticObject.getKeyword());
		feeder.accept(grammarAccess.getSourceFileLineAccess().getLineINTTerminalRuleCall_2_0(), semanticObject.getLine());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (keyword='sourcefilename' filename=STRING)
	 */
	protected void sequence_SourceFileName(EObject context, SourceFileName semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilypondPackage.Literals.SPECIAL_COMMAND__KEYWORD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilypondPackage.Literals.SPECIAL_COMMAND__KEYWORD));
			if(transientValues.isValueTransient(semanticObject, LilypondPackage.Literals.SOURCE_FILE_NAME__FILENAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilypondPackage.Literals.SOURCE_FILE_NAME__FILENAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSourceFileNameAccess().getKeywordSourcefilenameKeyword_1_0(), semanticObject.getKeyword());
		feeder.accept(grammarAccess.getSourceFileNameAccess().getFilenameSTRINGTerminalRuleCall_2_0(), semanticObject.getFilename());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     string=INT
	 */
	protected void sequence_StringIndication(EObject context, StringIndication semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilypondPackage.Literals.STRING_INDICATION__STRING) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilypondPackage.Literals.STRING_INDICATION__STRING));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStringIndicationAccess().getStringINTTerminalRuleCall_1_0(), semanticObject.getString());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         value=SchemeTextValueSegment | 
	 *         value='(' | 
	 *         value=')' | 
	 *         value=''' | 
	 *         value=',' | 
	 *         value=':'
	 *     )
	 */
	protected void sequence_Text(EObject context, Text semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (keyword='transpose' source=Pitch target=Pitch music=Expression)
	 */
	protected void sequence_TransposedMusic(EObject context, TransposedMusic semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilypondPackage.Literals.SPECIAL_COMMAND__KEYWORD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilypondPackage.Literals.SPECIAL_COMMAND__KEYWORD));
			if(transientValues.isValueTransient(semanticObject, LilypondPackage.Literals.TRANSPOSED_MUSIC__SOURCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilypondPackage.Literals.TRANSPOSED_MUSIC__SOURCE));
			if(transientValues.isValueTransient(semanticObject, LilypondPackage.Literals.TRANSPOSED_MUSIC__TARGET) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilypondPackage.Literals.TRANSPOSED_MUSIC__TARGET));
			if(transientValues.isValueTransient(semanticObject, LilypondPackage.Literals.TRANSPOSED_MUSIC__MUSIC) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilypondPackage.Literals.TRANSPOSED_MUSIC__MUSIC));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getTransposedMusicAccess().getKeywordTransposeKeyword_1_0(), semanticObject.getKeyword());
		feeder.accept(grammarAccess.getTransposedMusicAccess().getSourcePitchParserRuleCall_2_0(), semanticObject.getSource());
		feeder.accept(grammarAccess.getTransposedMusicAccess().getTargetPitchParserRuleCall_3_0(), semanticObject.getTarget());
		feeder.accept(grammarAccess.getTransposedMusicAccess().getMusicExpressionParserRuleCall_4_0(), semanticObject.getMusic());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (expressions+=UnparsedExpression*)
	 */
	protected void sequence_UnparsedBlock(EObject context, UnparsedBlock semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (command=SchemeIdentifier | command=SpecialCommandName)
	 */
	protected void sequence_UnparsedCommand(EObject context, UnparsedCommand semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (keyword='version' version=STRING)
	 */
	protected void sequence_Version(EObject context, Version semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LilypondPackage.Literals.SPECIAL_COMMAND__KEYWORD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilypondPackage.Literals.SPECIAL_COMMAND__KEYWORD));
			if(transientValues.isValueTransient(semanticObject, LilypondPackage.Literals.VERSION__VERSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LilypondPackage.Literals.VERSION__VERSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getVersionAccess().getKeywordVersionKeyword_1_0(), semanticObject.getKeyword());
		feeder.accept(grammarAccess.getVersionAccess().getVersionSTRINGTerminalRuleCall_2_0(), semanticObject.getVersion());
		feeder.finish();
	}
}
