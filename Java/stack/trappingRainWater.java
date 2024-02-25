package stack;

// Intuition
// We need to figure out the total water we can trap, A difference of heights, maybe a smaller and a greater one would do the trick but a smaller bar can be smaller than multiple bars or a single tall bar can be taller than multiple smaller bars. So we can calculate total water trapped by each bar by tracking the smaller bars in a stack which contains bars in monotonically decreasing order.

// Approach
// Pop the elements out of stack if current bar's height is more than the minimum height bar in stack and calculate the water stored in that area and add it to answer.

import java.util.Stack;

public class trappingRainWater {
    public static int trappedWater(int[] height) {
        Stack<Integer> st = new Stack<>();
        int ans = 0;
        for (int i = 0; i < height.length; i++) {
            while (!st.isEmpty() && height[st.peek()] <= height[i]) {
                int curr = height[st.pop()];
                if (st.isEmpty()) { // Last bar as base cannot store any water
                    break;
                }
                int width = i - st.peek() - 1;
                int length = Math.min(height[i], height[st.peek()]) - curr;
                ans += length * width;
            }

            st.push(i);

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 2, 0, 3, 2, 5 };
        System.out.println(trappedWater(arr));
    }
}
