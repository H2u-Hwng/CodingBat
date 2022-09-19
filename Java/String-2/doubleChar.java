/*
 * problem: https://codingbat.com/prob/p165312
 * Given a string, return a string where for every char in the original, there are two chars.
 */

public String doubleChar(String str) {
  return str.replaceAll(".", "$0$0");
}
