package br.ufla.dcc.extractors;

import br.ufla.dcc.TokenExtractor;
import br.ufla.dcc.TokenType;

public class IdentifierExtractor extends BaseExtractor implements TokenExtractor {
    private static String IDENTIFIER_REGEX = "^([a-zA-Z_][a-zA-Z0-9_]*)";

    public IdentifierExtractor() {
        super(IDENTIFIER_REGEX, TokenType.IDENTIFIER);
    }
}
