package week3_day3.readFile;

import java.io.IOException;

public class BufferReaderMain {
    public static void main(String[] args) throws IOException {
        BufferReader2 bufferReader2 = new BufferReader2();
        bufferReader2.read();

        BufferReader bufferReader = new BufferReader();
        bufferReader.readOneByte();
    }
}
