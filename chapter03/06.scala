import scala.util.Sorting.quickSort
import scala.collection.mutable.ArrayBuffer

object Main {
  def rearrange(a: Array[Int]) = {
    a.sortWith(_ < _).reverse
  }

  def rearrange(a: ArrayBuffer[Int]) = {
    a.sortWith(_ < _).reverse
  }

  def main(args: Array[String]) {
    rearrange(Array(3, 2, 1, 4, 6, 5)).foreach(println(_))
    rearrange(ArrayBuffer(3, 2, 1, 4, 6, 5)).foreach(println(_))
  }
}
