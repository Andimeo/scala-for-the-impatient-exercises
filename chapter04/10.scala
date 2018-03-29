import scala.collection.JavaConverters._

object Main {
  def main(args: Array[String]) {
    val caseConverter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".zip("abcdefghijklmnopqrstuvwxyz").toMap
    var lower = caseConverter('D')
    println(lower)
  }
}
