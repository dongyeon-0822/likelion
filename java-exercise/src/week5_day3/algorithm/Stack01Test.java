package week5_day3.algorithm;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class Stack01Test {
    @Test
    void pushTest() {
        Stack01 stack01 = new Stack01();
        stack01.push(1);
        Assertions.assertEquals(1,stack01.getArr()[0]);
    }
}