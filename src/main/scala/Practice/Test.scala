package Practice

class Test{
  private[this] val a:Int=101
  private val b=100
  private val arg=100
  protected[this]  var c:Int=100
  protected val d:Int=100

  def compare(test: Test): Boolean={
    this.a==test.b
  }
  def compare1(arg: Int): Boolean={
    this.a==this.arg
  }
  def multiply(a:Int,b:Int):Int={
    a*b
  }

}
class Test1 extends Test{
  protected val o=3939
  protected[this] def add(a:Int):Int={
    c=101
    a+d+c
  }
  protected var m=1002
  println(multiply(this.add(100),45))
  println(this.add(10)+1)

}
class Test2 extends Test1{

  def division(a:Int,b:Int):Int={
    this.add(a)/this.add(b)
  }

  println(add(111))
  println(o)


}