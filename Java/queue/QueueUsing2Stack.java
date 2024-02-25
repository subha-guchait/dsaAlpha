package queue;

import java.util.Stack;

public class QueueUsing2Stack {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        // add --- O(n)
        public static void add(int data) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(data);

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // remove --- O(1)
        public static int remove() {
            if (s1.isEmpty()) {
                return -1;
            }
            return s1.pop();
        }

        // peek--- O(1)
        public static int peek() {
            if (isEmpty()) {
                return -1;
            }
            return s1.peek();
        }
    }

    static class QueueTwo {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        // add --- O(1)
        public static void add(int data) {
            s1.push(data);
        }

        // remove --- O(n)
        public static int remove() {
            if (s1.isEmpty()) {
                return -1;
            }
            while (!s1.isEmpty()) {
                s2.push(s1.peek());
            }
            int res = s2.pop();
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
            return res;
        }

        // peek--- O(n)
        public static int peek() {
            if (s1.isEmpty()) {
                return -1;
            }
            while (!s1.isEmpty()) {
                s2.push(s1.peek());
            }
            int res = s2.peek();
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
            return res;
        }

    }

    public static void main(String[] args) {
        // Queue q = new Queue();
        // q.add(5);
        // q.add(6);
        // q.add(7);
        // q.add(8);

        // while (!q.isEmpty()) {
        // System.out.println(q.peek());
        // q.remove();
        // }

        QueueTwo q1 = new QueueTwo();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);

        while (!q1.isEmpty()) {
            System.out.println(q1.peek());
            q1.remove();
        }
    }
}
