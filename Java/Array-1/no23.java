/*
 * problem: https://codingbat.com/prob/p175689
 * Given an int array length 2, return true if it does not contain a 2 or 3.
 */

public boolean no23(int[] nums) {
  for (int n: nums) {
    if (n == 2 || n == 3) {
      return false;
    }
  } 
  
  return true;
}
