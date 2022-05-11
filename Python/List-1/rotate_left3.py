# problem: https://codingbat.com/prob/p148661
# Given an array of ints length 3, return an array with the elements "rotated left"

def rotate_left3(nums):
  return [nums[(i + 1) % len(nums)] for i, x in enumerate(nums)]
