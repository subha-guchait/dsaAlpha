console.log("Q1");
// *
// **
// ***
// ****
// *****

for (let i = 1; i <= 5; i++) {
  let str = "";
  for (let j = 1; j <= i; j++) {
    str += "*";
  }
  console.log(str);
}

console.log("Q2");
// *****
// ****
// ***
// **
// *

for (let i = 1; i <= 5; i++) {
  let str = "";
  for (let j = 1; j <= -i + 6; j++) {
    str += "*";
  }
  console.log(str);
}

console.log("Q3");
// *******
// ****
// *

for (let i = 1; i <= 3; i++) {
  let str = "";
  for (let j = 1; j <= 10 - 3 * i; j++) {
    str += "*";
  }
  console.log(str);
}

console.log("Q4");
// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *

for (let i = 1; i <= 5; i++) {
  let str = "";
  for (let j = 1; j <= i; j++) {
    str += "*";
  }
  console.log(str);
}

for (let i = 1; i <= 4; i++) {
  let str = "";
  for (let j = 1; j <= 5 - i; j++) {
    str += "*";
  }
  console.log(str);
}
