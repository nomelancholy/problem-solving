// 억 만

// 만 : 4

// 억 : 8

let num = 0;

const hundredMillion = 100000000
const tenThousand = 10000

let hundredMillionPartNumber
let tenThousandPartNumber
let lessThanThousandPartNumber

let formattedNumberArray = []

if (num >= hundredMillion) {
hundredMillionPartNumber = Math.floor(num / hundredMillion).toLocaleString() + '억 '
formattedNumberArray.push(hundredMillionPartNumber)

num = num % hundredMillion
}

if (num >= tenThousand) {
        tenThousandPartNumber = Math.floor(num / tenThousand).toLocaleString() + '만 '
        formattedNumberArray.push(tenThousandPartNumber)
        num = num % tenThousand
}

if (num !== 0){
        lessThanThousandPartNumber = num.toLocaleString();
        formattedNumberArray.push(lessThanThousandPartNumber)
}


const answer = formattedNumberArray.join('')

console.log('answer', answer)