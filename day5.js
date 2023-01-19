function numInStr(strArray) {
  result = [];
  for (let item of strArray) {
    //console.log(item);
    for (let char of item) {
      parseInt(char);
      //console.log(char);

      if (!isNaN(char) && char !== " ") {
        result.push(char);
      }
    }
  }
  return result;
}

//test inputs
console.log(numInStr(['la', '2b', 'b'])); //["la", "2b"]
console.log(numInStr(['abc', 'abc10'])); //["abc10"]
console.log(numInStr(['abc', 'ab10c', 'a10bc', 'bcd'])); //["ab10c", "a10bc"]
console.log(numInStr(['this is a test', 'test1'])); //["test1"] 
console.log(numInStr(["who needs numbers", "not me"])); //[]
console.log(numInStr(["!!", "##", "@"])); //[]
