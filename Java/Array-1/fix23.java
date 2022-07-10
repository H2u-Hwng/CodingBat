/*
 * problem: https://codingbat.com/prob/p120347
 * Given an int array length 3,
 * if there is a 2 in the array immediately followed by a 3, set the 3 element to 0.
 * Return the changed array.
 */

public int[] fix23(int[] nums) {
  int[] result = new int[3];
  
  for (int i = 0; i < 3; i++) {
    int ele = nums[i];
    result[i] = ele;
    
    if (ele == 2) {
      if (nums[i+1] == 3) {
        result[i+1] = 0;
        i++;
      }
    }
  }
  
  return result;
}
