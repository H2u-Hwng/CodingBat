# problem: https://codingbat.com/prob/p126968
# Return the mean without the largest and smallest values in the array.

def centered_average(nums):
  nums = sorted(nums)
  result = nums[1:-1]
  
  return sum(result) / len(result)
