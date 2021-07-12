package Practice2

class ValClass {
  val abc ={
    println("Eager1")
    println("Eager2")
    87
  }
  println(">>>>>>>>>>>")
  lazy val abcd = {
    println("Lazy1")
    println("Lazy1")
    23211
  }

}
