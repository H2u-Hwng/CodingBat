/*
 * problem: https://codingbat.com/prob/p185139
 * Given an array of ints length 3,
 * return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
 */

public int[] rotateLeft3(int[] nums) {
  int len = nums.length;
  
  int temp = nums[0];
  
  for (int i = 0; i < len - 1; i++) {
    nums[i] = nums[i + 1];
  }
  
  nums[len - 1] = temp;
  
  return nums;
}
