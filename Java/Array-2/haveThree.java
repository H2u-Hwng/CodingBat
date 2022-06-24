/*
 * problem: https://codingbat.com/prob/p109783
 * Given an array of ints,
 * return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.
 */

public int count(int[] nums, int num) {
  int result = 0;
  for (int n: nums) {
    if (n == num) {
      result++;
    }
  }
  
  return result;
}


public boolean haveThree(int[] nums) {
  if (count(nums, 3) == 3) {
    for (int i = 0; i < nums.length - 4; i++) {
      if (nums[i] == 3 && nums[i+2] == 3 && nums[i+4] == 3) {
        return true;
      }
    }
  }
  
  return false;
}
