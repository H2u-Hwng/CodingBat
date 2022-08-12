/*
 * problem: https://codingbat.com/prob/p130896
 * Given a string, return a version without the first and last char.
 */

public String withoutEnd(String str) {
  return str.substring(1, str.length() - 1);
}
