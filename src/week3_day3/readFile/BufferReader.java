package week3_day3.readFile;

import java.io.*;
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

    public void read() throws IOException { // 한줄씩 읽기
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
    }
    public char readOneByte() throws IOException { //한 글자씩 읽기
        return (char)bufferedReader.read();
    }
    public String readTwoByte() throws IOException { //두 글자씩 읽기
        String tmp ="";
        tmp += (char)bufferedReader.read();
        tmp += (char)bufferedReader.read();
        return tmp;
    }
    public String readNByte(int n) throws IOException { //n 글자씩 읽기
        String tmp = "";
        for (int i = 0; i < n; i++) {
            tmp += (char) bufferedReader.read();
        }
        return tmp;
    }
    public String readAllByte() throws IOException { //전체 읽기
        String tmp = Files.readString(Paths.get(filename));
        return tmp;
    }
    public void readerDemo(){
        String s = "Hello world";

        // create a StringReader
        Reader reader = new StringReader(s);

        // create a char array to read chars into
        char cbuf[] = new char[5];

        try {
            // read characters into a portion of an array.
            System.out.println("" + reader.read(cbuf, 0, 5));

            // print cbuf
            System.out.println(cbuf);

            // close the stream
            reader.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
