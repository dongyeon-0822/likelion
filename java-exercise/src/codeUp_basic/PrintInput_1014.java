package codeUp_basic;

import java.util.Scanner;

public class PrintInput_1014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        char a,b;

        str = sc.nextLine();
        a = str.charAt(0);
        b = str.charAt(2);
        System.out.printf("%c %c", b, a);
    }
}
