package Practice

sealed trait Sealed {
  def add(a:Int,b:Int):Int

}
class SealedImpl extends Sealed {
  override def add(a: Int, b: Int): Int = {
    println("Hello Testtt33")
    b+a-1
  }

  def division(a: Int, b: Int): Int = {
    println("Hello Testtt23")
    a/b
  }

  def squareroot(a: Int): Double = {
    println("Hello Testtt33")
    println(Symbol("Kannan"))
    math.sqrt(a)
  }
  val examTotal:Int=498

}

