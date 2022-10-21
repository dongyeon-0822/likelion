package week5.day5;

public class CorrectParenthesis01 {
    boolean solution(String s){
        while(s.indexOf("()")>=0){
            s=s.replace("()", "");
        }

        return s.length()==0;
    }
}
