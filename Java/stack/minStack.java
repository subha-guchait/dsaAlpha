// Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

// Implement the MinStack class:

// MinStack() initializes the stack object.
// void push(int val) pushes the element val onto the stack.
// void pop() removes the element on the top of the stack.
// int top() gets the top element of the stack.
// int getMin() retrieves the minimum element in the stack.
// You must implement a solution with O(1) time complexity for each function.

// solution

// approach: using 2 stack one is main stack and another is minimum stack

// here we will maintain two stack.
// on the main stack we will maintain original order of the element and in minStack we will maintain minimum number till now
// push operation:
// for push operation we push the element in main stack and in minStack first we check if the element is less than or equal to top of the minStack
// if its true then we push the element in min stack also because now the current elemnet is minimum element
// pop operation:
// for pop operation we do not pop elemnt from main stack first .
// because first we have to check if the top of main stack is equal to top of the minStack
// if its true then we pop elemnet from min stack
// after that we pop from main stack(note: we don't pop from main stack first because if we do that then we can't compare it to top of min stack)
// top and getMin operation:
// for peek we just return the peek of main stack 
// for getMin return peek of the minStack

package stack;

import java.util.*;

public class minStack {
    public static void main(String[] args) {
        MinStak stack = new MinStak();
        stack.push(5);
        stack.push(0);
        stack.push(-2);
        System.out.println(stack.getMin());
        System.out.println(stack.top());
        stack.push(-3);
        System.out.println(stack.getMin());
        stack.pop();
        System.out.println(stack.top());
    }

}

class MinStak {
    Stack<Integer> st;
    Stack<Integer> minSt;

    public MinStak() {
        st = new Stack<>();
        minSt = new Stack<>();
    }

    public void push(int val) {
        st.push(val);
        if (minSt.isEmpty() || val <= minSt.peek()) {
            minSt.push(val);
        }

    }

    public void pop() {
        if (st.peek().equals(minSt.peek())) {
            minSt.pop();
        }
        st.pop();

    }

    public int top() {
        return st.peek();

    }

    public int getMin() {
        return minSt.peek();

    }
}
