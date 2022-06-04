// problem: https://codingbat.com/prob/p145365
// Given an int array, return true if the array contains 2 twice, or 3 twice.

public int counting(int x, int[] nums) {
  int count = 0;
  
  for (int n: nums) {
    if (n == x) count++;
  }
  
  return count;
}

public boolean double23(int[] nums) {
  return (counting(2, nums) == 2 || counting(3, nums) == 2);
}
