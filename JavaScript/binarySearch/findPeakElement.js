// // A peak element is an element that is strictly greater than its neighbors.
// // Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
// // You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.
// // You must write an algorithm that runs in O(log n) time.

// // Example 1:
// // Input: nums = [1,2,3,1]
// // Output: 2
// // Explanation: 3 is a peak element and your function should return the index number 2.

// // Example 2:
// // Input: nums = [1,2,1,3,5,6,4]
// // Output: 5
// // Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.

// // Constraints:
// // 1 <= nums.length <= 1000
// // -2^31 <= nums[i] <= 2^31 - 1
// // nums[i] != nums[i + 1] for all valid i.

// soln=>
// understanding problem=>
// we have to return peak elemnet from the given array if arr[i-1] <arr[i]>arr[i+1] => here we have to return arr[i].
// also one more condition is there that we have to imagine that in the left and right side of the array is -∞(infinity) like: -∞[arr]-∞

// we can do it with linear search but there  time complexity will be O(n). but here we have to solve it with O(logn) time complexity.
// so we have to apply binary search here because it is takes O(logn) time complexity.
// But here we can't apply simple binary search beause of the array is not sorted we have to modify the normal binary search.

// intution=>
// if we observe carefully the array is mountain like array or in ascending order or in decending order like  /\/\/\ or / or \ . And for mountain like array some part is in ascending order and then decending order then it will be in ascing order like that. As we have to find only one peak element so we can do search with that part where we sure that there should must be one peak element Present.
// so what we can do
// 1. if arr[mid-1] < arr[mid] < arr[mid+1] that means from here our array is in increasing order so the peak must be on right side, there may be peak present at left side also but we are not sure about that. so we remove our left side of the arr[mid] and our low will be mid+1;
// 2. Similarly if we find arr[mid-1] > arr[mid] > arr[mid+1] that means array is in decreasing order so peak will be present on left side of the array and we remove right side of the arr[mid]. and high = mid-1;
// 3. also we have to check condition for single element array and strictly incresasing order array and strictling decreasing order array. for single element array we will return 0(index of the array).
// for the condition last element is peak element we will just check if the last element is greater than its previous element because we know in the right side of last element is -infinity.
// similarly for the condition first element is peak element we will just check if the first element is greater than its next element because we know in the left side of first element is -infinity.

function peakElement(arr) {
  //to check condition for single elemnt array and first element is peak element
  if (arr.length == 1 || arr[0] > arr[1]) {
    return 0;
  }
  //to check condition for last element is peak element
  if (arr[arr.length - 1] > arr[arr.length - 2]) {
    return arr.length - 1;
  }
  let low = 0;
  let high = arr.length - 1;
  while (low <= high) {
    let mid = Math.floor((low + high) / 2);
    // to find peak elemnt
    if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
      return mid;
      // to check condition if array is in increasing order
    } else if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]) {
      low = mid + 1;
    } else {
      high = mid - 1;
    }
  }
  return -1;
}

console.log(peakElement([1, 2, 3, 2, 4, 6, 7, 5]));
