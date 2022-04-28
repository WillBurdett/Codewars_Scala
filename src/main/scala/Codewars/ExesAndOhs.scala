package Codewars

object ExesAndOhs extends App{
  def xo(str: String): Boolean = str.split("").filter(e => e.toLowerCase == "o").size == str.split("").filter(e => e.toLowerCase == "x").size


  def xo2(str: String): Boolean = {
    var ohs = 0
    var exes = 0
    for (letter <- str.split("")){
      if (letter.toLowerCase == "o"){ohs += 1
      } else if (letter.toLowerCase == "x"){exes += 1
      }
    }
    ohs == exes
  }

  def xo3(str: String): Boolean = {
    str.toLowerCase.count(_ == 'x') == str.toLowerCase.count(_ == 'o')
  }

  println(xo3("xxooo"))
}
