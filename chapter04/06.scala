import scala.collection.mutable.LinkedHashMap

object Main {
  def main(args: Array[String]) {
    val daysOfTheWeek = LinkedHashMap(
      "Monday"    -> java.util.Calendar.MONDAY,
      "Tuesday"   -> java.util.Calendar.TUESDAY,
      "Wednesday" -> java.util.Calendar.WEDNESDAY,
      "Thursday"  -> java.util.Calendar.THURSDAY,
      "Friday"    -> java.util.Calendar.FRIDAY,
      "Saturday"  -> java.util.Calendar.SATURDAY,
      "Sunday"    -> java.util.Calendar.SUNDAY)

       println(daysOfTheWeek)
  }
}
