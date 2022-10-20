package week3.day3.readFile;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class BufferReader {
    private String filename;
    private File file;
    private FileReader reader;
    private BufferedReader bufferedReader;

    public BufferReader(String filename) throws FileNotFoundException {
        this.filename = filename;
        //파일 객체 생성
        this.file = new File(filename);
        // 파일 입력스트림 생성
        this.reader = new FileReader(filename);
        // 입력 버퍼 생성
        this.bufferedReader = new BufferedReader(reader);
    }

    // 한줄씩 읽기
    public List<String> readLine() throws IOException {
        List<String> lines = new ArrayList<>();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            lines.add(line);
        }
        return lines;
    }
    //한 글자만 읽기
    public char readOneByte() throws IOException {
        return (char)bufferedReader.read();
    }
    //두 글자만 읽기
    public String readTwoByte() throws IOException { //두 글자씩 읽기
        String tmp ="";
        tmp += (char)bufferedReader.read();
        tmp += (char)bufferedReader.read();
        return tmp;
    }
    // N 글자만 읽기
    public String readNByte(int n) throws IOException { //n 글자씩 읽기
        String tmp = "";
        for (int i = 0; i < n; i++) {
            tmp += (char) bufferedReader.read();
        }
        return tmp;
    }
    // 파일 전체 읽기
    public List<String> readAllByte(String filename) throws IOException { //전체 읽기
        List<String> tmp = Files.readAllLines(Paths.get(filename));
        return tmp;
    }
}
