package week3.day3.collection;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    private List<String> students;

    public ListExercise(){
        this.students = new ArrayList<>();
        this.students.add("김경록");
        this.students.add("강동연");
    }

    public List<String> getStudents() {
        return this.students;
    }
}
