	
	const diffNowToBirthYear = nowDate.getFullYear() - birthDate.getFullYear()
	const diffNowToBirthMonth = nowDate.getMonth() - birthDate.getMonth()
	const diffNowToBirthDate = nowDate.getDate() - birthDate.getDate()
	
	let koreanAge
	let americanAge
	
	if(diffNowToBirthYear <= 0 && diffNowToBirthMonth <= 0 && diffNowToBirthDate <= 0){
		koreanAge = 0
		americanAge = 0
	}else {
		koreanAge = diffNowToBirthYear + 1
	
		let isBirthDayOver = false

		if(diffNowToBirthMonth > 0){
			isBirthDayOver = true
		}else if(diffNowToBirthMonth === 0) {
			if(diffNowToBirthDate >= 0){
				isBirthDayOver = true
			}
		}

		if(isBirthDayOver){
			americanAge = diffNowToBirthYear 		
		}else {
			americanAge = diffNowToBirthYear - 1
		}
	}
	

	
	const answer = `만 ${americanAge}세, 한국나이 ${koreanAge}세`

console.log(answer)

/* 
2020-08-31 00:00:00,2020-08-31 00:00:00
2020-08-30 00:00:00,2020-08-31 00:00:00

1990-01-02 00:00:00,2020-01-01 00:00:00
*/