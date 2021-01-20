process.stdin.setEncoding("utf8");
process.stdin.on("data", (data) => {
  const input = data.split(" ");

  let x = Number(input[0]);
  let n = Number(input[1]);

  let answer = [];

  let temp = x;

  for (let i = 0; i < n; i++) {
    answer.push(temp);
    temp += x;
  }

  console.log(answer);
  process.exit();
});
