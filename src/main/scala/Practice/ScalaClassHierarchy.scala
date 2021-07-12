package Practice

class ScalaClassHierarchy {
   protected[this] def checkEquality(a:ScalaClassHierarchy):Boolean={
     println("Object Intialized")
     this equals(a)
   }

}
object ScalaClassHierarchy extends App{
  val scalaClassHierarchy=new ScalaClassHierarchy



}

