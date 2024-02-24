package org.tfoc;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Slf4j
class MinStackTest {

    MinStack minStack;

    @BeforeEach
    void setUp() {
        this.minStack = new MinStack();
    }
    @Test
    void testMinStack() throws Exception {
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        assertEquals(-3, minStack.getMin());
        minStack.pop();
        assertEquals(0,minStack.top());
        assertEquals(-2, minStack.getMin());

    }

    @Test
    void push() throws Exception {

        minStack.push(10);
        assertEquals(10, minStack.top());
        assertEquals(10, minStack.getMin());
    }

    @Test
    void testPopThrows() {

        boolean thrown = false;
        try {
            minStack.pop();
        } catch (Exception ex) {
            thrown = true;
        }
        assertTrue(thrown);
    }

    @Test
    void top() {
    }

    @Test
    void getMin() {
    }

}