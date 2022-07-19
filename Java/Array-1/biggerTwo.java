/*
 * problem: https://codingbat.com/prob/p109537
 * Start with 2 int arrays, a and b, each length 2.
 * Consider the sum of the values in each array.
 * Return the array which has the largest sum. In event of a tie, return a.
 */

public int sum(int[] array) {
  int result = 0;
  
  for (int ele: array) {
    result += ele;
  }
  
  return result;
}


public int[] biggerTwo(int[] a, int[] b) {
  int sumA = sum(a);
  int sumB = sum(b);
  
  if (sumB > sumA) {
    return b;
  } else {
    return a;
  }
}
