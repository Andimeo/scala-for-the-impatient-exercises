object Main {
  def func(a: Array[Int]) = {
    a.filter(_ > 0) ++ a.filter(_ <= 0)
  }
  def main(args: Array[String]) {
    assert(func(Array(-2, 8, 0, 4, -8, -1, 0, 9)).deep == Array(8, 4, 9, -2, 0, -8, -1, 0).deep)
  }
}
