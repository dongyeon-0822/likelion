package week5_day3.algorithm;

public class Stack01 {
    private int[] arr = new int[10000];
    private int top = -1;

    public Stack01() {
    }

    public Stack01(int size) {
        this.arr = new int[size];
    }

    public void push(int value) {
        this.arr[++top] = value;
    }

    public int pop() {
        return arr[top--];
    }
    public int[] getArr() {
        return arr;
    }
}
