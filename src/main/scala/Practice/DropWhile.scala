package Practice

import java.util
import scala.annotation.tailrec
object DropWhile extends App {

  def dropwhiletry[A](input: util.List[A])(fn: A => Boolean): util.List[A] = {
    @tailrec
    def compute(indexPostion: Int, output: util.List[A]): util.List[A] = {
      if (indexPostion >= input.size() || fn(input.get(indexPostion))) {
        compute(indexPostion + 1, output)
      } else {
        output.add(input.get(indexPostion))
        output
      }
    }
      compute(0, new util.LinkedList[A]())
    }
  val list = List(1,2,3,4,5)
  println(dropwhiletry(util.Arrays.asList(1,2,3,4,5,6,7,8,9,10))(fn => fn == 3))

}

