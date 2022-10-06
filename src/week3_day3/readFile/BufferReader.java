package week3_day3.readFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class BufferReader {
    private String filename;
    private FileReader reader;
    private BufferedReader bufferedReader;
    public BufferReader(String filename) throws FileNotFoundException {
        this.filename = filename;
        // 파일 입력스트림 생성
        this.reader = new FileReader(filename);
        // 입력 버퍼 생성
        this.bufferedReader = new BufferedReader(reader);
    }

    public void read() { // 한줄씩 읽기
        try {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public char readOneByte() throws IOException { //한 글자씩 읽기
        return (char)bufferedReader.read();
    }
    public String readTwoByte() throws IOException { //두 글자씩 읽기
        try {
            String tmp ="";
            tmp += (char)bufferedReader.read();
            tmp += (char)bufferedReader.read();
            return tmp;
        }catch (IOException e){
            throw new RuntimeException(e);
        }

    }
    public String readNByte(int n) throws IOException { //n 글자씩 읽기
        String tmp ="";
        for (int i = 0; i<n;i++){
            tmp += (char)bufferedReader.read();
        }
        return tmp;
    }
}
