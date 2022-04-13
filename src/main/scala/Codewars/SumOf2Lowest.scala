package Codewars

object SumOf2Lowest extends App {

  def sumTwoSmallest(numbers: List[Int]): Int = numbers.sorted.slice(0,2).sum

  sumTwoSmallest(List(2, 3, 1, 0))
}
