// problem: https://codingbat.com/prob/p136585
/*
 * Return the "centered" average of an array of ints
 * The mean average of the values, except ignoring the largest and smallest.
 */

public int centeredAverage(int[] nums) {
  java.util.Arrays.sort(nums);
  
  int len = nums.length;
  
  int sum = 0;
  for (int i = 1; i < len - 1; i++) {
    sum += nums[i];
  }
  
  return sum / (len - 2);
}
