package Practice

object Main2 extends App {
  val traitimpl =new TraitImpl
  val trait2 =new TraitImpl
  val variabl1=traitimpl.op2(0,0,1)
  println(traitimpl.op1(100,121))
  println(traitimpl.op2(122,221,211))
  println(traitimpl.simpleHash(variabl1))
  println(traitimpl.simpleHash(variabl1))
  println(traitimpl.simpleHash2)
  println(traitimpl.simpleHash2)
  println("<>><><><><><>")
  println(trait2.division(24,8))
  println(trait2.squareroot(36))

  def f(x:Int):Int={
    x*x
  }
  println(f(12))










}
