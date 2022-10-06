package week4_day3.exercise1;

import week3_day2.dependency_injection.RandomNumberGenerator;

import java.util.HashSet;
import java.util.Set;

public class RandomCharWithoutDuplicated {
    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < 50; i++) {
            // 65~90 -> 24개
            char random = (char)(randomNumberGenerator.generate(24) + 65);
            set.add(random);
        }

        for (Character s : set) {
            System.out.println(s);
        }
    }
}
