# problem: https://codingbat.com/prob/p194053
# Given 2 strings, a and b, return a string of the form short+long+short.
# The strings will not be the same length, but they may be empty (length 0).

def combo_string(a, b):
  if len(a) > len(b):
    return b + a + b
  
  return a + b + a
