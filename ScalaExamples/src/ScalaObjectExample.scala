

object ScalaObjectExample {
  def main(args: Array[String]): Unit = {
    stringInterpolation("Wow")
  }
  def scalaEx1 {
    for (i <- 1 to 10; j<-1 to 10)
      println(i +" "+j)
  }
  def scalaEx2 {
    var pro: Product = Product("Shoes", "ASIN1234", 123)
    println(pro)
    pro = Product("Shoes", "ASIN123")
    println(pro)
    pro = Product()
    println(pro)
    pro.price = 12
    println(pro)
    var pro1 = pro.copy("New", "asin122", 131)
    println(pro)
    pro1.name = "DEve"
    println(pro1)
    val sqr = (i: Int) => { i * i }
    println(sqr(2))
  }
  def stringInterpolation(hsd:String){
    val str = "Hello, this works!!!!"
    val str1 = s"Great ${str} , ${hsd}"
    println(str1)
  }
}