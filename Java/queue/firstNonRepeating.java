package queue;

import java.util.*;

public class firstNonRepeating {
    public static void printNonRepeating(String str) {
        int freq[] = new int[26]; // to track freq of characters
        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;
            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }

            if (q.isEmpty()) {
                System.out.print('#' + " ");
            } else {
                System.out.print(q.peek() + " ");
            }
        }
        System.out.println();

    }

    public static void main(String[] args) {
        String str = "aabccxb";
        printNonRepeating(str);

    }
}
