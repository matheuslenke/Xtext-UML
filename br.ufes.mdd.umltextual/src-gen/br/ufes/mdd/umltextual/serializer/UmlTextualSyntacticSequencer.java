/*
 * generated by Xtext 2.25.0
 */
package br.ufes.mdd.umltextual.serializer;

import br.ufes.mdd.umltextual.services.UmlTextualGrammarAccess;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class UmlTextualSyntacticSequencer extends AbstractSyntacticSequencer {

	protected UmlTextualGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Association_UndirectedKeyword_0_q;
	protected AbstractElementAlias match_Method_AbstractKeyword_0_q;
	protected AbstractElementAlias match_Method_StaticKeyword_1_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (UmlTextualGrammarAccess) access;
		match_Association_UndirectedKeyword_0_q = new TokenAlias(false, true, grammarAccess.getAssociationAccess().getUndirectedKeyword_0());
		match_Method_AbstractKeyword_0_q = new TokenAlias(false, true, grammarAccess.getMethodAccess().getAbstractKeyword_0());
		match_Method_StaticKeyword_1_q = new TokenAlias(false, true, grammarAccess.getMethodAccess().getStaticKeyword_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Association_UndirectedKeyword_0_q.equals(syntax))
				emit_Association_UndirectedKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Method_AbstractKeyword_0_q.equals(syntax))
				emit_Method_AbstractKeyword_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Method_StaticKeyword_1_q.equals(syntax))
				emit_Method_StaticKeyword_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'undirected'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'association' name=ID
	 *     (rule start) (ambiguity) 'association' name=Unnamed
	 */
	protected void emit_Association_UndirectedKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'abstract'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'static'? 'function' name=ID
	 *     (rule start) (ambiguity) 'static'? visibility=Visibility
	 */
	protected void emit_Method_AbstractKeyword_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'static'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'abstract'? (ambiguity) 'function' name=ID
	 *     (rule start) 'abstract'? (ambiguity) visibility=Visibility
	 */
	protected void emit_Method_StaticKeyword_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
