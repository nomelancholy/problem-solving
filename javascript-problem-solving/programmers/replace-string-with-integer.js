process.stdin.setEncoding("utf8");
process.stdin.on("data", (s) => {
  let answer = Number(s);

  console.log(answer);

  process.exit();
});
