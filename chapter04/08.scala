import scala.collection.JavaConverters._

object Main {
  def minmax(values: Array[Int]) = {
    (values.min, values.max)
  }

  def main(args: Array[String]) {
    println(minmax(Array(0,1,2,3,4,5,6,7,8,9)))
  }
}
