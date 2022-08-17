/*
 * problem: https://codingbat.com/prob/p130781
 * Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
 */

public String right2(String str) {
  int len = str.length();
  
  return str.substring(len - 2) + str.substring(0, len - 2);
}
