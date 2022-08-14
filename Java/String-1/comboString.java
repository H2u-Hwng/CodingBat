/*
 * problem: https://codingbat.com/prob/p168564
 * Given 2 strings, a and b, return a string of the form short+long+short.
 */

public String comboString(String a, String b) {
  if (a.length() < b.length()) {
    return a + b + a;
  } else {
    return b + a + b;
  }
}
