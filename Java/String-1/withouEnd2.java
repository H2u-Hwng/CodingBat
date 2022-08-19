/*
 * problem: https://codingbat.com/prob/p174254
 * Given a string, return a version without both the first and last char of the string.
 */

public String withouEnd2(String str) {
  int len = str.length();
  
  if (len < 3) {
    return "";
  }
  
  return str.substring(1, len - 1);
}
