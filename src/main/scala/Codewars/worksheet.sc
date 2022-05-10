
object FlattenNestedLists extends App{

  def flatten(input: List[Any]): List[Int] = {
    var mutableList = input

    for (element <- mutableList){
      println(element.getClass)
      if (element.getClass != Int){
        println(element + " is iterable")
      }
    }
    List()
  }

  flatten(List(1,2,3, List(9,9,9)))

}