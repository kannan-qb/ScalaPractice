package Practice

object Main3 extends App  {
  val j = new SealedImpl
  println(">>>>>>>><<<>><><><")
  println(j.add(1,2))
  println(j.add(1,2))
  println(">>>>>>>><<<>><><><")
  println(j.squareroot(1084))
  println(j.squareroot(1084))
  println(">>>>>>>><<<>><><><")
  println(j.division(876,33))
  println(j.division(876,33))
  println(">>>>>>>><<<>><><><")
  def max(a:Int,b:Int):Int={
    if(a<b){
      b
    }else{
      a
    }
  }






}
