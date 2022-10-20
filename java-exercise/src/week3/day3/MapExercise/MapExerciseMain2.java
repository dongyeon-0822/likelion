package week3.day3.MapExercise;

import java.util.HashMap;

public class MapExerciseMain2 {
    public static void main(String[] args) {
        String repoAddr = "https://github.com/dongyeon-0822/java-project-exercise";
        HashMap<Character, Integer> alphabetCnt = new HashMap<>();
        CheckAlphabet checkAlphabet = new CheckAlphabet();

        // map 에 알파벳 put
        for (char c = 'a'; c <= 'z'; c++) {
            alphabetCnt.put(c, 0);
        }
        for (Character c : repoAddr.toLowerCase().toCharArray()) {
            if (checkAlphabet.isAlphabet(c)) {
                alphabetCnt.put(c, alphabetCnt.get(c) + 1);
            }
        }
        System.out.println(alphabetCnt);
    }
}
