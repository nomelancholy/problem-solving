function getMaskedName(name) {
	// 함수를 작성해주세요
	
	let nameCharacterArray = name.split('')
	
	nameCharacterArray = nameCharacterArray.map((character, index) => {
		if(index >= 2){
			return '*'
		}
		return character
	})

	name = nameCharacterArray.join('')
	
	return name;
}
