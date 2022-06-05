// problem: https://codingbat.com/prob/p146256
// Given an array of ints length 3
// Figure out which is larger, the first or last element in the array, 
// and set all the other elements to be that value.

public int[] maxEnd3(int[] nums) {
  int max = Math.max(nums[0], nums[2]);
  int[] newList = {max, max, max};
  return newList;
}
