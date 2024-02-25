package queue;

import java.util.*;

class StackUsing2QueueMethodOne {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public StackUsing2QueueMethodOne() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    // push --O(n)
    public void push(int x) {
        if (!q1.isEmpty()) {
            q2.add(x);
            while (!q1.isEmpty()) {
                q2.add(q1.remove());
            }
        } else {
            q1.add(x);
            while (!q2.isEmpty()) {
                q1.add(q2.remove());
            }
        }
    }

    // pop--- O(1)
    public int pop() {
        if (q1.isEmpty() && q2.isEmpty()) {
            return -1;
        }

        if (!q1.isEmpty()) {
            return q1.remove();
        } else {
            return q2.remove();
        }
    }

    // top---O(1)
    public int top() {
        if (q1.isEmpty() && q2.isEmpty()) {
            return -1;
        }

        if (!q1.isEmpty()) {
            return q1.peek();
        } else {
            return q2.peek();
        }

    }

    // empty--O(1)
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }

}

class StackUsing2QueueMethodTwo {
    Queue<Integer> q1;
    Queue<Integer> q2;

    public StackUsing2QueueMethodTwo() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }

    // push --O(1)
    public void push(int x) {
        if (!q1.isEmpty()) {
            q1.add(x);

        } else {
            q2.add(x);
        }
    }

    // pop--- O(n)
    public int pop() {
        if (empty()) {
            return -1;
        }

        int top = -1;
        if (!q1.isEmpty()) {
            while (!q1.isEmpty()) {
                top = q1.remove();
                if (q1.isEmpty()) {
                    break;
                }
                q2.add(top);
            }
        } else {
            while (!q2.isEmpty()) {
                top = q2.remove();
                if (q2.isEmpty()) {
                    break;
                }
                q1.add(top);
            }
        }
        return top;
    }

    // top---O(n)
    public int top() {
        if (empty()) {
            return -1;
        }

        if (!q1.isEmpty()) {
            int top = -1;
            while (!q1.isEmpty()) {
                top = q1.remove();
                q2.add(top);
            }
            return top;
        } else {
            int top = -1;
            while (!q2.isEmpty()) {
                top = q2.remove();
                q1.add(top);
            }
            return top;
        }

    }

    // empty--O(1)
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }

}

public class StackUsingTwoQueues {
    StackUsing2QueueMethodOne s1 = new StackUsing2QueueMethodOne();

    public static void main(String[] args) {
        StackUsing2QueueMethodOne s1 = new StackUsing2QueueMethodOne();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        while (!s1.empty()) {
            System.out.println(s1.top());
            s1.pop();
        }

    }

}
