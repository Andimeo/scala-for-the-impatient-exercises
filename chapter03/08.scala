import scala.collection.mutable.ArrayBuffer

object Main {
  def main(args: Array[String]) {
    val ab = ArrayBuffer(51,-42,30,-4,25,-51,8,42)
    val indices = ab.indices.filter(ab(_)<0).drop(1)
    for (i <- 0 until indices.length) ab.remove(indices(i)-i)
    ab.foreach(println(_))

    val a = Array(51,-42,30,-4,25,-51,8,42)
    val res = for (i <- 0 until a.length if (i<=a.indexWhere(_<0)||a(i)>0)) yield a(i)
    res.foreach(println(_))
  }
}
