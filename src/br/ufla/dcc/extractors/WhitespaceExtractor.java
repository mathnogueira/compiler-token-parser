package br.ufla.dcc.extractors;

import br.ufla.dcc.TokenExtractor;
import br.ufla.dcc.TokenType;

public class WhitespaceExtractor extends BaseExtractor implements TokenExtractor {
    private static String WHITESPACE_REGEX = "^( |\t)";

    public WhitespaceExtractor() {
        super(WHITESPACE_REGEX, TokenType.WHITESPACE);
    }
}
