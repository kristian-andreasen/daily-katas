function happyAlgorithm(num) {
  let counter = 1;
  console.log(`step ${counter}: Transform ${num}`);

  const exponent = 2;
  const squaredNumList = [];

  let digits = num.toString().split('');
  let realDigits = digits.map(Number);

  for (const digit of realDigits) {
    let squaredNum = Math.pow(digit, exponent);
    squaredNumList.push(squaredNum);
  }

  console.log(squaredNumList);
  const sum = squaredNumList.reduce((partialSum, a) => partialSum + a, 0);
  if (sum !== 1) {
    happyAlgorithm(sum);
  } else {
    console.log(`HAPPY ${counter}`);
  }
}

//test inputs - SAD numbers result in infinite loops
happyAlgorithm(139); //"HAPPY 5"
//happyAlgorithm(67) //SAD 10"
happyAlgorithm(1) //HAPPY 1
//happyAlgorithm(89) //SAD 8
