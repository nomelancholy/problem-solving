process.stdin.setEncoding("utf8");
process.stdin.on("data", (data) => {
  let answer = true;
  const s = data.trim();

  const pattern = new RegExp("\\D");

  if (pattern.test(s)) {
    answer = false;
  }

  if (!(s.length == 4 || s.length == 6)) {
    answer = false;
  }

  console.log(answer);

  process.exit();
});
