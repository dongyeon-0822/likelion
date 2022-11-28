package week11.day1;

public class AlphabetComb {
    static void printComb() {
        for (int i = 0; i < 26; i++) {
            System.out.println((char)('A'+i));
        }
    }
    static void printComb2() {
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                System.out.print((char)('A'+i));
                System.out.println((char)('A'+j));
            }
        }
    }
    public static void main(String[] args) {
        //printComb();
        printComb2();
    }
}
