package week5.day3;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class Stack01Test {
    @Test
    void pushTest() {
        Stack01 stack01 = new Stack01();
        stack01.push(1);
        assertEquals(1,stack01.getArr()[0]);
    }

    public static void main(String[] args) {
        Stack01Test stack01Test = new Stack01Test();
        stack01Test.pushTest();
    }
}