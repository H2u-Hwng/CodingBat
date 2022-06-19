/*
 * problem: https://codingbat.com/prob/p178353
 * Given a number n, create and return a new string array of length n, 
 * containing the strings "0", "1" "2" .. through n-1.
 */

public String[] fizzArray2(int n) {
  String[] myList = new String[n];
  
  for(int i = 0; i < n; i++) {
    myList[i] = String.valueOf(i);
  }
  
  return myList;
}
