

object NewObject {
  def main(args: Array[String]): Unit = {
    println("Hello")
    val p = (x: Int) => x + 1
    println(p(5))
    println(2.+(45))
  }
}
object Test {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 10) {
      println(i)
    }

  }
}