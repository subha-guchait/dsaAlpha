// In A exam with negative marking the passing criteria is you have to score zero or positive marks .
// we have given an array which denotes the score of the students in that exam .
// you have to move all the failed students to last of the array .
// Solve this Question in 0(N) time complexity. Using two pointers. Watch Hints if not being able to figure out.

// Example 1:
// Input :
// N = 8
// arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
// Output :  1 3 2 11 6 -1 -7 -5

// Example 2:
// Input :
//  N=8
// arr[] = {-5, 7, -3, -4, 9, 10, -1, 11}
// Output : 7 9 10 11 -5 -3 -4 -1

function moveFailedStudents(arr) {
  const N = arr.length;
  let left = 0;
  let right = N - 1;

  while (left < right) {
    if (arr[left] >= 0) {
      left++;
    } else {
      const temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;
      right--;
    }
  }

  return arr;
}

let student1 = [1, 5, -8, 9, 0, 6, -4, 3];
console.log(moveFailedStudents(student1));
