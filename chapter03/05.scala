object Main {
  def func(a: Array[Double]) = {
    a.sum / a.length
  }

  def main(args: Array[String]) {
    assert(func(Array(1.0, 2.0, 3.0, 4.0, 5.0)) == 3.0)
  }
}
