# problem: https://codingbat.com/prob/p165097
# Given a string and a non-negative int n. Return n copies of the front.
# The front of the string is the first 3 chars, or whatever is there if the string is less than length 3.

def front_times(str, n):
  
  if len(str) < 3:
    return str*n
  
  return str[:3]*n
