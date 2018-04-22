package br.ufla.dcc.io;

import java.io.BufferedWriter;

public class FileWriter {

    public void write(String content, String filename) {
        BufferedWriter writer;
        try {
            writer = new BufferedWriter( new java.io.FileWriter(filename));
            writer.write(content);
            writer.close();
        } catch (Exception ex) {
            throw new RuntimeException("Could't write on file", ex);
        }
    }

}
