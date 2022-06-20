/*
 * problem: https://codingbat.com/prob/p136648
 * Given an array of ints, return true if it contains no 1's or it contains no 4's.
 */

public boolean contains(int[] nums, int num) {
  for (int n: nums) {
    if (n == num) {
      return false;
    }
  }
  
  return true;
}


public boolean no14(int[] nums) {
  return contains(nums, 1) || contains(nums, 4);
}
