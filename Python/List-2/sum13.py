#
# problem: https://codingbat.com/prob/p167025
# Return the sum of the numbers in the array,
# Except the number 13 is very unlucky, so it does not count and numbers
# that come immediately after a 13 also do not count.
#

def sum13(nums):
  i = 0
  sum = 0
  
  while (i < len(nums)):
    ele = nums[i]
    
    if ele == 13:
      i += 2
      continue
    
    sum += ele
    i += 1
    
  return sum
