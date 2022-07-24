/*
 * problem: https://codingbat.com/prob/p168357
 * Given an array of ints,
 * return true if the array contains two 7's next to each other,
 * or there are two 7's separated by one element, such as with {7, 1, 7}.
 */

public boolean has77(int[] nums) {
  int len = nums.length;
  
  if (len < 2) {
    return false;
  } 
  
  if (len < 3) {
    return (nums[0] == 7 && nums[1] == 7);
  }  

  for (int i = 0; i < nums.length - 2; i ++) {
    if (nums[i] == 7) {
      if (nums[i+1] == 7 || nums[i+2] == 7) {
        return true;
      }
    }
  }
  
  if (nums[len - 1] == 7) {
    return (nums[len - 2] == 7 || nums[len - 3] == 7);
  }
  
  return false;
}
