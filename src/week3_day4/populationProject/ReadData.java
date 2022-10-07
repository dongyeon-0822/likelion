package week3_day4.populationProject;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadData {
    // 한 글자씩 읽어 출력 (반환 X)
    public void readByChar(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);

        int ch;
        while ((ch = fileReader.read()) != -1) {
            System.out.print((char) ch);
        }
        fileReader.close();
    }
    //한 줄씩 읽어 반환
    public List<String> readByLine(String filename) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader(filename)
        );
        List<String> lines = new ArrayList<>();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            lines.add(line);
        }
        return lines;
    }

    // 파일 전체 읽고 반환
    public List<String> readAllLine(String filename) throws IOException { //전체 읽기
        List<String> tmp = Files.readAllLines(Paths.get(filename));
        return tmp;
    }
}
