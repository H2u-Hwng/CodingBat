// problem: https://codingbat.com/prob/p187868
// We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.

public boolean sleepIn(boolean weekday, boolean vacation) {
  return (!weekday || vacation);
}
