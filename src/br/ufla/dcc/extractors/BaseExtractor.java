package br.ufla.dcc.extractors;

import br.ufla.dcc.Token;
import br.ufla.dcc.TokenExtractor;
import br.ufla.dcc.TokenType;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class BaseExtractor implements TokenExtractor {
    private String regex;
    private TokenType tokenType;

    public BaseExtractor(String regex, TokenType tokenType) {
        this.regex = regex;
        this.tokenType = tokenType;
    }

    @Override
    public Token extract(String text) {
        Pattern pattern = Pattern.compile(this.regex);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            String value = matcher.group(0);
            return new Token(this.tokenType, value);
        }

        return null;
    }
}
