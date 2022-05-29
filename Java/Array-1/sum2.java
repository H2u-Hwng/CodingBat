// problem: https://codingbat.com/prob/p190968
// Given an array of ints, return the sum of the first 2 elements in the array.

public int sum2(int[] nums) {
  int result = 0;
  int end = 2;
  
  if (nums.length < end) {
    end = nums.length;
  }
  
  for(int i = 0; i < end; i++) {
    result += nums[i];
  }
  
  return result;
}
