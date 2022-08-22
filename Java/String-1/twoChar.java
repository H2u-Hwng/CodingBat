/*
 * problem: https://codingbat.com/prob/p144623
 * Given a string and an index, return a string length 2 starting at the given index.
 * If the index is too big or too small to define a string length 2, use the first 2 chars.
 */

public String twoChar(String str, int index) {
  if (index < 0 || index > str.length() - 2) {
    return str.substring(0, 2);
  }
  
  return str.substring(index, index + 2);
}
