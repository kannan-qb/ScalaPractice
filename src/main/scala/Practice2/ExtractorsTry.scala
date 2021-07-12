package Practice2

class ExtractorsTry(val name:String,val age:Int) {
  private final val rollno = 8+1
  private def add(a:Int): Int = a+1

}
object ExtractorsTry{
  def apply(name:String,age:Int): ExtractorsTry
  = new ExtractorsTry("Kannan",98)
  def apply(name:String):ExtractorsTry
  =new ExtractorsTry("Rajesh",97)
  def apply(age:Int,rollno:Int) = new ExtractorsTry("ramesh",99+rollno)
  def unapply(u:ExtractorsTry): Option[(String, Int, Int,Int)] = Some(u.name,u.age,u.rollno,u.add(6))


}
