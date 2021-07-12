package Practice
import java.util

object Assignment3 extends App {
  def filterNot[A](listofAnytype: util.List[A])(functionPredicate: A => Boolean): util.List[A] = {
    val tempList = new util.LinkedList[A]()
    for (i <- 0 until listofAnytype.size()) {
      val element = listofAnytype.get(i)
      if (!functionPredicate(element)) {
        tempList.add(element)
      }
    }
    tempList
  }

  val mylist: util.List[Int] = util.Arrays.asList(1, 233, 34, 221, 456, 7783, 2343, 90, 87, 89, 90)
  val oddfromMyList: util.List[Int] = filterNot(mylist)(fn => fn % 2 == 0)
  val evenfromMyList: util.List[Int] = filterNot(mylist)(fn => fn % 2 != 0)
  println(mylist)
  println(oddfromMyList)
  println(evenfromMyList)

}
