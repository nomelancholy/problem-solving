const peopleCount = 3
const amount = 10

const share = Math.floor(amount / peopleCount)
const rest = amount % peopleCount

let answer = []

for(let i=0; i<peopleCount; i++){
    if(i === 0 && rest){
        answer[i] = share + rest
    }else {
        answer[i] = share
    }
}

return answer;