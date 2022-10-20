package week3.day4.populationProject;

import java.io.IOException;

public class PopulationMain {
    public static void main(String[] args) throws IOException {
        String filename = "C:\\Users\\LG\\OneDrive\\문서\\멋쟁이 사자처럼 벡엔드 스쿨 2기\\2021_인구관련연간자료_20221007_72135.csv";
        ReadData readData = new ReadData();
        readData.readByLine(filename);
    }
}
