function getLength(arr) {
  let totalItems = arr.flat(Infinity).length;
  return totalItems;
}

//tests
const arr1 = [1, [2, 3]];
const totalItems1 = getLength(arr1); // 3
console.log(totalItems1);

const arr2 = [1, [2, [3, 4]]];
const totalItems2 = getLength(arr2); // 4
console.log(totalItems2);

const arr3 = [1, [2, [3, [4, [5, 6]]]]];
const totalItems3 = getLength(arr3); // 6
console.log(totalItems3);

const arr4 = [1, [2], 1, [2], 1];
const totalItems4 = getLength(arr4); // 5
console.log(totalItems4);
