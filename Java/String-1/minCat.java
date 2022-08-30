/*
 * problem: https://codingbat.com/prob/p105745
 * Given two strings, append them together (known as "concatenation") and return the result.
 * However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string.
 */

public String minCat(String a, String b) {
  int lenA = a.length();
  int lenB = b.length();
  
  if (lenA > lenB) {
    return a.substring(lenA - lenB) + b;
  } else {
    return a + b.substring(lenB - lenA);
  }
}
