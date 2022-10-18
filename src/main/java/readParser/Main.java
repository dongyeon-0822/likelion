package readParser;

import readParser.domain.Hospital;
import readParser.parser.HospitalParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        FileController<Hospital> hospitalFileController = new FileController<>(new HospitalParser());

        String filename = "C:\\Users\\LG\\OneDrive\\문서\\GitHub\\likelion-read-line-parser\\src\\data\\서울시 병의원 위치 정보.csv";
        List<Hospital> hospitals = hospitalFileController.readLines(filename);

        List<String> sqlStatements = new ArrayList<>();
        for (Hospital hospital : hospitals){
            sqlStatements.add(hospital.getSqlInsertQuery());
        }
        String sqlFilename = "seoul_hospital_insert.sql";
        hospitalFileController.createANewFile(sqlFilename);
        hospitalFileController.writeLines(sqlStatements, sqlFilename);
    }
}