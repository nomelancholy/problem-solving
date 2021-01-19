process.stdin.setEncoding("utf8");
process.stdin.on("data", (s) => {

  s = s.trim();

  let answer = '';
  
  let index = 0;

  if(s.length % 2 == 0){
    index = s.length / 2;
    answer = s.substring(index-1, index+1);
  }else {
    index = s.length / 2
    answer = s.charAt(index);
  }

  console.log(answer);

  process.exit();
});
