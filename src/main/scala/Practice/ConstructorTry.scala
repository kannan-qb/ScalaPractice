package Practice


class  ConstructorTry private (private val name:String) {
  def checkEquality(obj1:ConstructorTry,obj2:ConstructorTry):Boolean={
    obj1 equals obj2
  }


}
object ConstructorTry extends  App{
  private [this] val city ="ANNA UNIVERSITY"
  def newInstance(name: String): ConstructorTry = {
    new ConstructorTry(name)
  }
  val a=new ConstructorTry("Kannan")
  println(newInstance(city))
  println(a.checkEquality(this.a,this.newInstance("Kannan")))





}


