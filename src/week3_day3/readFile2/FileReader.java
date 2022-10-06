package week3_day3.readFile2;

import java.io.File;

public class FileReader {
    public static void main(String[] args) {
        File dir = new File("./");
        File files[] = dir.listFiles();
        for (File file: files){
            System.out.println(file);
        }
    }
}
