object Main {
  class Time(hours: Int, minutes: Int) {
    private val MIN_IN_HOUR = 60
    private var _minutes = hours * MIN_IN_HOUR + minutes

    def before(other: Time): Boolean = {
      _minutes < other._minutes
    }

    override def toString(): String = hrs + ":" + min;
    
    def hrs = _minutes / MIN_IN_HOUR
    def min = _minutes % MIN_IN_HOUR
  }

  def main(args: Array[String]) {
    val time  = new Time(1, 30)
    val time1 = new Time(2, 30)
    val time2 = new Time(1, 10)

    println("Is time: " + time + " before time: " + time1 + "?    " + time.before(time1))
    println("Is time: " + time + " before time: " + time2 + "?    " + time.before(time2))
  }
}
