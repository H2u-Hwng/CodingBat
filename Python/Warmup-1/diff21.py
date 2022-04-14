# problem: https://codingbat.com/prob/p197466

def diff21(n):
  diff = 21 - n
  
  if diff < 0: diff *= -2
  
  return diff
