package br.ufla.dcc.extractors;

import br.ufla.dcc.TokenExtractor;
import br.ufla.dcc.TokenType;

public class EqualsExtractor extends BaseExtractor implements TokenExtractor {
    private static String EQUALS_REGEX = "^=";

    public EqualsExtractor() {
        super(EQUALS_REGEX, TokenType.EQUALS);
    }
}
