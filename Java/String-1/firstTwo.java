/*
 * problem: https://codingbat.com/prob/p163411
 * Given a string, return the string made of its first two chars.
 */

public String firstTwo(String str) {
  if (str.length() < 3) {
    return str;
  } else {
    return str.substring(0, 2); 
  }
}
