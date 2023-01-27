function countBoomerangs(array) {
  let counter = 0;
  for (let i = 0; i < array.length; i++) {
    const start = array[i];
    console.log('checking start: ' + start);
    for (let j = 1; j < array.length; j++) {
      const end = array[j];
      console.log('checking end: ' + end);
      if (start === end) {
        console.log('found boomerang!');
        counter++;
        i = j;
        break;
        //array.slice(start, end);
      }
    }
  }
  console.log(counter);
}

function counterBoomerangs2(array){
    let counter = 0;
    for (let i = 0; i < array.length; i++) {
        const element = array[i];
        if(array[i] )
        
    }
}

//test inputs
countBoomerangs([9, 5, 9, 5, 1, 1, 1]); //2
/*countBoomerangs([5, 6, 6, 7, 6, 3, 9]) //1
countBoomerangs([4, 4, 4, 9, 9, 9, 9]) //0
countBoomerangs([1, 7, 1, 7, 1, 7, 1]) //5
countBoomerangs([]) //error
countBoomerangs([1, 7]) //error
countBoomerangs([1, 7, 1, 7, `one`, 7, 1]) //error*/

/*
[3, 7, 3, 2, 1, 5, 1, 2, 2, -2, 2] 
// 3 boomerangs in this sequence:   
[3, 7, 3], [1, 5, 1], [2, -2, 2]
*/
