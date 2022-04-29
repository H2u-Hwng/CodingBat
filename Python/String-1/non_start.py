# problem: https://codingbat.com/prob/p127703
# Given 2 strings, return their concatenation, except omit the first char of each. 

def non_start(a, b):
  return a[1:] + b[1:]
