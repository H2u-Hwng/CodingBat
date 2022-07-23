/*
 * problem: https://codingbat.com/prob/p136254
 * Given arrays nums1 and nums2 of the same length, or every element in nums1,
 * consider the corresponding element in nums2 (at the same index).
 * Return the count of the number of times that the two elements differ by 2 or less, but are not equal.
 */

public int matchUp(int[] nums1, int[] nums2) {
  int count = 0;
  int i = 0;
  
  while (i < nums1.length) {
    int differ = Math.abs(nums1[i] - nums2[i]);
    
    if (differ > 0 && differ < 3) {
      count ++;
    }
    
    i ++;
  }
  
  return count;
}
