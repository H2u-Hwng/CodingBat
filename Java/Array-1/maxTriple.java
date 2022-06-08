// problem: 
// Given an array of ints of odd length, 
// look at the first, last, and middle values in the array and return the largest.

public int maxTriple(int[] nums) {
  int len = nums.length;
  return Math.max(nums[0], Math.max(nums[len - 1], nums[len / 2]));
}
