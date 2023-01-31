vowels = ['a', 'e', 'i', 'o', 'u'];

function pigLatinSentence(sentence) {
  //separate each word in the sentence into single item
  let words = sentence.split(' ');
  //console.log(words);
  let result = '';

  for (const word of words) {
    //check if first char of the word item starts with a vowel
    if (vowels.find((vowel) => vowel === word[0])) {
      result += word + 'way';
    } else {
      for (const char of word) {
        if (vowels.includes(char)) {
          break;
        } else {
          word.replace(char, '');
          word.concat(char);
          word.concat('ay');
        }
      }
      result += word;
    }
  }
  console.log(result);
}

pigLatinSentence('this is pig latin'); //"isthay isway igpay atinlay"

//pigLatinSentence('wall street journal'); //"allway eetstray ournaljay"

//pigLatinSentence('raise the bridge'); //"aiseray ethay idgebray"

//pigLatinSentence('all pigs oink'); //"allway igspay oinkway"
