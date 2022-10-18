package codeUp_basic;

import java.util.Scanner;

public class PrintInput_1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] personalNum = sc.next().split("-");
        System.out.println(personalNum[0] + personalNum[1]);
    }
}
