//the function takes a string and separates into three different strings
function reorderString(str) {
  let uppercaseLetters = "";
  let lowercaseLetters = "";
  let numbers = "";
  
  //iterate through each charachter in the string
  for (let char of str) {
    if (isNaN(char)) {
      if (char == char.toUpperCase()) {
        uppercaseLetters = uppercaseLetters + char;
      }
    }
    if (isNaN(char)) {
      if (char == char.toLowerCase()) {
        lowercaseLetters = lowercaseLetters + char;
      }
    }
    if (!isNaN(char)) {
      numbers = numbers + char;
    }
  }
  //concatenate the strings, and return it
  return uppercaseLetters + lowercaseLetters + numbers;
}

//Test input strings
word1 = "hA2p4Py";
word2 = "m11oveMENT";
word3 = "s9hOrt4CAKE";

//TESTS
console.log(reorderString(word1));
console.log(reorderString(word2));
console.log(reorderString(word3));
