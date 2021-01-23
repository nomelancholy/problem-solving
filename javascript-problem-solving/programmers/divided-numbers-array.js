process.stdin.setEncoding("utf8");

const arr = [5, 9, 7, 10];
const divisor = 5;

arr.sort((a, b) => {
  return a - b;
});

let answer = [];

for (let element of arr) {
  if (element % divisor == 0) {
    answer.push(element);
  }
}

console.log(answer);
