package Practice

object Recollect extends App{

//  def function(a:Int,b:Int,simpleFunction:(Int,Int) => String ): String = {
//    simpleFunction(a:Int,b:Int)
//  }
  def square(a:Float,fn:Float=>Float):Float = fn(a:Float)
  def onebyThree(a:Int):Double = 1/a.toDouble
  println(onebyThree(9))
  def volumeofCone:(Float,Float,Float) => Double = (pi:Float,radius:Float,height:Float) =>{
    (onebyThree(3)*square(radius,(radius)=>(radius*radius))*height)

  }
  def volumeofCylinder(volumeofCone:Double,fn:(Double)=>(Double)):Double=fn(volumeofCone)

  println(volumeofCone(3.14F,3,8))

  println(volumeofCylinder(volumeofCone(3.14F,3,8),(volumeofCone)=>volumeofCone*3))


//  val ip:Scanner  = new Scanner((System.in))
//  println("Enter Value")
//  val g: Int =ip.nextInt()
//  println(square(g,a=>a*a))
}



