import java.util.TimeZone

object Main {
  def main(args: Array[String]) {
    val id = "America/"
    val a = TimeZone.getAvailableIDs.filter(_.startsWith(id)).map(_.stripPrefix(id)).sorted

    a.foreach(println)
  }
}
