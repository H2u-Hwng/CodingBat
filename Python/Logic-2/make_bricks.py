# problem: https://codingbat.com/prob/p118406
# We have a number of small bricks (1 inch each) and big bricks (5 inches each).
# Return True if it is possible to make the goal by choosing from the given bricks.

def make_bricks(small, big, goal):
  for _ in range(big):
    if goal >= 5:
      goal -= 5
  
  return small >= goal
