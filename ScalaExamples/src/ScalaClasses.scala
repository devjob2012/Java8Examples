object mainObject {
  def main(args: Array[String]): Unit = {
    val drawRec  = new Rectangle(10, 3)
    drawRec.draw(drawRec)
    val drawCircle  = new Circle(10)
    drawCircle.draw(drawCircle)
  }
}

class ScalaClasses {
}
class Shapes {
  def area: Double = 0.0
  def draw(s: Shapes) = println("Area is " + area)
}

class Rectangle(length: Int, width: Int) extends Shapes {
  override def area: Double = length * width
}
class Circle(radius: Int) extends Shapes {
  override def area: Double = Math.PI * radius * radius
}