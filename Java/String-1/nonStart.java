/*
 * problem: https://codingbat.com/prob/p143825
 * Given 2 strings, return their concatenation, except omit the first char of each.
 */

public String nonStart(String a, String b) {
  return a.substring(1) + b.substring(1);
}
