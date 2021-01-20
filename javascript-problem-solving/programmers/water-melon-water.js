process.stdin.setEncoding("utf8");
process.stdin.on("data", (data) => {
  const n = Number(data);

  let answer = "";

  for (let i = 0; i < n; i++) {
    if (i % 2 == 0) {
      answer += "수";
    } else {
      answer += "박";
    }
  }

  console.log(answer);

  process.exit();
});
