process.stdin.setEncoding("utf8");
process.stdin.on("data", (data) => {
  const n = Number(data);

  let sum = 0;

  for (let i = 1; i <= n; i++) {
    if (n % i == 0) {
      sum += i;
    }
  }

  console.log(sum);

  process.exit();
});
