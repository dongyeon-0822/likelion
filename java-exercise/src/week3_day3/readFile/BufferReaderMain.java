package week3_day3.readFile;

import java.io.IOException;

public class BufferReaderMain {
    public static void main(String[] args) throws IOException {
        BufferReader bufferReader = new BufferReader("test.txt");

        bufferReader.readLine();
        bufferReader.readOneByte();
        bufferReader.readTwoByte();
    }
}
