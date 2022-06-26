/*
 * problem: https://codingbat.com/prob/p105031
 * Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}.
 */

public int[] shiftLeft(int[] nums) {
  int len = nums.length;
  
  if (len != 0) {
    int temp = nums[0];
    
    for (int i = 1; i < len; i++) {
      nums[i-1] = nums[i];
    }
    
    nums[len-1] = temp;
  }
  
  return nums;
}
