process.stdin.setEncoding("utf8");
process.stdin.on("data", (data) => {
  const num = Number(data);

  if (num % 2 == 0) {
    console.log("Even");
  } else {
    console.log("Odd");
  }

  process.exit();
});
