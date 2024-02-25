package queue;

import java.util.*;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addFirst(3);
        System.out.println(dq); // 3 2 1
        dq.addLast(4);
        dq.addLast(5);
        dq.addLast(6);
        System.out.println(dq); // 3 2 1 4 5 6
        dq.removeFirst(); // 3
        dq.removeLast(); // 6
        System.out.println(dq); // 2 1 4 5
        System.out.println("First ele: " + dq.getFirst()); // 2
        System.out.println("Last ele: " + dq.getLast()); // 5

    }
}
