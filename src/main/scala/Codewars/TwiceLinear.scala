package Codewars

import scala.annotation.tailrec

object TwiceLinear extends App{


  // TAIL-RECURSION METHOD

  def dblLinear(n: Int): Int = {
    var (times2Index, times3Index) = (0,0)

    @tailrec
    def step(currentList : Vector[Int]): Int = {

      val next2 = 2 * currentList(times2Index) + 1
      val next3 = 3 * currentList(times3Index) + 1

      if (currentList.length > n) {
        currentList(n)
      } else if (next2 <= next3) {
        times2Index += 1
        step((currentList :+ next2).distinct)
      } else {
        times3Index += 1
        step((currentList :+ next3).distinct)
      }
    }
    step(Vector(1))
  }



//  BEST SOLUTION SO FAR

//  def dblLinear(n: Int): Int = {
//    var currentList = Vector(1)
//    var (times2Index, times3Index) = (0,0)
//
//    while (currentList.length <= n){
//
//      val next2 = 2 * currentList(times2Index) + 1
//      val next3 = 3 * currentList(times3Index) + 1
//
//      if (next2 <= next3) {
//        times2Index += 1
//        currentList = (currentList :+ next2).distinct
//      } else {
//        times3Index += 1
//        currentList = (currentList :+ next3).distinct
//      }
//    }
//    currentList(n)
//  }




  // OTHER SOLUTION

//  def dblLinear(n: Int): Int = {
//
//    var currentList: Vector[Int] = Vector(1)
//    var times2Index = 0;
//    var times3Index = 0;
//
//    while (currentList.length <= n){
//      val next2 = 2 * currentList(times2Index) + 1
//      val next3 = 3 * currentList(times3Index) + 1
//      if (next2 <= next3) {
//        times2Index += 1
//        currentList = (currentList :+ next2).distinct
//      } else {
//        times3Index += 1
//        currentList = (currentList :+ next3).distinct
//      }
//    }
//    currentList(n)
//  }

  println(dblLinear(10))
}
