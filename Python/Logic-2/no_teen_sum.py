# problem: https://codingbat.com/prob/p100347
# Given 3 int values, a b c, return their sum. 
# if any of the values is a teen -- in the range 13..19 inclusive -- then that value counts as 0, 
# except 15 and 16 do not count as a teens.

def fix_teen(num):
  if num in range(13, 15) or num in range(17, 20):
    num = 0
  
  return num

def no_teen_sum(a, b, c):
  result = 0
  for i in [a, b, c]:
    result += fix_teen(i)
  
  return result 
