/*
 * problem: https://codingbat.com/prob/p112409
 * Given an array of ints length 3,
 * return a new array with the elements in reverse order
 */

public int[] reverse3(int[] nums) {
  int len = nums.length;
  
  int temp = nums[0];
  nums[0] = nums[len - 1];
  nums[len - 1] = temp;
  
  return nums;
}
