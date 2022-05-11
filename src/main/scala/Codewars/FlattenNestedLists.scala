package Codewars

object FlattenNestedLists extends App{

  def flatten(l: List[Any]): List[Any] = {
    def _flatten(result: List[Any], remainingList: List[Any]):List[Any] =

      remainingList match {
      // if the remainingList is empty, return the result
      case Nil => result
      //
      case (h:List[_])::Nil => _flatten(result, h)
      case (h:List[_])::tail => _flatten(result:::flatten(h), tail)
      case h::tail => _flatten(result:::List(h), tail)
    }
    _flatten(List(), l)
  }

  println(flatten(List(1,2,3, List(List(3), 4))))

}
