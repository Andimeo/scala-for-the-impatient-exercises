class Person (val name: String) {
  val firstName: String = name.split(" ")(0)
  val lastName: String = name.split(" ")(1)
}
