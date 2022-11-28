package week11.day1;

public class AlphabetComb {
    static void printComb() {
        char c = 'A';
        for (int i = 0; i < 26; i++) {
            System.out.println((char)(c+i));
        }
    }
    public static void main(String[] args) {
        printComb();
    }
}
