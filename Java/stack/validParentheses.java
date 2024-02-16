// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// An input string is valid if:

// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.

// Example 1:
// Input: s = "()"
// Output: true
// Example 2:
// Input: s = "()[]{}"
// Output: true
// Example 3:
// Input: s = "(]"
// Output: false

// approach : using stack

// -Initialize an empty stack.
// -Traverse the input string character by character.
// -If the current character is an opening bracket (i.e., '(', '{', '['), push it onto the stack.
// -check if the stack is empty. If it is empty, return false. because the closing bracket does not have a corresponding opening bracket.
// -Otherwise, pop the top element from the stack and check if it matches the current closing bracket. If it does not match, return false, because the brackets are not valid.
// -After traversing the entire input string, if the stack is empty, return true, because all opening brackets have been matched with their corresponding closing brackets.
// -Otherwise, return false, because some opening brackets have not been matched with their corresponding closing brackets.

package stack;

import java.util.*;

public class validParentheses {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            // checking for opening brackets
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                st.push(s.charAt(i));
                // if the stack is empty it means no opening braces so stack will be empty and
                // it will be invalid string
            } else if (st.isEmpty()) {
                return false;
                // checking for closing braces and compare it with top of the stack
            } else if ((st.peek() == '(' && s.charAt(i) == ')') || (st.peek() == '{' && s.charAt(i) == '}')
                    || (st.peek() == '[' && s.charAt(i) == ']')) {
                st.pop();
            } else {
                return false;
            }
        }

        return st.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("[{}()]"));
    }

}
