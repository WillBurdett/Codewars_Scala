package Codewars

object DeodorantEvaporator extends App {
    def evaporator(content: Double, evapPerDay: Int, threshold: Int): Int = {
    if (content == 0 || evapPerDay == 0 || threshold == 0) return 0
    var days = 0
    var quantityRemaining = 100.0
    while (quantityRemaining > threshold){
      quantityRemaining = quantityRemaining - quantityRemaining * evapPerDay/100
      days = days + 1
    }
    days
  }
  println(evaporator(10,10,10))
}
