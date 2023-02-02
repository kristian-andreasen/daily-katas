function doubleLetters(string) {
  hasConsecutiveLetters = false;

  for (let i = 0; i < string.length; i++) {
    const element = string[i];
    if (string[i] === string[i + 1]) {
      hasConsecutiveLetters = true;
    }
  }
  console.log(hasConsecutiveLetters);
}

doubleLetters('loop'); //true

doubleLetters('yummy'); //true

doubleLetters('orange'); //false

doubleLetters('munchkin'); //false
