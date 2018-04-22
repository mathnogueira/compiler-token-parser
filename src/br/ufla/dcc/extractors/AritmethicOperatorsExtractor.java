package br.ufla.dcc.extractors;

import br.ufla.dcc.TokenExtractor;
import br.ufla.dcc.TokenType;

public class AritmethicOperatorsExtractor extends BaseExtractor implements TokenExtractor {
    private static String ARITMETHIC_OPERATORS_REGEX = "^(\\+|-|/|\\*)";

    public AritmethicOperatorsExtractor() {
        super(ARITMETHIC_OPERATORS_REGEX, TokenType.ARITMETHIC_OPERATOR);
    }
}
