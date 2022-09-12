/*
 * problem: https://codingbat.com/prob/p154669
 * Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1.
 */

public int factorial(int n) {
  if (n == 1) {
    return n;
  }
  
  return n * factorial(n - 1);
}
