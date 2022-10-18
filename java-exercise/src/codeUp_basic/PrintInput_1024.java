package codeUp_basic;

import java.util.Scanner;

public class PrintInput_1024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.next();
        for (Character c : data.toCharArray()) {
            System.out.printf("'%c'\n",c);
        }
    }
}
