/*
 * problem: https://codingbat.com/prob/p103895
 * Given a string, return true if it ends in "ly".
 */

public boolean endsLy(String str) {
  int len = str.length();
  
  if (len < 2) {
    return false;
  }
  
  return (str.substring(len - 2).equals("ly"));
}
