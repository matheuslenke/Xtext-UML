/*
 * generated by Xtext 2.25.0
 */
package br.ufes.mdd.umltextual.parser.antlr;

import br.ufes.mdd.umltextual.parser.antlr.internal.InternalUmlTextualParser;
import br.ufes.mdd.umltextual.services.UmlTextualGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class UmlTextualParser extends AbstractAntlrParser {

	@Inject
	private UmlTextualGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalUmlTextualParser createParser(XtextTokenStream stream) {
		return new InternalUmlTextualParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public UmlTextualGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(UmlTextualGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
