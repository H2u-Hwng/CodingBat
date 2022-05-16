# problem: https://codingbat.com/prob/p135815
# Squirrels play if the temperature is between 60 and 90 (inclusive).
# Unless it is summer, then the upper limit is 100 instead of 90. 
# return True if the squirrels play and False otherwise.

def squirrel_play(temp, is_summer):
  if is_summer:
    return temp in range(60, 101)
  
  return temp in range(60, 91)
