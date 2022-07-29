/*
 * problem: https://codingbat.com/prob/p100246
 * Given a non-empty array of ints,
 * return a new array containing the elements from the original array
 * that come before the first 4 in the original array.
 * The original array will contain at least one 4. 
 * Note that it is valid in java to create an array of length 0.
 */

public int[] pre4(int[] nums) {
  int len = nums.length;
  int index = 0;
  
  for (int i = 0; i < len; i ++) {
    if (nums[i] == 4) {
      index = i;
      break;
    }
  }
  
  int[] result = new int[index];
  
  for (int i = 0; i < index; i ++) {
    result[i] = nums[i];
  }
  
  return result;
}
