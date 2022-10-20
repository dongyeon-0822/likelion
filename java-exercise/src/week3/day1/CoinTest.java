package week3.day1;

import java.util.Scanner;

public class CoinTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = 0;
        int num = 0;
        int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
        int unit1 = 50000;
        int unit2 = 10000;
        int unit3 = 5000;
        int unit4 = 1000;
        int unit5 = 500;
        int unit6 = 100;
        int unit7 = 50;
        int unit8 = 10;

        System.out.print("금액을 넣으세요 : ");
        amount = scanner.nextInt();
//        for (int i = 0; i < unit.length; i++){
//            num = amount / unit[i];
//            amount %= unit[i];
//            System.out.println(unit[i] + "원 " + num + "개");
//        }
        System.out.println(unit1 + "원 " + amount / unit1 + "개 " + "나머지는 : " + amount % unit1 + "원");
        amount %= unit1;
        System.out.println(unit2 + "원 " + amount / unit2 + "개 " + "나머지는 : " + amount % unit2 + "원");
        amount %= unit2;
        System.out.println(unit3 + "원 " + amount / unit3 + "개 " + "나머지는 : " + amount % unit3 + "원");
        amount %= unit3;
        System.out.println(unit4 + "원 " + amount / unit4 + "개 " + "나머지는 : " + amount % unit4 + "원");
        amount %= unit4;
        System.out.println(unit5 + "원 " + amount / unit5 + "개 " + "나머지는 : " + amount % unit5 + "원");
        amount %= unit5;
        System.out.println(unit6 + "원 " + amount / unit6 + "개 " + "나머지는 : " + amount % unit6 + "원");
        amount %= unit6;
        System.out.println(unit7 + "원 " + amount / unit7 + "개 " + "나머지는 : " + amount % unit7 + "원");
        amount %= unit7;
        System.out.println(unit8 + "원 " + amount / unit8 + "개 " + "나머지는 : " + amount % unit8 + "원");
        amount %= unit8;
    }
}
