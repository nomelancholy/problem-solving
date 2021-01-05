process.stdin.setEncoding("utf8");
process.stdin.on("data", (s) => {
  s = s.toUpperCase();

  let p = 0;
  let y = 0;

  let answer = false;

  for (let i = 0; i < s.length; i++) {
    if (s.charAt(i) == "P") {
      p++;
    } else if (s.charAt(i) == "Y") {
      y++;
    }
  }

  if (p == y) {
    answer = true;
  }

  console.log(answer);

  process.exit();
});
