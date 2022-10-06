package week3_day3.readFile;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BufferReader2 {
    public void read() { // 한줄씩 읽기
        try(BufferedReader br = Files.newBufferedReader(
                Paths.get("test.txt"), StandardCharsets.UTF_8)){

            String line;
            while ((line = br.readLine()) != null) { 
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
