package Codewars

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

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



  def alternateInsertionSort(arr: mutable.ListBuffer[Int]): mutable.ListBuffer[Int] = {

    var index = 1 // we assume the first element is where its supposed to be, so we start by comparing the second element
    while (index < arr.length){
      val current = arr(index) // the element we are trying to figure out where it goes
      var j = index - 1; // j starts on previous element


      // if this is true we need to shift this item to the right.
      // note: j will be -1 if the element is to be moved the beginning of the array, so we need this stopping condition
      while( j >= 0 && arr(j) > current){

        arr(j + 1) = arr(j) // copy the previous element to the right hand side
        j -= 1; // we decrement j so each of the greater items are shifted to the right
      }
      // the current index we're looking at is set to the initial value we were comparing everything to
      arr(j + 1) = current
      println(arr)
      index+=1
    }
    arr
  }


  def insertionSortByMemory(inputList: ListBuffer[Int]): ListBuffer[Int] = {

    var index = 1

    while (index < inputList.length){
      val current = inputList(index)
      var j = index - 1

      while (j >= 0 && current < inputList(j)){
        inputList(j + 1) = inputList(j)
        j -= 1
      }
      inputList(j + 1) = current
      index+=1
    }
    inputList
  }





  val exampleListOfInts: List[Int] = List(7, 5, 2, 10, 9, 8, 6, 3, 4, 1)
  val exampleListBufferOfInts: mutable.ListBuffer[Int] = ListBuffer(7, 5, 2, 10, 9, 8, 6, 3, 4, 1)
  val secondExampleListBufferOfInts: mutable.ListBuffer[Int] = ListBuffer(7, 5, 2, 10, 9, 8, 6, 3, 4, 1)

  // println(sortIntsLowToHigh(exampleListOfInts))
  println(alternateInsertionSort(exampleListBufferOfInts))
  println("---------------")
  println(insertionSortByMemory(secondExampleListBufferOfInts))
}
