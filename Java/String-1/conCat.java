/*
 * problem: https://codingbat.com/prob/p132118
 * Given two strings, append them together (known as "concatenation") and return the result.
 * However, if the concatenation creates a double-char, then omit one of the chars,
 */

public String conCat(String a, String b) {
  int lenA = a.length();
  int lenB = b.length();
  
  if (lenA != 0 && lenB != 0) {
    if (a.charAt(lenA - 1) == b.charAt(0)) {
      return a.substring(0, lenA - 1) + b;
    }
  }
  
  return a + b;
}
