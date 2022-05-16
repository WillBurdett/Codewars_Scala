package Codewars

// Re-write a a Sort method for Integers

object SortMethod extends App {

  def sortIntsLowToHigh(input: List[Int]): List[Int] = {

    var output: List[Int] = List()

    var copyOfInput = input

    while (output.length < input.length){
      val indexOfLowestNum = SortMethod.indexOfLowestNum(copyOfInput)
      output = output :+ copyOfInput(indexOfLowestNum)
      if (indexOfLowestNum == copyOfInput.length - 1 ){
        copyOfInput = copyOfInput.slice(0, copyOfInput.length - 1)
      } else {
        copyOfInput = copyOfInput.slice(0, indexOfLowestNum) ++ copyOfInput.slice(indexOfLowestNum + 1, copyOfInput.length)
      }
    }
    output
  }

 def indexOfLowestNum(arr: List[Int]): Int = {
    var lowestNum: Int = 0
    var lowestNumbersIndex: Int = 0

   for (index <- arr.indices){
     if (index == 0 || arr(index) < lowestNum){
       lowestNum = arr(index)
       lowestNumbersIndex = index
     }
   }
   lowestNumbersIndex
  }





  val exampleListOfInts: List[Int] = List(7, 5, 2, 10, 9, 8, 6, 3, 4, 1)

  println(sortIntsLowToHigh(exampleListOfInts))
}
