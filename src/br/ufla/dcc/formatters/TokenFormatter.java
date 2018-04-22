package br.ufla.dcc.formatters;

import br.ufla.dcc.Token;
import br.ufla.dcc.TokenType;

import java.util.Arrays;

public class TokenFormatter {

    private static TokenType[] tokensContainValue = new TokenType[]{
            TokenType.ARITMETHIC_OPERATOR,
            TokenType.TYPE,
            TokenType.COMMENT,
            TokenType.IDENTIFIER,
            TokenType.NUMBER,
    };

    public String format(Token token) {
        if (token.getType() == TokenType.EOL) {
            return "\n";
        }

        String tokenName = getTokenName(token);
        if (containsValue(token)) {
            String value = token.getValue();
            return "<" + tokenName + " value=\"" + value + "\" />";
        }

        return "<" + tokenName + " />";
    }

    private String getTokenName(Token token) {
        switch (token.getType()) {
            case ARITMETHIC_OPERATOR: return "ARITMETHIC_OP";
            case COMMENT: return "COMMENT";
            case EOL: return "END_OF_LINE";
            case EQUALS: return "EQUALS";
            case IDENTIFIER: return "IDENTIFIER";
            case NUMBER: return "NUMBER";
            case SEMICOLON: return "SEMICOLON";
            case TYPE: return "TYPE";
            case WHITESPACE: return "WHITESPACE";
            default: return "UNKOWN_TOKEN";
        }
    }

    private boolean containsValue(Token token) {
        return Arrays.asList(tokensContainValue).contains(token.getType());
    }
}
