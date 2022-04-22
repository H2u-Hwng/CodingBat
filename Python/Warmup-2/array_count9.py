# problem: https://codingbat.com/prob/p166170
# Given an array of ints, return the number of 9's in the array.

def array_count9(nums):
  return sum(1 for i in nums if i == 9)
