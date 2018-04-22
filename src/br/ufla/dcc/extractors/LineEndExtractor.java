package br.ufla.dcc.extractors;

import br.ufla.dcc.TokenExtractor;
import br.ufla.dcc.TokenType;

public class LineEndExtractor extends BaseExtractor implements TokenExtractor {
    private static String LINE_END_REGEX = "^\n";

    public LineEndExtractor() {
        super(LINE_END_REGEX, TokenType.EOL);
    }
}
