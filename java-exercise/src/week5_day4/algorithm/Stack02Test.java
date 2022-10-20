package week5_day4.algorithm;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class Stack02Test {
    Stack02 stack02 = new Stack02();
    @Test
    void pushTest() {
        stack02.push(1);
        stack02.push(2);
        assertEquals(2,stack02.getArr()[1]);
        assertEquals(1,stack02.getArr()[0]);
    }

    @Test
    void popTest() {
        assertEquals(2,stack02.pop());
        assertEquals(1,stack02.pop());
    }

    @Test
    void isEmptyTest() {
        //assertFalse(stack02.isEmpty());
        assertTrue(stack02.isEmpty());
        assertThrows(EmptyStackException.class,()->{
            stack02.pop();
        });
    }

    public static void main(String[] args) {
        Stack02Test stack02Test = new Stack02Test();
        stack02Test.pushTest();
        stack02Test.popTest();
        stack02Test.isEmptyTest();
    }
}