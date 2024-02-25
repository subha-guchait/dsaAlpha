//stock span problem
// span of current day is max no of consecutive days [price of stock<= today's price]

// intution:
// we need to figure out stock span. We can do the soln with the help of next greater element to the Left(prevHigh).
// if we minus previous high from index of current elemnt we will get span of that day.(span = index of current day - index of prevHigh).
// But there is a problem when no prevhigh found then our span will be index of current day+1(Span=current day index + 1).

// logic:
//first we will take span arr that we have to return and our first day span always be 1
//then we will take a stack  to store index of prevHigh(next greater elment to left).
//then we will iterate through all day
//then we will run an while loop and check if our stack is not empty and price of current day is greater than prevHigh(peek of stack).
// If it is true we will pop the indexes from the stack
// after while loop ends we will check if our stack is empty or not if it is empty that means no prevhigh present and span will be i+1
// and if the stak is not empty then span will be i-index of prevhigh(peek of Stack)
// and at last we will push the index of currElement

function stockSpan(stock) {
  let span = [];
  let st = [];
  span[0] = 1;
  for (let i = 0; i < stock.length; i++) {
    //to get the greater elemnt to left for current day
    while (st.length && stock[i] > stock[st.length - 1]) {
      st.pop();
    }
    //to check if there is no greater elemnt to the left found
    if (!st.length) {
      span[i] = i + 1;
    } else {
      span[i] = i - st[st.length - 1];
    }
    st.push(i);
  }
  return span;
}

console.log(stockSpan([100, 80, 60, 70, 60, 75, 85, 100]));
