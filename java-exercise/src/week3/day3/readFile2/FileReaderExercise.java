package week3.day3.readFile2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExercise {
    // 파일 디렉토리 출력
    public void printFiles(){
        File dir = new File("./");
        File files[] = dir.listFiles();
        for (File file: files){
            System.out.println(file);
        }
    }
    //파일에서 한글자 읽기
    public char readAChar(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        return (char)fileReader.read();
    }
    //파일에서 두글자 읽기
    public String readTwoChar(String filename) throws IOException {
        FileReader fileReader = new FileReader(filename);
        String str = "";
        str += (char)fileReader.read();
        str += (char)fileReader.read();
        return str;
    }
    public static void main(String[] args) throws IOException {
        FileReaderExercise fileReaderExercise = new FileReaderExercise();
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
