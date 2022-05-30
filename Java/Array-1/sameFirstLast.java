// https://codingbat.com/prob/p118976
// Given an array of ints
// return true if the array is length 1 or more, and the first element and the last element are equal.

public boolean sameFirstLast(int[] nums) {
  int len = nums.length;
  return (len >= 1 && nums[0] == nums[len - 1]);
}
