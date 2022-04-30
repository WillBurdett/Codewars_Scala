package Codewars

import scala.collection.mutable.ListBuffer

object FindTheSmallest extends App {
  def smallest(n: Long): Array[Long] = {

    var smallestNum: Long = n
    var previousIndex: Long = 0
    var betterIndex: Long = 0

    val inputArr = n.toString.split("").map(e => e.toLong)
    for (initialIndex <- inputArr.indices){
      for (newIndex <- inputArr.indices){
        if (calc(inputArr, initialIndex, newIndex) < smallestNum) {
          smallestNum = calc(inputArr, initialIndex, newIndex)
          previousIndex = initialIndex
          betterIndex = newIndex
        }
      }
    }
    println( Array(smallestNum, previousIndex, betterIndex).mkString(", "))
    Array(smallestNum, previousIndex, betterIndex)
  }

  def calc(array: Array[Long], current: Int, test: Int): Long = {

    val (left, right) = array.mkString("")
      .split("")
      .updated(current, "")
      .mkString("")
      .split("")
      .map(e => e.toLong)
      .toVector
      .splitAt(test)

    (left ++ Vector(array(current)) ++ right).mkString("").toLong
  }
  println(smallest(256687587015L))

  // highly complicated user-submitted solution!!

  def smallestNum(n: Long): Array[Long] =
    (for {
      i <- 0 until s"$n".size
      j <- 0 until s"$n".size
      if i != j
    } yield Array(s"$n".patch(j, Nil, 1).patch(i, Seq(s"$n"(j)), 0).toLong, j, i))
      .minBy { case Array(s, i, j) => (s, i) }

}