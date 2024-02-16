// You have given a string , You have to add characters at start of string to make it a palindrome .
// return the minimum number of characters required to add to make it a palindrome.

// Example 1:
// Input:
// str = "abcd"
// Output: 3
// Explanation: Inserted character marked with bold characters in dcbabcd

// Example 2:
// Input:
// str = "aa"
// Output: 0
// Explanation:"aa" is already a palindrome.

function minimumCount(s) {
  let count = 0;
  let i = 0;
  let j = s.length - 1;
  while (i < j) {
    if (s[i] === s[j]) {
      i++;
      j--;
    } else {
      j--;
      count++;
    }
  }
  return count;
}

console.log(minimumCount("amai"));
console.log(minimumCount("abcd"));
