// Given two integer arrays pushed and popped each with distinct values, return true if this could have been the result of a sequence of push and pop operations on an initially empty stack, or false otherwise.

// Example 1:
// Input: pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
// Output: true
// Explanation: We might do the following sequence:
// push(1), push(2), push(3), push(4),
// pop() -> 4,
// push(5),
// pop() -> 5, pop() -> 3, pop() -> 2, pop() -> 1

// Example 2:
// Input: pushed = [1,2,3,4,5], popped = [4,3,5,1,2]
// Output: false
// Explanation: 1 cannot be popped before 2.

// --approach: using stack
// We can simulate the stack operations using a list or a stack data structure.
// We iterate through the pushed list and push each element onto the stack. For each element pushed, we check if it matches the current element to be popped from popped. If it does, we pop the element from the stack and move on to the next element in popped.
// If the stack is empty and we have iterated through all the elements in popped, then the sequences are valid.
// --Intuition:
// The problem requires us to validate if a given sequence of push and pop operations on a stack is valid or not.
// We can use the fact that if an element is pushed onto the stack, it can only be popped after all the elements pushed before it have been popped.
// We can use a stack to keep track of the elements pushed onto it and simulate the pop operation by checking if the element to be popped matches the top element of the stack.
// If the sequences are valid, then all elements should have been pushed onto the stack and popped in the correct order.

package stack;

import java.util.Stack;

public class validateStackSequence {
    public static boolean valid(int[] pushed, int[] popped) {
        int j = 0; // Intialise one pointer pointing on popped array
        Stack<Integer> st = new Stack<>(); // Create a stack
        for (int i = 0; i < pushed.length; i++) {
            st.push(pushed[i]); // insert the values in stack
            while (!st.isEmpty() && st.peek() == popped[j]) { // cheking if st.peek() values equal to popped[j];
                st.pop(); // then pop out
                j++;
            }
        }
        return st.isEmpty(); // check if stack is empty return true else false
    }

    public static void main(String[] args) {
        int[] pushed = { 1, 2, 3, 4, 5 };
        int[] popped = { 4, 5, 3, 2, 1 };
        System.out.println(valid(pushed, popped));
    }
}
