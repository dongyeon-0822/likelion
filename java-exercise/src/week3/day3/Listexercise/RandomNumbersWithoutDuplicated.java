package week3.day3.Listexercise;

import week3.day2.dependency_injection.RandomNumberGenerator;

import java.util.HashSet;
import java.util.Set;

public class RandomNumbersWithoutDuplicated {
    public static void main(String[] args) {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 50; i++) {
            int random = randomNumberGenerator.generate(50);
            set.add(random);
        }

        for (Integer s : set) {
            System.out.println(s);
        }
    }

}
