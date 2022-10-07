package codeUp_basic;

import java.util.Scanner;

public class PrintInput_1023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double data = scanner.nextDouble();
        String[] strings = (Double.toString(data)).split("[.]");
        System.out.printf("%s\n%s", strings[0],strings[1]);
    }
}
