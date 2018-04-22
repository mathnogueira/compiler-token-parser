package br.ufla.dcc.extractors;

import br.ufla.dcc.TokenExtractor;
import br.ufla.dcc.TokenType;

public class CommentExtractor extends BaseExtractor implements TokenExtractor {
    private static String COMMENT_REGEX = "^\\/\\/(?!\n).*";

    public CommentExtractor() {
        super(COMMENT_REGEX, TokenType.COMMENT);
    }
}
