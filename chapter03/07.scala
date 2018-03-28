object Main {
  def main(args: Array[String]) {
    val a = Array(1, 1, 2, 2, 3, 3, 3, 4, 5, 5, 4, 6, 9, 6, 9)
    a.distinct.foreach(println(_))
  }
}
