package Codewars

object RomanNumeralsDecoder extends App{

  def decode(roman: String): Int = {
    val map: Map[String, Int] = Map("I" -> 1, "V" -> 5, "X" -> 10, "L" -> 50, "C" -> 100, "D" -> 500, "M" -> 1000)
    val input = roman.split("")
    var index = 0
    var indexAhead = 1
    var sum = 0

    while(index < input.length) {
      if (indexAhead < input.length){
        if (map(input(index)) >= map(input(indexAhead))) {
          sum += map(input(index))
          index += 1
          indexAhead += 1
        } else if (map(input(index)) < map(input(indexAhead))){
          var placeholder = map(input(indexAhead)) - map(input(index))
          sum += placeholder
          index += 2
          indexAhead += 2
        }
      } else {
        sum += map(input(index))
        index += 1
        indexAhead += 1
      }
    }
    sum
  }

  println(decode("IV"))

}
