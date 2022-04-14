# problem: https://codingbat.com/prob/p141905

def sum_double(a, b):
  # Store the sum in a local variable
  sum = a + b
  
  # Double it if a and b are the same
  if a == b:
    sum *= 2
    
  return sum
