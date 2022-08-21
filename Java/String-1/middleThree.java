/*
 * problem: https://codingbat.com/prob/p115863
 * Given a string of odd length, return the string length 3 from its middle
 */

public String middleThree(String str) {
  int midIndex = str.length() / 2;
  
  return str.substring(midIndex - 1, midIndex + 2);
}
