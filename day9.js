function noStrangers(string) {
  const acquaintances = [];
  const friends = [];
  //remove dots
  const dotsRemoved = string.replaceAll('.', '');

  //separate each word in a single item
  let words = dotsRemoved.split(' ');

  //turn every word to lowercase
  const lowercaseWords = words.map((word) => word.toLowerCase());

  //print sanitized array 
  console.log(lowercaseWords);

  for (const element of lowercaseWords) {
    //console.log(`looking at ${element}`);
    const matchedWord = lowercaseWords.find((word) => word === element);
    console.log(`current item: ${element}. Match: ${matchedWord}`);
    if (matchedWord) {
      if (acquaintances.length < 3) {
        acquaintances.push(matchedWord);
      }
    }
  }
  console.log(acquaintances);
}

let input = 'See Spot run. See Spot jump. Spot likes jumping. See Spot fly.';

noStrangers(input); // [["spot", "see"], []]
