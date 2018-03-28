import scala.util.Random

object Main {
  def rand(n: Int) = { new Array[Int](n).map(_ => Random.nextInt(n)) }

  def main(args: Array[String]) {
    val l = 100
    val a = rand(l)
    assert(a.length == l)
    a.foreach(v => assert(v >= 0 && v < l))
  }
}
