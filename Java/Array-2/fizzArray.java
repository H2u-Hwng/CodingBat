/*
 * problem: https://codingbat.com/prob/p180920
 * Given a number n,
 * create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1.
 */

public int[] fizzArray(int n) {
  int[] nums = new int[n];
  
  for (int i = 0; i < n; i++) {
    nums[i] = i;
  }
  
  return nums;
}
