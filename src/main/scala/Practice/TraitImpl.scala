package Practice

import java.lang.Double.toHexString
import java.lang.Math.{abs, sqrt}

class TraitImpl extends TraitExample  {
  override def op1(a: Int, b: Int): Int = a * b

  override def op2(a: Int, b: Int, c: Int): Int = a * b - c

  def simpleHash(c: Int): String = {
    val e = toHexString(c)
    println(">><>><><<><><<>")
    e

  }

  val simpleHash2: String = {
    println("Hello")
    toHexString(2)

  }

  def division(a: Int, b: Int): Int = abs(a/b)

  def squareroot(a:Int): Double = {
    val b=sqrt(a)
    b.abs
  }

}