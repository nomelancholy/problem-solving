process.stdin.setEncoding("utf8");

const array = [1, 5, 2, 6, 3, 7, 4];
const commands = [
  [2, 5, 3],
  [4, 4, 1],
  [1, 7, 3],
];
let answer = [];

for (let i = 0; i < commands.length; i++) {
  let start = commands[i][0] - 1;
  let end = commands[i][1];
  let k = commands[i][2] - 1;

  let temp = array.slice(start, end);

  // 오름차순 정렬
  temp.sort((a, b) => a - b);

  answer.push(temp[k]);
}

console.log(answer);
