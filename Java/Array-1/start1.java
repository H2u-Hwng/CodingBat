/*
 * problem: https://codingbat.com/prob/p109660
 * Start with 2 int arrays, a and b, of any length.
 * Return how many of the arrays have 1 as their first element.
 */

public boolean check(int[] array, int num) {
  for (int n: array) {
    if (n == num) {
      return true;
    }
  }
  
  return false;
}


public int start1(int[] a, int[] b) {
  if (check(a, 1) == true && check(b, 1) == true) {
    return 2;
  } else if (check(a, 1) == true || check(b, 1) == true) {
    return 1;
  } else {
    return 0;
  }
}
