function howUnlucky(year) {
  let amountOfDays = 0;

  /*const jan = new Date(`January 13, ${year}, 23:15:30`);
  const feb = new Date(`February 13, ${year}, 23:15:30`);
  const mar = new Date(`March 13, ${year}, 23:15:30`);
  const apr = new Date(`April 13, ${year}, 23:15:30`);
  const may = new Date(`May 13, ${year}, 23:15:30`);
  const jun = new Date(`June 13, ${year}, 23:15:30`);
  const jul = new Date(`July 13, ${year}, 23:15:30`);
  const aug = new Date(`August 13, ${year}, 23:15:30`);
  const sep = new Date(`September 13, ${year}, 23:15:30`);
  const oct = new Date(`October 13, ${year}, 23:15:30`);
  const nov = new Date(`November 13, ${year}, 23:15:30`);
  const dec = new Date(`December 13, ${year}, 23:15:30`);*/

  /*if (jan.getDay() == 5) {
    amountOfDays++;
  }
  if (feb.getDay() == 5) {
    amountOfDays++;
  }
  if (mar.getDay() == 5) {
    amountOfDays++;
  }
  if (apr.getDay() == 5) {
    amountOfDays++;
  }
  if (may.getDay() == 5) {
    amountOfDays++;
  }
  if (jun.getDay() == 5) {
    amountOfDays++;
  }
  if (jul.getDay() == 5) {
    amountOfDays++;
  }
  if (aug.getDay() == 5) {
    amountOfDays++;
  }
  if (sep.getDay() == 5) {
    amountOfDays++;
  }
  if (oct.getDay() == 5) {
    amountOfDays++;
  }
  if (nov.getDay() == 5) {
    amountOfDays++;
  }
  if (dec.getDay() == 5) {
    amountOfDays++;
  }*/
}

function howUnlucky2(year) {
  let counter = 0;
  for (let month = 0; i < 12; month++) {
    const date = new Date(year, month, 13);
    if (date.getDay() === 5) {
      counter++;
    }
  }
}

howUnlucky(2020); //2

howUnlucky(2026); //3

howUnlucky(2016); //1
