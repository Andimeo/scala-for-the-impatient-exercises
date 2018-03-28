object Main {

  def swapAdjacent(a: Array[Int]) = {
    val end = if (a.length % 2 == 0) a.length - 2 else a.length - 3
    for(i <- 0 to (end, 2)) {
      val temp = a(i)
      a.update(i, a(i+1))
      a.update(i+1, temp)
    }
    a
  }

  def main(args: Array[String]) = {
    val a = Array(1, 2, 3, 4, 5)
    swapAdjacent(a)
    a.foreach(x => println(x))
    assert( swapAdjacent(Array(51,42,30,4,25)).deep == Array(42,51,4,30,25).deep )
    assert( swapAdjacent(Array(51,42,30,4)).deep == Array(42,51,4,30).deep )
  }
}
