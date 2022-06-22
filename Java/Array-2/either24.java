/*
 * problem: https://codingbat.com/prob/p191878
 * Given an array of ints, return true if the array contains a 2 
 * next to a 2 or a 4 next to a 4, but not both.
 */

public boolean isAvailable(int[] nums, int num) {
  for (int i = 0; i < nums.length - 1; i++) {
    if (nums[i] == nums[i + 1] && nums[i] == num) {
      return true;
    }
  }
  
  return false;
}


public boolean either24(int[] nums) {
  return (isAvailable(nums, 2) != isAvailable(nums, 4));
}
