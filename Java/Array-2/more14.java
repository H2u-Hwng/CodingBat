/*
 * problem: https://codingbat.com/prob/p104627
 * Given an array of ints,
 * return true if the number of 1's is greater than the number of 4's.
 */

public boolean more14(int[] nums) {
  int count = 0;
  for (int n: nums) {
    if (n == 1) {
      count ++;
    } else if (n == 4) {
      count --;
    }
  }
  
  return (count > 0);
}
