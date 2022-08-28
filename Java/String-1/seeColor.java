/*
 * problem: https://codingbat.com/prob/p199216
 * Given a string, if the string begins with "red" or "blue" 
 * return that color string, otherwise return the empty string.
 */

public String seeColor(String str) {
  int len = str.length();
  
  if (len > 3 && str.substring(0, 4).equals("blue")) {
    return str.substring(0, 4);
  } else if (len > 2 && str.substring(0, 3).equals("red")) {
    return str.substring(0, 3);
  } else {
    return "";
  }
}
