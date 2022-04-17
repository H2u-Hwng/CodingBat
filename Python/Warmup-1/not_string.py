# problem: https://codingbat.com/prob/p189441

def not_string(str):
  
  if len(str) >= 3 and str[:3] == 'not':
    return str
  
  return 'not ' + str