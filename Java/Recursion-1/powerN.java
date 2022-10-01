/*
 * problem: https://codingbat.com/prob/p158888
 * Given base and n that are both 1 or more,
 * compute recursively (no loops) the value of base to the n power.
 */

public int powerN(int base, int n) {
  if (n == 0) { // Base case
    return 1;
  } else {
    return base * powerN(base, n - 1);
  }
}
