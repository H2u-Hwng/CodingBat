/*
 * problem: https://codingbat.com/prob/p186031
 * return true if one of the first 4 elements in the array is a 9.
 */

public boolean arrayFront9(int[] nums) {
  int end = nums.length;
  
  if (end > 4) {
    end = 4;
  }
  
  for (int i = 0; i < end; i++) {
    if (nums[i] == 9) {
      return true;
    }
  }
  
  return false;
}
