/*
 * generated by Xtext 2.27.0
 */
package zombie.incatch.configdsl.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class ConfigDslTextualAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("zombie/incatch/configdsl/parser/antlr/internal/InternalConfigDslTextual.tokens");
	}
}