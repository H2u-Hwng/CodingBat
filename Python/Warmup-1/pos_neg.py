# problem: https://codingbat.com/prob/p162058

def pos_neg(a, b, negative):
  
  if negative: 
    return a + b < 0
  
  return a * b < 0