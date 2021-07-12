package Practice

object Assignment2 extends App {

  def greeting(name: String)(marks: Int)(subject: String): String = {
    s"Cogratulations! $name for Securing $marks in $subject "

  }

  val a1: Int => String => String = greeting("KANNAN")
  val a2: String => String = a1(98)
  val a3: String = a2("JAVA")
  println(a3)
  println(greeting("AAKASH")(99)("SCALA"))
  println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")

  def greeting1: (String, Int, String) => String = (name: String, marks: Int, subject: String) => {
    s"Cogratulations! $name for Securing First $marks in $subject "

  }

  val b1: Int => String => String = greeting("DEEPA")
  val b2 = b1(99)
  val b3 = b2("JAVA")
  println(b3)
  println(greeting("ARUL")(99)("SCALA"))


}
