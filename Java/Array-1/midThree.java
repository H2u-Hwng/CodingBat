/*
 * problem: https://codingbat.com/prob/p155713
 * Given an array of ints of odd length,
 * return a new array length 3 containing the elements from the middle of the array.
 * The array length will be at least 3.
 */

public int[] midThree(int[] nums) {
  int midIndex = nums.length / 2;
  
  int[] result = new int[3];
  
  result[0] = nums[midIndex - 1];
  result[1] = nums[midIndex];
  result[2] = nums[midIndex + 1];
  
  return result;
}
