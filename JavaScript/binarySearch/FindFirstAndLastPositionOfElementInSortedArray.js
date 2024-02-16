// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
// If target is not found in the array, return [-1, -1].
// You must write an algorithm with O(log n) runtime complexity.

// Example 1:
// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]

// Example 2:
// Input: nums = [5,7,7,8,8,10], target = 6
// Output: [-1,-1]

// Example 3:
// Input: nums = [], target = 0
// Output: [-1,-1]

//bruteforce approach TC => O(n)

// 1. iterative
function findFirstAndLastPosIterative(arr, target) {
  let first = -1;
  let last = -1;

  for (let i = 0; i < arr.length; i++) {
    if (arr[i] === target) {
      if (first == -1) {
        first = i;
      }
      last = i;
    }
  }
  return [first, last];
}

let arr1 = [1, 3, 5, 5, 5, 5, 67, 123, 125];
console.log(findFirstAndLastPosIterative(arr1, 5));

//2. 2 pointer
function findFirstAndLastPos2pointer(arr, target) {
  let first = -1;
  let last = -1;
  let i = 0;
  let j = arr.length - 1;
  while (i <= j) {
    if (arr[i] === target) {
      if (first == -1) {
        first = i;
      }
    }
    if (arr[j] === target) {
      if (last == -1) {
        last = j;
      }
    }
    i++;
    j--;
  }
  return [first, last];
}

let nums = [5, 7, 7, 8, 8, 8, 9, 10];
console.log(findFirstAndLastPos2pointer(nums, 8));

//optimal approach
// -- As the array is sorted we have to solve it with logn time complexity we will apply binary search
// - find first occurance of Element
// - find second occurance of Element
// - return indexes of these occurance

function findFirstAndLastPosBinarySearch(arr, target) {
  let first = -1;
  let last = -1;

  //finding first occcurance
  let left = 0;
  let right = arr.length - 1;
  while (left <= right) {
    let mid = Math.floor((left + right) / 2);
    if (arr[mid] === target) {
      first = mid;
      right = mid - 1;
    } else if (arr[mid] > target) {
      right = mid - 1;
    } else {
      left = mid + 1;
    }
  }

  //finding last occcurance
  left = 0;
  right = arr.length - 1;
  while (left <= right) {
    let mid = Math.floor((left + right) / 2);
    if (arr[mid] === target) {
      last = mid;
      left = mid + 1;
    } else if (arr[mid] > target) {
      right = mid - 1;
    } else {
      left = mid + 1;
    }
  }
  return [first, last];
}

let arr2 = [1, 3, 5, 5, 5, 5, 7, 123, 125];
console.log(findFirstAndLastPosBinarySearch(arr2, 7));
