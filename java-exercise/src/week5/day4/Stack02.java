package week5.day4;

import java.util.EmptyStackException;

public class Stack02 {
    private int[] arr = new int[10000];
    private int top = -1;

    public Stack02() {
    }

    public Stack02(int size) {
        this.arr = new int[size];
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is Full");
            return;
        }
        this.arr[++top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return arr[top--];
    }

    public boolean isEmpty() {
        return (top == -1);
    }
    public int peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return arr[top];
    }

    public boolean isFull() {
        return (top == arr.length-1);
    }

    public int[] getArr() {
        return arr;
    }

}
