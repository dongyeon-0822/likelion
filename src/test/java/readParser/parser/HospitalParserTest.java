package readParser.parser;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import readParser.domain.Hospital;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HospitalParserTest {

    String str = String.format("\"A1120837\",\"서울특별시 금천구 벚꽃로 286 삼성리더스타워 111~114호 (가산동)\",\"C\",\"의원\",\"G099\",\"응급의료기관 이외\",\"2\",\"외과: 상시진료 내과는 당분간 휴진\",\"서울시 송파구 문정동 장지동 법조단지 위례 가락동 가락시장역 위치 삼성서울병원 외래교수 출신 구강외과 전문의 진료 진료과목 - 임플란트 치조골 뼈이식 수술 매복 사랑니 발치 턱관절 악관절 질환의 치료 교정 치료 및 기타 보존 보철(크라운 브릿지 인레이) 신경치료\",\"방이역 1번출구 바로옆 굿모닝 신한증권 뒷건물\",\"가산기대찬의원\",\"02-6267-2580\",\"02-920-5374\",\"1930\",\"1930\",\"1930\",\"1930\",\"1930\",\"1500\",\"1500\",\"1500\",\"0900\",\"0900\",\"0900\",\"0900\",\"0900\",\"0900\",\"1000\",\"1000\",\"085\",null");

    @Test
    @DisplayName("check parsing")
    void name(){
        HospitalParser hospitalParser = new HospitalParser();

        Hospital hospital = hospitalParser.parse(str);

        assertEquals("A1120837", hospital.getId());
    }
    Hospital hospitalParsing(){
        str = str.replaceAll("\"", "");
        String[] splitted = str.split(",");

        return new Hospital(splitted[0],splitted[1]);
    }

}
