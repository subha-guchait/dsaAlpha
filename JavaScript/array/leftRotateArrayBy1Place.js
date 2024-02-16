//Left Rotate the Array by One place
// [1,2,3,4,5] => [2,3,4,5,1]

let rotateArrayBy1Place = function (arr) {
  let temp = arr[0];
  for (let i = 1; i < arr.length; i++) {
    arr[i - 1] = arr[i];
  }
  arr[arr.length - 1] = temp;
  return arr;
};

let arr1 = [1, 2, 3, 4, 5];

console.log(rotateArrayBy1Place(arr1));
