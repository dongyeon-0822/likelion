package week3.day1;

public class ArrayTest {
    public static void main(String[] args) {
        System.out.println("hello");
        // 10칸의 int array 를 만들고,
        // 1-10을 채우고, 출력하라.
        int[] array = new int[10];

        for (int i = 0; i < 10; i++){
            array[i] = i+1;
        }
        for (int i = 0; i < 10; i++){
            System.out.println(array[i]);
        }
    }
}
