package week3_day3.MapExercise;

public class CheckAlphabet {
    public boolean isAlphabet(char c){
        if (c >= 'a'&& c <='z' || c >= 'A' && c<='Z'){
            return true;
        }
        return false;
    }
}
