function reorderString(str) {
  let uppercaseLetters = "";
  let lowercaseLetters = "";
  let numbers = "";

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
  return uppercaseLetters + lowercaseLetters + numbers;
}

word1 = "hA2p4Py";
word2 = "m11oveMENT";
word3 = "s9hOrt4CAKE";

//TESTS
console.log(reorderString(word1));
console.log(reorderString(word2));
console.log(reorderString(word3));
