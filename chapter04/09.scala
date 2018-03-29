import scala.collection.JavaConverters._

object Main {
  def lteqgt(values: Array[Int], v: Int) = {
    (values.filter(_ < v).length, values.filter(_ == v).length, values.filter(_ > v).length)
  }

  def main(args: Array[String]) {
    val testArray = Array(1, 3, 6, 8, 3, 6, -1, 2)
    println(lteqgt(testArray, 3))
  }
}
