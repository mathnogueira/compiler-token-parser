package br.ufla.dcc;

import br.ufla.dcc.extractors.*;

import java.util.ArrayList;
import java.util.List;

public class TokenParser {
    private List<TokenExtractor> extractors;

    public TokenParser() {
        this.extractors = buildExtractors();
    }

    private List<TokenExtractor> buildExtractors() {
        List<TokenExtractor> extractors = new ArrayList<>();
        extractors.add(new WhitespaceExtractor());
        extractors.add(new LineEndExtractor());
        extractors.add(new CommentExtractor());
        extractors.add(new TypeExtractor());
        extractors.add(new IdentifierExtractor());
        extractors.add(new NumberExtractor());
        extractors.add(new AritmethicOperatorsExtractor());
        extractors.add(new EqualsExtractor());
        extractors.add(new SemicolonExtractor());

        return extractors;
    }

    public List<Token> parse(String content) {
        return getAllTokensFrom(content);
    }

    private List<Token> getAllTokensFrom(String content) {
        int contentCursor = 0;
        int eof = content.length();
        List<Token> tokens = new ArrayList<>();

        do {
            String currentContent = content.substring(contentCursor);
            Token token = getNextToken(currentContent);
            tokens.add(token);
            contentCursor += token.getValue().length();
        } while (contentCursor < eof);

        return tokens;
    }

    private Token getNextToken(final String content) {
//        List<Token> extractedTokens = extractors
//                .stream()
//                .map(tokenExtractor -> tokenExtractor.extract(content))
//                .filter(Objects::nonNull)
//                .collect(Collectors.toList());

        List<Token> extractedTokens = new ArrayList<>();
        for (TokenExtractor extractor : extractors) {
            Token token = extractor.extract(content);
            if (token != null) {
                return token;
            }
        }

        if (extractedTokens.size() > 1) {
            throw new RuntimeException("Ambiguidade encontrada!");
        }

        throw new RuntimeException("Could't find an extractor for \"" + content + "\"");
    }
}
