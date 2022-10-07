package week3_day4.populationProject;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PopulationStatistics {
    ReadData readData = new ReadData();

    // 전입 전출 파싱
    public PopulationMove parsingRawDataToTxt(String data){
        String[] dataInfo = data.split(",");
        int new_fromSido = Integer.parseInt(dataInfo[0]);
        int new_toSido = Integer.parseInt(dataInfo[6]);
        return new PopulationMove(new_toSido,new_fromSido);
    }
    public PopulationMove parsingTxt(String data){
        String[] dataInfo = data.split(",");
        int new_fromSido = Integer.parseInt(dataInfo[0]);
        int new_toSido = Integer.parseInt(dataInfo[1]);
        return new PopulationMove(new_fromSido,new_toSido);
    }

    //한 줄씩 읽고 파싱하여 반환
    public List<PopulationMove> readByLine(String filename) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(
                new FileReader(filename)
        );
        List<PopulationMove> lines = new ArrayList<>();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            PopulationMove pm = parsingTxt(line);
            lines.add(pm);
        }
        bufferedReader.close();
        return lines;
    }

    public void createAFile(String filename) throws IOException {
        File file = new File(filename);
        if (!file.exists()) {
            file.createNewFile();
        }
    }

    public String fromToString(PopulationMove populationMove) {
        return populationMove.getFromSido() + ", " + populationMove.getToSido() + "\n";
    }

    // List<String>을 지정한 파일에 write
    public void write(List<String> stringList, String filename) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter(filename)
        );

        for (String s : stringList) {
            bufferedWriter.write(s);
        }
        bufferedWriter.close();
    }

    public static void main(String[] args) throws IOException {
        // from_to.txt 파일에 파싱한 결과 넣기
        /*
        String filename = "C:\\Users\\LG\\OneDrive\\문서\\멋쟁이 사자처럼 벡엔드 스쿨 2기\\2021_인구관련연간자료_20221007_72135.csv";
        PopulationStatistics populationStatistics = new PopulationStatistics();

        List<PopulationMove> lines = populationStatistics.readByLine(filename);
        List<String> strings = new ArrayList<>();
        for (PopulationMove pm : lines) {
            strings.add(populationStatistics.fromToString(pm));
        }
        // write 할 파일 생성
        populationStatistics.createAFile("from_to.txt");
        // 생성한 파일에 파싱한 결과 write
        populationStatistics.write(strings,"from_to.txt" );
        */

        String filename2 = "./from_to.txt";
        PopulationStatistics populationStatistics1 = new PopulationStatistics();
        List<PopulationMove> pml = populationStatistics1.readByLine(filename2);

        for (PopulationMove pm : pml) {
            System.out.printf("전입 : %d, 전출 : %d\n", pm.getFromSido(),pm.getToSido());
        }
    }
}
