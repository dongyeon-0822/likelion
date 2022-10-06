package week3_day3.readFile2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExercise {
    public void printFiles(){
        File dir = new File("./");
        File files[] = dir.listFiles();
        for (File file: files){
            System.out.println(file);
        }
    }
    public char readAChar(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        return (char)fileReader.read();
    }
    public String readTwoChar(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        String str = "";
        str += (char)fileReader.read();
        str += (char)fileReader.read();
        return str;
    }
    public static void main(String[] args) throws IOException {
        FileReaderExercise fileReaderExercise = new FileReaderExercise();
//        char c = fileReaderExercise.readAChar("test.txt");
//        System.out.println(c);
        String str = fileReaderExercise.readTwoChar("test.txt");
        System.out.println(str);
    }
}
/*
    .\.git
    .\.gitignore
    .\.idea
    .\likelion-java-exercise.iml
    .\out
    .\src
    .\test.txt
*/
