// problem: https://codingbat.com/prob/p196640
// Given an array length 1 or more of ints, 
// return the difference between the largest and smallest values in the array.

public int findMax(int[] nums) {
  int max = Integer.MIN_VALUE;
  for (int n : nums) {
    if (n > max) {
      max = n;
    }
  }
  
  return max;
}


public int findMin(int[] nums) {
  int min = Integer.MAX_VALUE;
  for (int n : nums) {
    if (n < min) {
      min = n;
    }
  }
  
  return min;
}


public int bigDiff(int[] nums) {
  return findMax(nums) - findMin(nums);
}
