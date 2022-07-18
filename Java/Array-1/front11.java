/*
 * problem: https://codingbat.com/prob/p128270
 * Given 2 int arrays, a and b, of any length,
 * return a new array with the first element of each array.
 * If either array is length 0, ignore that array.
 */

public int[] front11(int[] a, int[] b) {
  int[] result;
  
  if (a.length != 0 && b.length != 0) {
    result = new int[2];
    result[0] = a[0];
    result[1] = b[0];
  } else if (a.length == 0 && b.length == 0) {
    result = new int[0];
  } else {
    result = new int[1];
    
    if (a.length == 0) {
      result[0] = b[0];
    } else {
      result[0] = a[0];
    }  
  }
  
  return result;
}
