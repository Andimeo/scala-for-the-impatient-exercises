import scala.collection.JavaConverters._

object Main {
  def main(args: Array[String]) {
    val props = System.getProperties().asScala
    val longestKey = props.keysIterator.reduceLeft((x,y) => if (x.length > y.length) x else y)

    for ((k,v) <- props) {
      print(k + (" " * (longestKey.length - k.length)) + "| " + v + '\n')
    }
  }
}
