/*
 * problem: https://codingbat.com/prob/p172063
 * Given a string, return a new string made of 3 copies
 * of the first 2 chars of the original string.
 * If there are fewer than 2 chars, use whatever is there.
 */

public String extraFront(String str) {
  if (str.length() < 2) {
    return str + str + str;
  } else {
    String s = str.substring(0, 2);
    return s + s + s;
  }
}
