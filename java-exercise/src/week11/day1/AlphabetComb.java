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
    static void printCombRecur(char c, char c2) {
        if (c2 > 'Z')
            return;
        System.out.printf("%c%c\n", c, c2);
        printCombRecur(c, (char)(c2+1));
    }
    static void printCombRecur2(char c) {
        if (c > 'Z') return;
        printCombRecur(c, 'A');
        printCombRecur2((char)(c+1));
    }
    public static void main(String[] args) {
        //printComb();
        //printComb2();
        printCombRecur2('A');
    }
}
