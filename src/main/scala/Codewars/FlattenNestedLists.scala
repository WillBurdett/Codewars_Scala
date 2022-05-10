package Codewars

object FlattenNestedLists extends App{

  def flatten(input: List[Any]): List[Int] = {
    var mutableList = input

    for (element <- mutableList){
      element match {
        case _: Integer => println("Integer")
        case _: Seq[Int] => println("Sequence of Ints")
        case _: Seq[Any] => println("Sequence of anything")
      }
      if (element.isInstanceOf[Seq[Any]]){
        println(element + " is iterable")
      }
    }
    List()
  }

  flatten(List(1,2,3, List(9,9,9)))

}
