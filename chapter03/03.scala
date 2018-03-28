object Main {
  def swapAdjacent(a: Array[Int]): Array[Int] = {
    (
      for (i <- 0 until a.length)
      yield if (i % 2 == 0 && i + 1 == a.length) a(i)
      else if (i % 2 == 0) a(i+1)
      else a(i-1)
    ).toArray
  }

  def main(args: Array[String]) {
    swapAdjacent(Array(1, 2, 3, 4, 5)).foreach(println(_))
    assert( swapAdjacent(Array(51,42,30,4,25)).deep == Array(42,51,4,30,25).deep )
    assert( swapAdjacent(Array(51,42,30,4)).deep == Array(42,51,4,30).deep )
  }
}
