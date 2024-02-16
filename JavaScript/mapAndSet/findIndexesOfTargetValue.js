// Given An array Integer and Target value. return the index of elements whose absolute difference is equal to target.
// Absolute value of -9 is 9
// Solve it in O(n) Time Complexity

// Input:-
// Arr - [9,5,1, 11,14]
// Target - 2

// Output:-
// [0, 3]

// Explanation:-
// Absoulte value of(9-11) is 2 = target.

// Example 2:-

// Input:-
// Arr- [10,19,11,1,6]
// Target - 13

// Output:-
// [1,4]

// Explanation:-
// 19-6 is 13 = Target

// Constraints:
// 2 <= nums.length <= 10^4
// -10^9 <= nums[i] <= 10^9
// 0 <=target <= 10^9
// Only one valid answer exists.

//bruteforce approach ==> T.C. => O(n2)
function findIndexes(arr, target) {
  for (let i = 0; i < arr.length; i++) {
    for (let j = i + 1; j < arr.length; j++) {
      if (Math.abs(arr[i] - arr[j]) === target) {
        return [i, j];
      }
    }
  }
}

let arr1 = [9, 5, 1, 11, 14];
console.log(findIndexes(arr1, 2));

//optimal approach

// - we will store the array in map
// - value of the map will be index of the array
// - key of the map will of value of array (we store value of array as key because we need to search it later we cant search by value)
// - arr[i] - arr[j] = target => arr[i]-target = arr[j] (when i>j)
// - arr[i] - arr[j] = -target => arr[i]+target = arr[j] (when j>i)

function findIndexesoptimal(arr, target) {
  let myMap = new Map();
  //storing the array in map
  for (let i = 0; i < arr.length; i++) {
    myMap.set(arr[i], i);
  }

  for (let i = 0; i < arr.length; i++) {
    if (myMap.has(Math.abs(arr[i] - target))) {
      // when i>j
      return [i, myMap.get(Math.abs(arr[i] - target))];
    } else if (myMap.has(Math.abs(arr[i] + target))) {
      // when j>i
      return [i, myMap.get(Math.abs(arr[i] + target))];
    }
  }
}

let arr2 = [10, 19, 11, 1, 6];
console.log(findIndexesoptimal(arr2, 13));
