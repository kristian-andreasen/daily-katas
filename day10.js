function clockwiseCipher(message) {
  const eMessage = '';
  square = [[], [], [], []];
  for (const row of square) {
    //logging for debugging
    console.log(row);
    for (const letter of row) {
      if (!row[0]) {
        row.push(message[0]);
      }
    }
  }
}

message = 'Mubashir Hassan';

clockwiseCipher(message); //"Ms ussahr nHaaib"

//eMessage = "Ms ussahr nHaaib"
