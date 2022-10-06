package week3_day3.readFile;

import java.io.IOException;

public class BufferReaderMain {
    public static void main(String[] args) throws IOException {
        BufferReader bufferReader = new BufferReader("test.txt");

//        bufferReader.read();
//        bufferReader.readOneByte();
//        bufferReader.readTwoByte();
        System.out.println(bufferReader.readNByte(3));
    }
}
