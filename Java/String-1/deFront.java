/*
 * problem: https://codingbat.com/prob/p110141
 * Given a string, return a version without the first 2 chars.
 * Except keep the first char if it is 'a' and keep the second char if it is 'b'.
 */

public String deFront(String str) {    
  String result = str.substring(2);
  
  char firstChar = str.charAt(0);
  char secondChar = str.charAt(1);
  
  if (secondChar == 'b') {
    result = "b" + result;
  }
  
  if (firstChar == 'a') {
    result = "a" + result;
  }
  
  return result;
}
