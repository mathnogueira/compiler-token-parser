package br.ufla.dcc.extractors;

import br.ufla.dcc.TokenExtractor;
import br.ufla.dcc.TokenType;

public class NumberExtractor extends BaseExtractor implements TokenExtractor {
    // Supports integers, floating points and scientific notation
    private static String NUMBER_REGEX = "^(-)?[0-9]+(\\.[0-9]+)?(e(\\+|-)?[0-9]+)?";

    public NumberExtractor() {
        super(NUMBER_REGEX, TokenType.NUMBER);
    }
}
