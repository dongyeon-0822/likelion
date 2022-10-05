package week3_day2.collection;

import java.util.List;

public class LikeLionMain {
    public static void main(String[] args) {
        LikeLion2th likeLion2th = new LikeLion2th();
        List<String> students = likeLion2th.getStudentList();

        for (String s : students){
            System.out.println(s);
        }
    }
}

