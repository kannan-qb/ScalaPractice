package Practice2

object MainEx extends App{
  val a: ExtractorsTry = ExtractorsTry.apply("Kannan",9)
  println(a.name)
  val a1 = ExtractorsTry.apply("Kannan")
  println(a1.age)
  println(ExtractorsTry.apply(90,90).name)
  val b = ExtractorsTry
  val ExtractorsTry(a2,c,d,e) = a

  println(a2)
  println(c)
  println(d)
  println(e)

  def add(f: =>Int) = {
    println("kkaaksj")
    println("Lazyyyyyyyyy")
    f
  }
  def laz(a:Int): Int = {
    println("Eager")
    a+1
  }
  println(add(laz(4)))
  println(">>>>>>>>>>>>>>")
  val f: Int =laz({
    println("Kannan")
    4
  })
  println(f)



}
