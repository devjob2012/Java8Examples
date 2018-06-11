
object Car extends App {
  val bk: Book = new Book
  println(bk.calFact(20))
  bk.printNum(2)
  //println(bk.fibonacci(45))
  println(bk.test2("Hello wrold"))
}

class Book {
  @annotation.tailrec
  final def calFact(x: Int, acc: Long = 1): Long = {
    if (x == 1)
      acc
    else
      calFact(x - 1, x * acc)
  }
  def printNum(x: Int) {
    x match {
      case 1 => println(true)
      case 3 => println(false)
      case _ => println("NONE")
    }
  }

  def fibonacci(x: Int): Int = {
    println(x)
    x match {
      case 0 => 0
      case 1 => 1
      case _ => fibonacci(x - 1) + fibonacci(x - 2)
    }
  }
  def test2(x: Any) = x match {
    case s => "String"
    case _ => "Default"
  }
}
