Kata 1:
Positive Dominant
An array is positive dominant if it contains strictly more unique positive values than unique negative values. Write a function that returns true if an array is positive dominant, false, otherwise.
Examples
isPositiveDominant([1, 1, 1, 1, -3, -4]) ➞ false
// There is only 1 unique positive value (1).
// There are 2 unique negative values (-3, -4).

isPositiveDominant([5, 99, 832, -3, -4]) ➞ true

isPositiveDominant([5, 0]) ➞ true

isPositiveDominant([0, -4, -1]) ➞ false
Notes
0 counts as neither a positive nor a negative value.
Kata 2: (OPTIONAL)
The Centrifuge Problem
A centrifuge, as you probably know, is a laboratory device used to separate fluids based on density. The separation is achieved through centripetal force by spinning a collection of test tubes at high speeds. This means, the configuration needs to be in balance.
Create a function that takes two numbers as arguments n and k and returns true if the configuration is balanced and false if it's not.
Examples
cFuge(6, 4) ➞ true

cFuge(2, 1) ➞ false

cFuge(3, 3) ➞ true
Notes
One test tube k = 1 is never in balance.
One hole n = 1 is never in balance, even empty.
You can google for an solution (not a code!) on how to solve this.
Here are the valid configurations for n = 6, k = 2, 3, 4 and 6:

![image](https://user-images.githubusercontent.com/122425845/220858229-86b33c74-9e3a-43ff-af72-76ae548e1b5a.png)
