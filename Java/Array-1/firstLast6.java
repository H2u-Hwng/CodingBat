// problem: https://codingbat.com/prob/p185685
// Given an array of ints, return true if 6 appears as either the first or last element in the array.

public boolean firstLast6(int[] nums) {
  return (nums[0] == 6 || nums[nums.length - 1] == 6);
}
