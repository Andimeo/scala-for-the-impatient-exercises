object Main {
  def main(args: Array[String]) {
    val map = new scala.collection.mutable.HashMap[String, Int]
    val in = new java.util.Scanner(new java.io.File("/tmp/file.txt"))

    while (in.hasNext()) {
      val key = in.next()
      val value = if (map.contains(key)) map(key) else 0
      map(key) = value + 1
    }
    for ((k, v) <- map) println(k + " " + v)
  }
}
