package Codewars

object EvenOrOdd extends App {

    def evenOrOdd(number: Int): String = {
        // your code here
        if (number%2==0)"Even" else "Odd"
    }
    println(evenOrOdd(2));
}
