package br.ufla.dcc.io;

import java.io.File;
import java.io.FileInputStream;

public class FileReader {
    public String read(String filename) {
        try {
            File file = new File(filename);
            FileInputStream fis = new FileInputStream(file);
            byte[] data = new byte[(int) file.length()];
            fis.read(data);
            fis.close();

            return new String(data, "UTF-8");
        } catch (Exception ex) {
            throw new RuntimeException("Error while reading file", ex);
        }
    }
}
