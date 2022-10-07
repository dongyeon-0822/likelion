package week3_day4.populationProject;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        String[] dataInfo = data.split(", ");
        return new PopulationMove(dataInfo[0],dataInfo[1]);
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
        return populationMove.getFromSido() + "," + populationMove.getToSido() + "\n";
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
    public Map<String, Integer> getMoveCntMap(List<PopulationMove> pml) {
        Map<String, Integer> moveCntMap = new HashMap<>();
        for (PopulationMove pm : pml) {
            String key = pm.getFromSido() + "," + pm.getToSido();
            if (moveCntMap.get(key) == null) {
                moveCntMap.put(key,1);
            }
            moveCntMap.put(key, moveCntMap.get(key) + 1);
        }
        return moveCntMap;
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

        Map<String,Integer> map = populationStatistics1.getMoveCntMap(pml);
        String filename3 = "each_sido_cnt.txt";
        populationStatistics1.createAFile(filename3);
        List<String> cntResult = new ArrayList<>();
        for (String k : map.keySet()) {
            String s = String.format("key : %s, value : %d\n", k, map.get(k));
            cntResult.add(s);
        }
        populationStatistics1.write(cntResult, filename3);
    }
}
