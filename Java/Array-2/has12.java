/*
 * problem: https://codingbat.com/prob/p169260
 * Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.
 */

public boolean contains(int[] nums, int num) {
  for (int n: nums) {
    if (n == num) {
      return true;
    }
  }
  
  return false;
}


public boolean has12(int[] nums) {
  return (contains(nums, 1) && nums[nums.length - 1] == 2);
}
