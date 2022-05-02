package Codewars

object RemovingElements extends App{
  def removeEveryOther[T](list: List[T]): List[T] = (for (item <- list.indices if item % 2 == 0) yield list(item)).toList
  def removeEveryOther2[T](list: List[T]): List[T] = for ((e, i) <- list.zipWithIndex if i % 2 == 0) yield e

  println(removeEveryOther2(List("Hello", "Goodbye", "Hello Again")))
}
