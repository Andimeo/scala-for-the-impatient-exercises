object Main {
  def main(args: Array[String]) {
    val gizmos = Map("Nexus 5" -> 300, "Nexus 7" -> 200, "Chromecast" -> 35)
    val discount = for((k,v) <- gizmos) yield (k, v*0.9)
    assert(discount == Map("Nexus 5" -> 270, "Nexus 7" -> 180, "Chromecast" -> 31.5))
  }
}
