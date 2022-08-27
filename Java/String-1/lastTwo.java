/*
 * problem: https://codingbat.com/prob/p194786
 * Given a string of any length, return a new string
 * where the last 2 chars, if present, are swapped, so "coding" yields "codign".
 */

public String lastTwo(String str) {
  int len = str.length();
  
  if (len < 2) {
    return str;
  } else {
    return str.substring(0, len - 2) + str.substring(len - 1) + 
           str.substring(len - 2, len - 1);
  }
}
