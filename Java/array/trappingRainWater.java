package array;
// Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

// Example 1:
// Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
// Output: 6
// Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.

// approach: Brute force 
// intution: The task is to calculate the amount of water that can be trapped between the bars of different heights. The optimized code uses a two-pointer approach, whereas the brute force approach checks for the maximum height of bars to the left and right of every bar.
// logic: here we will take two helper array to calcalute left max boundary and right max boundary
// after that for an particular index we will take minimum of these two boundary to calcalute water level because water can trapped maximum to minimum boundary height.
// then we will substract bar height from the water level.
// and then add each water trapped one by one. 
// here TC will be O(n) and space complexity will also O(n) because we are taking 2 extra array to calculate left and right max boundary

public class trappingRainWater {
    public static int trappedRainWater(int height[]) { // tc = O(n)
        int n = height.length;

        // calculate left max boundary array
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i - 1]);
        }

        // calculate right max boundary array
        int rightMax[] = new int[n];
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);
        }
        int trappedWater = 0;
        // loop
        for (int i = 0; i < n; i++) {
            // waterLevel = min(leftmax bound, rightmax bound)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            // trapped water = waterLevel - height[i]
            trappedWater += waterLevel - height[i];

        }
        return trappedWater;

    }

    // approach: optimal using 2 pointer
    // intution: The approach with two pointers calculates the water between two
    // bars by keeping track of the maximum height bars from left and right as it
    // moves towards the middle of the bars.
    // logic:
    // -Initialize left, right pointers to the first and last bars of the height
    // array, respectively.
    // -Initialize variables left_max and right_max to zero.
    // -While the left pointer is less than or equal to the right pointer, compare
    // the heights of the bars pointed to by the left and right pointers.
    // -If the height of the left bar is less than or equal to the height of the
    // right bar, check if the height of the left bar is greater than or equal the
    // left_max variable. If it is, update left_max, otherwise, add left_max -
    // height[left] to the "water" variable. Move the left pointer to the next bar.
    // -If the height of the right bar is less than the height of the left bar,
    // check if the height of the right bar is greater than or equal to the
    // right_max variable. If it is, update right_max, otherwise, add right_max -
    // height[right] to the "water" variable. Move the right pointer to the previous
    // bar.
    // -Return the value of the "water" variable.

    public static int trappedRainWater2Pointer(int arr[]) {
        int left = 0, right = arr.length - 1, leftMax = 0, rightMax = 0;
        int res = 0;

        while (left <= right) {
            if (arr[left] <= arr[right]) {
                if (arr[left] >= leftMax) {
                    leftMax = arr[left];
                } else {
                    res += leftMax - arr[left];

                }
                left++;
            } else {
                if (arr[right] >= rightMax) {
                    rightMax = arr[right];
                } else {
                    res += rightMax - arr[right];
                }
                right--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(trappedRainWater(height));
        int[] height1 = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };
        System.out.println(trappedRainWater2Pointer(height1));
    }
}
