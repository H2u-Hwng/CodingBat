/*
 * problem: https://codingbat.com/prob/p142247
 * Given a string, if a length 2 substring appears at both its beginning and end,
 * return a string without the substring at the beginning
 * The substring may overlap with itself, so "Hi" yields "". 
 * Otherwise, return the original string unchanged.
 */

public String without2(String str) {
  int len = str.length();
  
  String result = str;
  
  if (len > 1) {
    if (str.substring(0, 2).equals(str.substring(len - 2))) {
      result = str.substring(2);
    }
  }
  
  return result;
}
