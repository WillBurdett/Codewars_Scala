package Codewars

import scala.annotation.tailrec

object SumOfNumbersBetween extends App{

  def getSumMethod(a: Int, b: Int): Int = {
    (math.min(a, b) to math.max(a, b)).sum
  }

   def getSumWhile(a: Int, b: Int): Int = {
    var min = List(a, b).min
    val max = List(a, b).max

    var sum = min

    while(min != max){
      min+=1
      sum+=min
    }
    sum
  }

  def getSumTailRecursive(a: Int, b: Int): Int = {
    var sum = math.min(a, b)

    @tailrec
    def step(x: Int, y: Int): Unit = {
      if (x != y) {
        sum += x + 1
        step(x + 1, y)
      }
    }
    step(sum, math.max(a, b))
    sum
  }
}
