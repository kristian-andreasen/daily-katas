function replaceVowel(string) {
  let input = string.toLowerCase();
  let result = '';

  for (let i = 0; i < input.length; i++) {
    let currentChar = input[i];
    let temp;
    //console.log(currentChar);
    if (currentChar === 'a') {
      temp = '1';
      currentChar = temp;
    }

    if (currentChar === 'e') {
      temp = '2';
      currentChar = temp;
    }
    if (currentChar === 'i') {
      temp = '3';
      currentChar = temp;
    }
    if (currentChar === 'o') {
      temp = '4';
      currentChar = temp;
    }
    if (currentChar === 'u') {
      temp = '5';
      currentChar = temp;
    }
    result += currentChar;
  }
  return result;
}

//test inputs
console.log(replaceVowel('karAchi')); //"k1r1ch3"
console.log(replaceVowel('chEmBur'));  //"ch2mb5r"
console.log(replaceVowel('khandbari'));  //"kh1ndb1r3"
console.log(replaceVowel('LexiCAl'));  //"l2x3c1l"
console.log(replaceVowel('fuNctionS')); //"f5nct34ns"
console.log(replaceVowel('EASY')); //"21sy"*/
