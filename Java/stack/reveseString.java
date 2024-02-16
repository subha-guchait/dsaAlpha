package stack;

import java.util.Stack;

public class reveseString {
    public static String reverse(String str) {

        Stack<Character> s = new Stack<>();

        // to store the string in stack
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        // to reverse the string using pop
        StringBuilder result = new StringBuilder("");
        while (!s.isEmpty()) {
            result.append(s.pop());
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverse("abc"));
    }

}
