package Codewars

object NumOfDivisors extends App{
  def divisors(n: Int): Int = {
    var count: Int = 1
    var divisorList: List[Int] = List()

    while (count <= n){
      if (n % count == 0) divisorList = divisorList :+ n
      count += 1
    }
    divisorList.length
  }

  // Other user's solution
  def divisors2(n: Int): Int = (1 to n).count(n % _ == 0)
  println(divisors2(10))

  println((1 to 10).count(_ > 0))
}
