package codeUp_basic;

import java.util.Scanner;

public class PrintInput_1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] date = sc.next().split("[.]");
        System.out.printf("%04d.%02d.%02d", Integer.parseInt(date[0]), Integer.parseInt(date[1]), Integer.parseInt(date[2]));
    }
}
