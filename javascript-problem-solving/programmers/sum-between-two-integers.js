process.stdin.setEncoding("utf8");
process.stdin.on("data", (data) => {
  const n = data.split(" ");

  let a = Number(n[0]);
  let b = Number(n[1]);

  if (a > b) {
    let temp = a;
    a = b;
    b = temp;
  }

  let answer = 0;

  for (let i = a; i <= b; i++) {
    answer += i;
  }

  console.log(answer);
  process.exit();
});
