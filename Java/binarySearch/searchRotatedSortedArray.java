package binarySearch;
//There is an integer array nums sorted in ascending order (with distinct values).

// Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

// Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

// You must write an algorithm with O(log n) runtime complexity.

// sollution:=>
// approch 1 : By searching linearly TC will be O(n)
// approach 2: Binary Search (we will try to apply binary search where we have to search in any sorted array). TC => O(logn)
// but here we can't apply simple binary search because the array is rotated so we have to write modified binary search.
// 1st Step: calculate mid and compare with target if equal then return mid.
// 2nd step: find sorted half then compare with target if it is lies between the sorted part or not.
//         If target is lies between sorted part we can remove other half. And if target not lies here we will remove sorted part.

//note : we know one thing that in this array one half is must be sorted because it is rotated sorted array

public class searchRotatedSortedArray {
    public static int search(int nums[], int target) {
        int low = 0, high = nums.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            // to find left half is sorted
            if (nums[low] <= nums[mid]) {
                // figure out if element lies on left half or not
                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } // to find right half is sorted
            else {
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = { 10, 12, 14, 16, 0, 2, 5 };
        System.out.println(search(nums, 2));
        System.out.println(search(nums, 6));
    }
}
