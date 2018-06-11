

object ListObject extends App {
  val strChar: List[String] = List("C", "D", "R", "W", "S", "G", "J", "H")
  val strNum: List[Int] = List(2, 3, 5, 7, 4, 8, 8, 1)
  val simplelist: List[Any] = List('a', 1, 5, 'a', 'b', 'c', 'd')
  //simple_fun(simplelist)
  println(listAnalysis(simplelist))
  //  println(strChar.take(3))
  //  println(strChar.head)
  //  println(strNum ::: strChar)
  //  println(List.tabulate(20)(x => x + 10))
  //  println(strChar :: strNum)
  //  val x = 34
  //  println(x :: strNum)

  // println(sumOdd(strNum))
  def sumOdd(in: List[Int]): Int = in match {

    case Nil => 0
    case x :: rest if x % 2 == 1 => x + sumOdd(rest)
    case _ :: rest => sumOdd(rest)
  }

  def simple_fun(list: List[Char]): List[Nothing] = list match {
    case x :: rest => {
      println(x)
      simple_fun(rest)
    }
    case _ => Nil
  }
  def listAnalysis(list: List[Any]) = list match {
    case Nil => "empty"
    case 'a' :: z => "starting by 'a' " + z
    case (r: Int) :: _ if r > 3 => "starting by an int greater than 3"
    case (z: Int) :: _ => "starting by an int"
    case _ => "whatever"
  }
}