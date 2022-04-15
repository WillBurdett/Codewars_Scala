package Codewars

object MaxLengthDifference extends App {

  def lengthsSorted(words: List[String]): List[Int] = {
    words.map(e => e.length).sorted
  }
  def theDiff(x: List[String], y: List[String]): Int = {
    (lengthsSorted(x)(0) - lengthsSorted(y)(y.length-1)).abs
  }
  def mxdiflg(a1: List[String], a2: List[String]): Int = {
    if (a1 == List() || a2 == List()) return -1
    if (theDiff(a1 , a2) > theDiff(a2, a1)) theDiff(a1 , a2) else theDiff(a2, a1)
  }

  // cdejemeppe's solution!
  def mxdiflg2(a1: List[String], a2: List[String]): Int = {
    val a1L = a1.map(_.length)
    val a2L = a2.map(_.length)

    println(a1L)
    if (a1L.isEmpty || a2L.isEmpty) -1
    else math.max(a1L.max - a2L.min, a2L.max - a1L.min)
  }

  val a1 = List("hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz")
  val a2 = List("cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww")
  println(MaxLengthDifference.mxdiflg2(a1, a2))
}

