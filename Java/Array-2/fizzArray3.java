/*
 * problem: https://codingbat.com/prob/p142539
 * Given start and end numbers,
 * return a new array containing the sequence of integers from start up to but not including end.
 */

public int[] fizzArray3(int start, int end) {
  int[] result = new int[end - start];
  
  int index = 0;
  
  for (int value = start; value < end; value ++) {
    result[index] = value;
    
    index++;
  }
  
  return result;
}
