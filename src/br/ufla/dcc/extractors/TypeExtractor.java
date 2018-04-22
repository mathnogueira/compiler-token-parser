package br.ufla.dcc.extractors;

import br.ufla.dcc.TokenExtractor;
import br.ufla.dcc.TokenType;

public class TypeExtractor extends BaseExtractor implements TokenExtractor {
    private static String TYPES_REGEX = "^(int|float|double|char)";

    public TypeExtractor() {
        super(TYPES_REGEX, TokenType.TYPE);
    }
}
