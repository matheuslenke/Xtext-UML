/*
 * generated by Xtext 2.25.0
 */
package br.ufes.mdd.umltextual.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class UmlTextualAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("br/ufes/mdd/umltextual/parser/antlr/internal/InternalUmlTextual.tokens");
	}
}
