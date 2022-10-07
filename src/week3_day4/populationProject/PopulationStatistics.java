package week3_day4.populationProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class PopulationStatistics {
    public void readByChar(String fileAddress) throws IOException {
        FileReader reader = new FileReader(fileAddress);

        int ch;
        while ((ch = reader.read()) != -1) {
            System.out.print((char) ch);
        }
    }
    public void readByLine(String fileAddress) throws IOException {
        BufferedReader reader = new BufferedReader(
                new FileReader(fileAddress)
        );
        String str;
        while ((str = reader.readLine()) != null) {
            System.out.println(str);
        }
        reader.close();
    }
    public static void main(String[] args) throws IOException {
        String fileAddress = "C:\\Users\\LG\\OneDrive\\문서\\멋쟁이 사자처럼 벡엔드 스쿨 2기\\2021_인구관련연간자료_20221007_72135.csv";

        PopulationStatistics populationStatistics = new PopulationStatistics();
        populationStatistics.readByLine(fileAddress);
    }
}
