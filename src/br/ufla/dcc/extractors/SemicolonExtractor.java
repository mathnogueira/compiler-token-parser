package br.ufla.dcc.extractors;

import br.ufla.dcc.TokenExtractor;
import br.ufla.dcc.TokenType;

public class SemicolonExtractor extends BaseExtractor implements TokenExtractor {
    private static String SEMICOLON_REGEX = "^;";

    public SemicolonExtractor() {
        super(SEMICOLON_REGEX, TokenType.SEMICOLON);
    }
}
