/*
 * problem: https://codingbat.com/prob/p101230
 * return a new array length 2 containing the first and last elements from the original array.
 */

public int[] makeEnds(int[] nums) {
  int[] result = new int[2];

  result[0] = nums[0];
  result[1] = nums[nums.length - 1];
  
  return result;
}
