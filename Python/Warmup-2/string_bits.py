# problem: https://codingbat.com/prob/p113152
# Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".

def string_bits(str):
  
  result = '';
  for i in range(0, len(str), 2):
    result += str[i]
  
  return result
