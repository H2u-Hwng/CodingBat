/*
 * problem: https://codingbat.com/prob/p137729
 * Given a string of even length, return a string made of the middle two char.
 */

public String middleTwo(String str) {
  int len = str.length();
  
  return str.substring(len / 2 - 1, len / 2 + 1);
}
