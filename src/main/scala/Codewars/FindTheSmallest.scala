package Codewars

object FindTheSmallest extends App {
  def smallest(n: Long): Array[Long] = {
    // your code
    // find min of number in int array and save index of first one
    // turn int into string and replace first "lowest number" with ""
    // prepend string with the lowest num
    // val small = string.toInt
    // (small, 0, saved index)
    ???
  }
}

















//  def smallest(n: Long): Array[Long] = {
//    val inputArr = n.toString.split("").map(e => e.toInt)
//    println(inputArr.mkString(" "))
//
//    // save the smallest number data here:
//    // - (the number, the index that number was initially, the index you moved it too)
//    var data: (Long, Long, Long) = (n,0,0)
//
//    for (currentIndex <- inputArr.indices){
//      for (testIndex <- inputArr.indices){
//        if (calculate(inputArr, currentIndex, testIndex) < data._1){
//          data = (calculate(inputArr, currentIndex, testIndex), currentIndex, testIndex)
//          println(data)
//        }
//      }
//    }
//    println( Array(data._1, data._2, data._3).mkString(" "))
//    Array(data._1, data._2, data._3)
//  }
//  def calculate(arr: Array[Int], curr: Int, test: Int): Int = {
//    var altered: Array[String] = Array()
//    for (index <- arr){
//      if (index == test){
//        altered = altered :+ arr(test).toString
//      } else if (index != curr){
//        altered = altered :+ arr(index).toString
//      }
//    }
//    altered.mkString("").toInt
//  }
//  println(smallest(1234))
//}
