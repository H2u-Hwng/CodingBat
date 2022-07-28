/*
 * problem: https://codingbat.com/prob/p164144
 * Given a non-empty array of ints,
 * return a new array containing the elements from the original array 
 * that come after the last 4 in the original array.
 * The original array will contain at least one 4.
 * Note that it is valid in java to create an array of length 0.
 */

public int[] post4(int[] nums) {
  int len = nums.length;
  int index = 0;
  
  for (int i = len - 1; i > -1; i --) {
    if (nums[i] == 4) {
      index = i;
      break;
    }
  }
  
  int lenResult = len - index - 1;
  int[] result = new int[lenResult];
  
  for (int i = 0; i < lenResult; i ++) {
    index ++;
    result[i] = nums[index];
  }
  
  return result;
}
