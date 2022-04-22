package Codewars

import scala.annotation.tailrec

object RectangleIntoSquares extends App {
  def sqInRect(min: Int, max: Int): Array[Int] = {

    if (min == max) return Array()

    @tailrec
    def recursionAttempt(x: Int, y: Int, result: Array[Int]): Array[Int] = {
      if (x == 0 || y == 0) {
        result
      } else {
        if (y >= x) {
          val tempList = result :+ x
          recursionAttempt(x, y - x, tempList)
        } else {
          val tempList = result :+ y
          recursionAttempt(x - y, y, tempList)
        }
      }
    }
    recursionAttempt(min, max, Array())
  }
 println(sqInRect(3, 5).toList)
}
