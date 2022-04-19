# problem: https://codingbat.com/prob/p147920
# Return a new string which is 3 copies of the first 3 chars of the string.
# If the string length is less than 3, the front is whatever is there.

def front3(str):
  
  if len(str) < 3:
    return str*3
  
  return str[:3]*3
