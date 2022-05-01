package Codewars

object HumanTime extends App{

  def formatDuration(seconds: Int): String = {

    if (seconds == 0) return "now"

    var remain: Double = seconds
    val year = math.floor(remain / 31_536_000).toInt
    remain = remain % 31_536_000

    val day = math.floor(remain / 86400).toInt
    remain = remain % 86400

    val hour = math.floor(remain / 3600).toInt
    remain = remain % 3600

    val min = math.floor(remain / 60).toInt
    remain =  remain % 60

    val second = remain.toInt

    var output = ""

    val isYear = year != 0
    val isDay = day != 0
    val isHour = hour != 0
    val isMin = min != 0
    val isSecond = second != 0


    val positiveResults: Array[Boolean] = Array(isYear, isDay, isHour, isMin, isSecond).filter(e => e)

    // go through each unit if remaining positive results > 1 , appends ", "
    // if remaining positive results == 1 , append " and "
    // if remaining positive results == 0, append nothing

    println(positiveResults.mkString(", "))

    if (isYear && year != 1){
      output += s"$year years"
    } else if (isYear && year == 1){
      output += s"$year year"
    }

    if (!isYear && isDay && !isHour && day != 1){
      output += s"$day days"
    } else if (isYear && isDay && isHour && min == 1){
      output += s"$day day"
    }
    if (!isYear && isDay && isHour && day != 1){
      output += s"$day days ,"
    } else if (isYear && isDay && isHour && min == 1){
      output += s"$day day ,"
    }

    if (isYear && isDay && !isHour && !isMin && isDay && day != 1){
      output += s" and $day days"
    } else if (isYear && isDay && isHour && min == 1){
      output += s" and $day day"
    }

    if (isYear && isDay && !isHour && (isMin || isDay) && day != 1){
      output += s", $day days"
    } else if (isYear && isDay && isHour && min == 1){
      output += s",  $day day"
    }

    if (isYear && isDay && isHour && day != 1){
      output += s", $day days ,"
    } else if (isYear && isDay && isHour && min == 1){
      output += s", $day day ,"
    }




    if (isHour && hour != 1){
      output += s"$hour hours"
    } else if (isHour && hour == 1){
      output += s"$hour hour"
    }

    if (!isHour && isMin && !isSecond && min != 1){
      output += s"$min minutes"
    } else if (!isHour && isMin && !isSecond && min == 1){
      output += s"$min minute"
    }
    if (!isHour && isMin && isSecond && min != 1){
      output += s"$min minutes and "
    } else if (!isHour && isMin && isSecond && min == 1){
      output += s"$min minute and "
    }

    if (isHour && isMin && !isSecond && min != 1){
      output += s" and $min minutes"
    } else if (isHour && isMin && !isSecond && min == 1){
      output += s" and $min minute"
    }

    if (isHour && isMin && isSecond && min != 1){
      output += s", $min minutes and "
    } else if (isHour && isMin && isSecond && min == 1){
      output += s", $min minute and "
    }

    if (isHour && !isMin && isSecond && min != 1){
      output += s" "
    }

    if (isSecond && second != 1){
      output += s"$second seconds"
    } else if (isSecond && second == 1){
      output += s"$second second"
    }


    println(s"Seconds = $second, Minutes = $min, Hours = $hour, Days = $day, Years = $year")
    println(output)
    output
  }
  formatDuration(239935673)

}
