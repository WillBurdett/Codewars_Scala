package Codewars

import scala.annotation.tailrec

// In John's car the GPS records every s seconds the distance travelled from an origin (distances are measured in an arbitrary but consistent unit).
// For example, below is part of a record with s = 15:
//
//  x = [0.0, 0.19, 0.5, 0.75, 1.0, 1.25, 1.5, 1.75, 2.0, 2.25]
//  The sections are:
//
//  0.0-0.19, 0.19-0.5, 0.5-0.75, 0.75-1.0, 1.0-1.25, 1.25-1.50, 1.5-1.75, 1.75-2.0, 2.0-2.25
//  We can calculate John's average hourly speed on every section and we get:
//
//  [45.6, 74.4, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0, 60.0]
//  Given s and x the task is to return as an integer the *floor* of the maximum average speed per hour obtained on the sections of x.
//  If x length is less than or equal to 1 return 0 since the car didn't move.
//
//  Example:
//  with the above data your function gps(s, x)should return 74
//
//  Note:
//  With floats it can happen that results depends on the operations order. To calculate hourly speed you can use:
//
//  (3600 * delta_distance) / s.

object SpeedControl extends App {


  // refactored
  def gps(s: Int, x: Array[Double]): Int = {
    @tailrec
    def splitCalculator(index: Int, splits: Array[Double]): Array[Double] = {
      if (index == x.length - 1) splits
      else splitCalculator(index + 1, splits :+ (3600 * math.abs(x(index) - x(index + 1))) / s)
    }

    if (x.length <= 1) 0 else splitCalculator(0, Array()).max.toInt
  }


  // original solution
  def gps2(s: Int, x: Array[Double]): Int = {

    val dub: Double = 3600 / s

    var splits: Array[Double] = Array()

    @tailrec
    def splitCalculator(index: Int): Array[Double] = {
      if (index == x.length - 1) {
        return splits
      }
      splits = splits :+ dub * math.abs(x(index) - x(index + 1))
      splitCalculator(index + 1)
    }

    math.floor(splitCalculator(0).max).toInt
  }

  // user-submitted solution
  def gps3(interval: Int, distances: Array[Double]): Int =
    (distances.sliding(2).collect { case Array(a, b) => b - a }.maxOption.getOrElse(0d) * 3600 / interval).toInt


  println(gps(15, Array(0.0, 0.19, 0.5, 0.75, 1.0, 1.25, 1.5, 1.75, 2.0, 2.25)))

}
