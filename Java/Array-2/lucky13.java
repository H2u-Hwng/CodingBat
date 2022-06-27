/*
 * problem: https://codingbat.com/prob/p194525
 * Given an array of ints, return true if the array contains no 1's and no 3's.
 */

public boolean notAvailable(int n, int[] nums) {
  for (int num: nums) {
    if (num == n) {
      return false;
    }
  }
  
  return true;
}


public boolean lucky13(int[] nums) {
  return (notAvailable(1, nums) && notAvailable(3, nums));
}
