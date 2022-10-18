package codeUp_basic;

import java.util.Scanner;

public class PrintInput_1025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] data = scanner.next().toCharArray();
        for (int i = 0; i < data.length; i++) {
            System.out.printf("[%d]\n",(int)((data[i]-'0') * Math.pow(10, data.length-i-1)));
        }
    }
}
