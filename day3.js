function bestFriend(str, letter1, letter2) {
  console.log(`does ${letter2} always appear after ${letter1}?`);
  try {
    for (let i = 0; i < str.length - 1; i++) {
      //logging to console for debugging
      console.log(`${i}: letter1: ${str[i]} letter2: ${str[i + 1]}`);
      console.log(`[${str[i]}] + [${str[i + 1]}]`);

      if (str[i] === letter1 && str[i + 1] !== letter2) {
        console.log(`FOUND EXCEPTION: ${str[i]}+${str[i + 1]}`);
        console.log(
          `${letter2} doesn't always appear immediately before ${letter1}`
        );
        return false;
      }
    }
    return true;
  } catch (error) {
    return 'something went wrong';
  }
}

//given test inputs
//console.log(bestFriend('he headed to the store', 'h', 'e')); //true
//console.log(bestFriend('i found an ounce with my hound', 'o', 'u')); //true
//console.log(bestFriend('we found your dynamite', 'd', 'y')); //false

//extra test inputs
console.log(bestFriend(''), 'h', 'e');
console.log(bestFriend(1), 'h', 'e');

//always returns true because it just needs to be true once
/*if (str[i] === letter1 && str[i + 1] === letter2) {
      return true;
    }*/
