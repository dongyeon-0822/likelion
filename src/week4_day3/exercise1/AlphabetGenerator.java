package week4_day3.exercise1;

public class AlphabetGenerator implements Generator<Character>{
    @Override
    public Character generate(int num) {
        int randomNum = (int) (Math.random() * 26);
        char randomChar = (char) (randomNum + num);
        return randomChar;
    }
}
