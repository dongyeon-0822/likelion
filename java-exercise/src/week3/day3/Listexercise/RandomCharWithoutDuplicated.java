package week3.day3.Listexercise;

import java.util.HashSet;
import java.util.Set;

public class RandomCharWithoutDuplicated {
    public static void main(String[] args) {
        AlphabetGenerator alphabetGenerator = new AlphabetGenerator();
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < 50; i++) {
            // 65~90 -> 24개
            char random = (char)(alphabetGenerator.generate(65));
            set.add(random);
        }

        for (Character s : set) {
            System.out.println(s);
        }
    }
}
