# problem: https://codingbat.com/prob/p129125
# If either of you is very stylish, 8 or more, then the result is 2 (yes)
# With the exception that if either of you has style of 2 or less, then the result is 0 (no)
# Otherwise the result is 1 (maybe).

def date_fashion(you, date):
  if you <= 2 or date <= 2:
    return 0
  elif you >= 8 or date >= 8:
    return 2
  else: 
    return 1
