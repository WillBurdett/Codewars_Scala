package Codewars

object VowelCount extends App{
  def getCount(inputStr: String): Int = {
    // your code here
    val vowels = Array("a", "e", "i", "o", "u")

    // use this to print strings - same as 'join' in java
    // println(vowels.mkString(" "))

    // split is just like in java
    var inputArr = inputStr.split("")

    var count = 0;
    for (letter <- inputArr){
      for (v <- vowels){
        if (letter == v) count+=1
      }
    }
    println(count)
    count
  }

  getCount("yes")
}
