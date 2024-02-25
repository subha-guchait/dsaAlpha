package queue;

import java.util.*;

public class SlidingWindowMaximum {
    // bruteForce
    // for brote force approach we are just looking for max for each subarray

    public static int[] slidingWindowMaxBf(int nums[], int k) {
        // array for returning max in each window
        int ans[] = new int[nums.length - k + 1];
        for (int i = 0; i <= nums.length - k; i++) {
            int max = nums[i];
            for (int j = i; j <= i + k - 1; j++) {
                max = Math.max(max, nums[j]);
            }
            ans[i] = max;
        }
        return ans;
    }

    // Time complexity of brute force approach will be O(n2)

    // optimal approach: Using deque
    // in the deque we will store the index of arr and will store in decreasing
    // order.
    // in any index if we found curr elemnt is geater than previous elemnt we will
    // pop them as we have to return maximum
    // so we don't need smaller element anymore
    // and we will remove elemnt from first if the elemnt is out of range of our
    // window
    // then we will store max of each window that will be our firstelemnet of our
    // deque as we are storing in decresing order
    // and in last we will return max array

    // Tc-- O(n+n)==> O(n)
    // O(n) for the outer loop and another O(n) for each time we removing elemmnt
    // which is out of window and for removing smaller element from deque

    public static int[] slidingWindowMax(int nums[], int k) {
        int result[] = new int[nums.length - k + 1];
        Deque<Integer> dq = new LinkedList<>();
        int ri = 0; // index of result array

        for (int i = 0; i < nums.length; i++) {

            // when elemnt is out of window
            if (!dq.isEmpty() && dq.getFirst() == i - k) {
                dq.removeFirst();
            }

            // when the elemnet is smaller than curr element
            while (!dq.isEmpty() && nums[dq.getLast()] <= nums[i]) {
                dq.removeLast();
            }

            dq.addLast(i);

            if (i >= k - 1) {
                result[ri++] = nums[dq.getFirst()];
            }
        }
        return result;
    }

    public static void printArr(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
        printArr(slidingWindowMaxBf(nums, 3));
        printArr(slidingWindowMax(nums, 3));

    }
}
