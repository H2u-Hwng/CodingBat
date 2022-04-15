# problem: https://codingbat.com/prob/p166884

def parrot_trouble(talking, hour):
  return talking and hour not in range(7, 21)
