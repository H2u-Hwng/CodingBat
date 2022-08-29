/*
 * problem: https://codingbat.com/prob/p196652
 * Given a string, return true if the first 2 chars in the string also appear at the end of the string
 */

public boolean frontAgain(String str) {
  int len = str.length();
  
  if (len < 2) {
    return false;
  } else {
    return str.substring(0, 2).equals(str.substring(len - 2));
  }
}
