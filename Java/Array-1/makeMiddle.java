/*
 * problem: https://codingbat.com/prob/p199519
 * Given an array of ints of even length,
 * return a new array length 2 containing the middle two elements from the original array.
 * The original array will be length 2 or more.
 */

public int[] makeMiddle(int[] nums) {
  int midIndex = nums.length / 2;
  
  int[] result = new int[2];
  result[0] = nums[midIndex - 1];
  result[1] = nums[midIndex];
  
  return result;
}
