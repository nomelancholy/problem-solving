process.stdin.setEncoding("utf8");
process.stdin.on("data", (s) => {
  s = s.trim();

  let masking = s.substring(0, s.length - 4);
  let number = s.substring(s.length - 4, s.length);

  let answer = "";

  for (let i = 0; i < masking.length; i++) {
    answer = answer + "*";
  }

  answer += number;

  console.log(answer);

  process.exit();
});
