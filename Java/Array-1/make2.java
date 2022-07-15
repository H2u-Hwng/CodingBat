/*
 * problem: https://codingbat.com/prob/p143461
 * Given 2 int arrays, a and b,
 * return a new array length 2 containing, as much as will fit, 
 * the elements from a followed by the elements from b.
 * The arrays may be any length, including 0, 
 * but there will be 2 or more elements available between the 2 arrays.
 */

public int[] make2(int[] a, int[] b) {
  int len = a.length;
  
  int[] result = new int[2];
  
  if (len > 1) {
    result[0] = a[0];
    result[1] = a[1];
  } else if (len == 1) {
    result[0] = a[0];
    result[1] = b[0];
  } else {
    result[0] = b[0];
    result[1] = b[1];
  }
  
  return result;
}
