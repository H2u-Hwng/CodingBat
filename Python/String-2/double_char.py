# problem: https://codingbat.com/prob/p170842
# Given a string, return a string where for every char in the original, there are two chars.

def double_char(str):
  return ''.join(c*2 for c in str)
