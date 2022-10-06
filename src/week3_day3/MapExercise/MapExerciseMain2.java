package week3_day3.MapExercise;

import java.util.HashMap;

public class MapExerciseMain2 {
    public static void main(String[] args) {
        String repoAddr = "https://github.com/dongyeon-0822/java-project-exercise";
        HashMap<Character, Integer> alphabetCnt = new HashMap<>();
        CheckAlphabet checkAlphabet = new CheckAlphabet();

        for (Character c : repoAddr.toCharArray()) {
            if (checkAlphabet.isAlphabet(c)) {
                c = Character.toLowerCase(c);
                if (alphabetCnt.containsKey(c)) {
                    alphabetCnt.put(c, alphabetCnt.get(c) + 1);
                } else {
                    alphabetCnt.put(c, 1);
                }
            }
        }
        System.out.println(alphabetCnt);
    }
}
