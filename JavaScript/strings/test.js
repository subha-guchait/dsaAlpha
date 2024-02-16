class count_objects {
  //Write the code here
  static i = 0;
  constructor() {
    count_objects.i++;
  }
}
//Do Not change the Below  Code

var a = new count_objects();
var b = new count_objects();
var c = new count_objects();
console.log(count_objects.i);
var d = new count_objects();
console.log(count_objects.i);
var e = new count_objects();
console.log(count_objects.i);
