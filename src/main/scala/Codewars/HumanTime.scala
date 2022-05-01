package Codewars

object HumanTime extends App{

  def formatDuration(seconds: Int): String = {

    var remain: Double = seconds

    val year = math.floor(remain / 31_536_000).toInt
    remain = remain % 31_536_000

    val day = math.floor(remain / 86400).toInt
    remain = remain % 86400

    val hour = math.floor(remain / 3600).toInt
    remain = remain % 3600

    val min = math.floor(remain / 60).toInt
    remain =  remain % 60

    val pairs: Array[(Int, String)] = Array(
        (year, if (year == 1) " year" else " years"),
        (day, if (day == 1) " day" else " days"),
        (hour, if (hour == 1) " hour" else " hours"),
        (min, if (min == 1) " minute" else " minutes"),
        (remain.toInt, if (remain == 1) " second" else " seconds")
      ).filter(e => e._1 != 0)

    var result = ""
    for (el <- pairs.indices){
      if (pairs(el)._1 != 0){
        result += pairs(el)._1 + pairs(el)._2
        if (el < pairs.length - 2){
          result += ", "
        } else if (el == pairs.length - 2){
          result += " and "
        }
      }
    }
    if (result == "") "now" else result
  }


  println(formatDuration(239935673))


  // ORIGINAL SOLUTION!

  //    if (seconds == 0) return "now"
  //
  //    var remain: Double = seconds
  //    val year = math.floor(remain / 31_536_000).toInt
  //    remain = remain % 31_536_000
  //
  //    val day = math.floor(remain / 86400).toInt
  //    remain = remain % 86400
  //
  //    val hour = math.floor(remain / 3600).toInt
  //    remain = remain % 3600
  //
  //    val min = math.floor(remain / 60).toInt
  //    remain =  remain % 60
  //
  //    val second = remain.toInt
  //
  //    var output = ""
  //
  //    val isYear = year != 0
  //    val isDay = day != 0
  //    val isHour = hour != 0
  //    val isMin = min != 0
  //    val isSecond = second != 0
  //
  //    if (isYear && year != 1){
  //      output += s"$year years"
  //    } else if (isYear && year == 1){
  //      output += s"$year year"
  //    }
  //
  //    if (!isYear && isDay && !isHour && day != 1){
  //      output += s"$day days"
  //    } else if (isYear && isDay && isHour && min == 1){
  //      output += s"$day day"
  //    }
  //    if (!isYear && isDay && isHour && day != 1){
  //      output += s"$day days, "
  //    } else if (isYear && isDay && isHour && min == 1){
  //      output += s"$day day, "
  //    }
  //
  //    if (isYear && isDay && !isHour && day != 1){
  //      output += s" and $day days"
  //    } else if (isYear && isDay && isHour && min == 1){
  //      output += s" and $day day"
  //    }
  //
  //    if (isYear && isDay && isHour && day != 1){
  //      output += s", $day days, "
  //    } else if (isYear && isDay && isHour && min == 1){
  //      output += s", $day day, "
  //    }
  //
  //
  //
  //
  //    if (isHour && hour != 1){
  //      output += s"$hour hours"
  //    } else if (isHour && hour == 1){
  //      output += s"$hour hour"
  //    }
  //
  //    if (!isHour && isMin && !isSecond && min != 1){
  //      output += s"$min minutes"
  //    } else if (!isHour && isMin && !isSecond && min == 1){
  //      output += s"$min minute"
  //    }
  //    if (!isHour && isMin && isSecond && min != 1){
  //      output += s"$min minutes and "
  //    } else if (!isHour && isMin && isSecond && min == 1){
  //      output += s"$min minute and "
  //    }
  //
  //    if (isHour && isMin && !isSecond && min != 1){
  //      output += s" and $min minutes"
  //    } else if (isHour && isMin && !isSecond && min == 1){
  //      output += s" and $min minute"
  //    }
  //
  //    if (isHour && isMin && isSecond && min != 1){
  //      output += s", $min minutes and "
  //    } else if (isHour && isMin && isSecond && min == 1){
  //      output += s", $min minute and "
  //    }
  //
  //    if (isHour && !isMin && isSecond && min != 1){
  //      output += s" "
  //    }
  //
  //    if (isSecond && second != 1){
  //      output += s"$second seconds"
  //    } else if (isSecond && second == 1){
  //      output += s"$second second"
  //    }
  //
  //
  //    println(s"Seconds = $second, Minutes = $min, Hours = $hour, Days = $day, Years = $year")
  //    println(output)
  //    output

}
