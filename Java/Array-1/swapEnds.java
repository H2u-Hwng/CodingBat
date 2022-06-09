// problem: https://codingbat.com/prob/p118044
// Given an array of ints, swap the first and last elements in the array.
// Return the modified array.

public int[] swapEnds(int[] nums) {
  int len = nums.length;
  int temp = nums[0];
  nums[0] = nums[len - 1];
  nums[len - 1] = temp;
  return nums;
}
