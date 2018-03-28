import java.awt.datatransfer._
import scala.collection.JavaConversions.asScalaBuffer
import scala.collection.mutable.Buffer

object Main {
  def main(args: Array[String]) {
    val flavors = SystemFlavorMap.getDefaultFlavorMap.asInstanceOf[SystemFlavorMap]
    val flavorsBuffer: Buffer[String] = flavors.getNativesForFlavor(DataFlavor.imageFlavor)

    flavorsBuffer.foreach(println)
  }
}
