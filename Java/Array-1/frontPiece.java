/*
 * problem: https://codingbat.com/prob/p142455
 * return a new array of its first 2 elements. 
 * If the array is smaller than length 2, use whatever elements are present.
 */

public int[] frontPiece(int[] nums) {
  int len = 2;
  
  if (nums.length < len) {
    len = nums.length;
  }
  
  int[] result = new int[len];
  
  for (int i = 0; i < len; i++) {
    result[i] = nums[i];
  }
  
  return result;
}
