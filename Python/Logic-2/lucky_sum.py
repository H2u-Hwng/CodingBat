# problem: https://codingbat.com/prob/p107863
# Given 3 int values, a b c, return their sum.
# if one of the values is 13 then it does not count towards the sum and values to its right do not count. 

def lucky_sum(a, b, c):
  result = a + b + c
  if a == 13:
    result = 0
  elif b == 13:
    result = a
  elif c == 13:
    result -= c
  
  return result
