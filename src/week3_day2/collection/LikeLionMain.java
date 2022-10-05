package week3_day2.collection;

import java.util.List;

public class LikeLionMain {
    public static void main(String[] args) {
        LikeLion2th likeLion2th = new LikeLion2th();
        List<String> studentNames = likeLion2th.getStudentNameList();
        List<Student> studentInfos = likeLion2th.getStudentObjsList();

        //학생들의 이름 출력
        for (String name : studentNames){
            System.out.println(name);
        }
        //학생들의 정보 출력
        for (Student student : studentInfos){
            System.out.printf("반 : %d, 이름 : %s, gitRepo : %s\n", student.getClassNo(), student.getName(), student.getGitRepoAddress());
        }
    }
}

