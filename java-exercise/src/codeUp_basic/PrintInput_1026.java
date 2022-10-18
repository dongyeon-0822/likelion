package codeUp_basic;

import java.util.Scanner;

public class PrintInput_1026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.next();
        String[] strings = data.split(":");
        System.out.printf("%d", Integer.parseInt(strings[1]));
    }
}
