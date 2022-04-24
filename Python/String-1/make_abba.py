# problem: https://codingbat.com/prob/p182144
# Given two strings, a and b, return the result of putting them together in the order abba.

def make_abba(a, b):
  return a + b*2 + a
