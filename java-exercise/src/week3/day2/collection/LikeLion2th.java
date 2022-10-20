package week3.day2.collection;

import java.util.ArrayList;
import java.util.List;

// 학생들의 이름, 정보를 반환하는 메소드를 가진 클래스
public class LikeLion2th {
    Infos infos = new Infos();
    private List<String> studentNames = new ArrayList<>();
    private List<Student> studentObjs = new ArrayList<>();
    public LikeLion2th() {
        this.studentNames = infos.getStudentNames();
        this.studentObjs = infos.getStudentObjs();
    }
    // 학생 이름 리스트를 리턴하는 메소드
    public List<String> getStudentNameList() {
        return this.studentNames;
    }
    public List<Student> getStudentObjsList() {
        return this.studentObjs;
    }
}
