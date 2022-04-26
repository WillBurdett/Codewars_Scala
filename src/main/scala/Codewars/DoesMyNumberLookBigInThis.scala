package Codewars

//  A Narcissistic Number is a positive number which is the sum of its own digits,
//  each raised to the power of the number of digits in a given base.
//  In this Kata, we will restrict ourselves to decimal (base 10).
//
//  For example, take 153 (3 digits), which is narcisstic:
//  1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
//
//  and 1652 (4 digits), which isn't:
//  1^4 + 6^4 + 5^4 + 2^4 = 1 + 1296 + 625 + 16 = 1938

object DoesMyNumberLookBigInThis extends App{
  def narcissistic(n: Int): Boolean = {
    val nArr = n.toString.split("")
    nArr.map(e => math.pow(e.toDouble, nArr.length)).sum.toInt == n
  }

  // user-submitted solution!
  def narcissistic2(n: Int): Boolean =
    n == n.toString.map(i => math.pow(i.asDigit, n.toString.size)).sum

  println(narcissistic(1938))
  println(narcissistic2(1938))
}
