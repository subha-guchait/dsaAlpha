// Consider an integer sequence A = {1, 2, 3, …., N} i.e. the first N natural numbers in order and two integers, L and S. Check whether there exists a subarray of length L and sum S after removing at most one element from A.

// Examples:

// Input: N = 5, L = 3, S = 11
// Output: YES
// Explanation: We can remove 3 from A to obtain A = {1, 2, 4, 5} where {2, 4, 5} is a required subarray of size 3 and sum 11.

// Input: N = 5, L = 3, S = 5
// Output: NO
// Explanation:  For the above input its not possible to determine a subarray with the required conditions.

// intution

// The observations are

// The first observation is that if the given sum is less than the minimum sum or greater than the maximum sum then it is obvious that we can’t form or find a subarray. The minimum sum would be the sum of the first L natural numbers and the maximum sum would be the sum of the last L natural numbers.
// The second observation is that if the given sum is in between the minimum and maximum sum then it is always possible to obtain the sum because the sequence contains all the numbers in the natural numbers order so that we can always make a sub-array with the given sum provided by removing at most one element from the sequence.

function isPossible(n, l, s) {
  //minimum sum will be sum of the first l number
  let minSum = (l * (l + 1)) / 2;

  //maximum sum will be sum of last l number => sum of n number - sum of (n-l) number
  let maxSum = (n * (n + 1)) / 2 - ((n - l) * (n - l + 1)) / 2;

  // Checking if the given sum is not falling within the range then return false else return true
  if (s < minSum || s > maxSum) {
    return false;
  }
  return true;
}

console.log(isPossible(5, 3, 11));
