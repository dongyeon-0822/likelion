package codeUp_basic;

import java.util.Scanner;

public class PrintInput_1027 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.next();
        String[] strings = data.split("[.]");
        System.out.printf("%s-%s-%s", strings[2],strings[1],strings[0]);
    }
}
