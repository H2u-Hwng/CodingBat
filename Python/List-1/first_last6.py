# problem: https://codingbat.com/prob/p181624
# Given an array of ints, 
# return True if 6 appears as either the first or last element in the array.

def first_last6(nums):
  return nums[0] == 6 or nums[-1] == 6
