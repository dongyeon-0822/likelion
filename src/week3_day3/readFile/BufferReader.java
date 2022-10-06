package week3_day3.readFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {
    void readOneByte() throws IOException {
        FileReader reader = new FileReader("test.txt");
        int c;
        while ((c = reader.read()) != -1) {
            System.out.println((char) c);
        }
    }

}
