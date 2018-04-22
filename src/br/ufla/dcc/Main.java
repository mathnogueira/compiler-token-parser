package br.ufla.dcc;

import br.ufla.dcc.formatters.TokenFormatter;
import br.ufla.dcc.io.FileReader;
import br.ufla.dcc.io.FileWriter;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        FileReader fileReader = new FileReader();
        FileWriter fileWriter = new FileWriter();
        TokenParser parser = new TokenParser();
        TokenFormatter formatter = new TokenFormatter();

        String fileContent = fileReader.read("examples/source-code.c");
        List<Token> tokens = parser.parse(fileContent);

        StringBuilder builder = new StringBuilder();
        for (Token token : tokens) {
            String formattedToken = formatter.format(token);
            builder.append(formattedToken);
        }

        String output = builder.toString();
        fileWriter.write(output, "examples/source-code.symbols");
    }
}
