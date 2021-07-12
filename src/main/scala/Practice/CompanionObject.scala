package Practice

class CompanionObject {
  private[this] val examMark: Int = 100

  def greet(name: String): String = {
    s"CONGRATUALTION!!! $name for SECURING $examMark MARKS in SCIENCE "
  }


}

object CompanionObject extends App {
  val obj = new CompanionObject

  println(obj.greet("Kannan"))


}