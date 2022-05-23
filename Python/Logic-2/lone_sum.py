# problem: https://codingbat.com/prob/p143951
# Given 3 int values, a b c, return their sum. 
# If one of the values is the same as another of the values, it does not count towards the sum.

def lone_sum(a, b, c):
  sum = 0
  if a not in [b, c]: sum += a
  if b not in [a, c]: sum += b
  if c not in [a, b]: sum += c
  
  return sum
