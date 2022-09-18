/*
 * problem: https://codingbat.com/prob/p183649
 * We have a number of bunnies and each bunny has two big floppy ears.
 * We want to compute the total number of ears across all the bunnies recursively
 */

public int bunnyEars(int bunnies) {
  if (bunnies == 0) {
    return 0;
  } else {
    return bunnyEars(bunnies - 1) + 2;
  }
}
