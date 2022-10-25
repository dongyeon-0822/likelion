package week6.day2;

public class HashFunction {
    public int hash(String str) {
        int ascii = 0;
        for (int i = 0; i < str.length(); i++) {
            ascii += str.charAt(i);
        }
        return ascii % 1000; // 1000개
    }

    public static void main(String[] args) {
        HashFunction h = new HashFunction();
        h.hash("hello");
    }
}
