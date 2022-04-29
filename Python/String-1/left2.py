# problem: https://codingbat.com/prob/p160545
# Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. 

def left2(str):
  return str[2:] + str[:2]
