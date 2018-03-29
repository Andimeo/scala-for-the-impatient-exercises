object Main {
  class Time(hours: Int, minutes: Int) {
    private var _hours = hours
    private var _minutes = minutes
    private val MIN_IN_HOUR = 3600

    def before(other: Time): Boolean = {
      _hours * MIN_IN_HOUR + _minutes < other._hours * MIN_IN_HOUR + other._minutes
    }

    override def toString(): String = _hours + ":" + _minutes;
    
    def hrs = _hours
    def min = _minutes

    if (_hours < 0) _hours = 23
    if (_hours > 23) _hours = 0

    if (_minutes < 0) _minutes = 59
    if (_minutes > 59) _minutes = 0
  }

  def main(args: Array[String]) {
    val time  = new Time(1, 30)
    val time1 = new Time(2, 30)
    val time2 = new Time(1, 10)

    println("Is time: " + time + " before time: " + time1 + "?    " + time.before(time1))
    println("Is time: " + time + " before time: " + time2 + "?    " + time.before(time2))
  }
}
