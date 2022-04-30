# problem: https://codingbat.com/prob/p186048
# Return the number of times that the string "code" appears anywhere in the given string.
# Except we'll accept any letter for the 'd', so "cope" and "cooe" count.

def count_code(str):
  letters = 'abcdefghijklmnopqrstuvwxyz'
  count = 0
  for char in letters:
    test = 'co' + char + 'e'
    count += str.count(test)
  
  return count
