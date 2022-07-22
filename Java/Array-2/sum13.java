/*
 * problem: https://codingbat.com/prob/p127384
 * Return the sum of the numbers in the array, returning 0 for an empty array.
 * Except the number 13 is very unlucky, so it does not count and numbers 
 * that come immediately after a 13 also do not count.
 */

public int sum13(int[] nums) {
  int len = nums.length;
  
  if (len == 0) {
    return 0;
  } else {
    int i = 0;
    int sum = 0;
    
    while (i < len) {
      int ele = nums[i];
      
      if (ele == 13) {
        i += 2;
      } else {
        sum += ele;
        i++;
      }
    }
    
    return sum;
  }
}
