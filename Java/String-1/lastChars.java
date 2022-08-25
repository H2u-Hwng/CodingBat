/*
 * problem: https://codingbat.com/prob/p138183
 * Given 2 strings, a and b, return a new string made of the first char of a and the last char of b
 * If either string is length 0, use '@' for its missing char.
 */

public String lastChars(String a, String b) {
  int lenA = a.length();
  int lenB = b.length();
  
  if (lenA == 0 && lenB == 0) {
    return "@@";
  } else if (lenA == 0) {
    return "@" + b.substring(lenB - 1);
  } else if (lenB == 0) {
    return a.substring(0, 1) + "@";
  } else {
    return a.substring(0, 1) + b.substring(lenB - 1);
  }
}
