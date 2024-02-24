package org.tfoc;

import java.util.*;

/**
 * MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack()
 * obj.push(val)
 * obj.pop()
 * int param_3 = obj.top()
 * int param_4 = obj.getMin()
 */
public class MinStack {

    Stack<Integer> stack;
    List<Integer> sortedStack;
    int min = Integer.MAX_VALUE;

    public MinStack() {
        this.stack = new Stack<>();
        this.sortedStack = new ArrayList<>();
    }

    public void push(int val) {
        this.stack.push(val);
        this.sortedStack.add(val);
        Collections.sort(sortedStack);
        if (val < min) {
            min = val;
        }
    }

    public void pop() throws Exception {
        if (this.sortedStack.isEmpty())
            throw new Exception("Cannot remove elements from empty MinStack");
        else {
            Integer value = this.stack.pop();
            this.sortedStack.remove(value);
            if (value.equals(this.min))
                min = sortedStack.isEmpty() ? Integer.MAX_VALUE : sortedStack.get(0);
        }
    }

    public int top() throws Exception {
        if (this.stack.isEmpty())
            throw new Exception("MinStack is empty");
        return stack.peek();
    }

    public int getMin() throws Exception {

        if (this.sortedStack.isEmpty())
            throw new Exception("MinStack is empty");
        return this.min;
    }

}
