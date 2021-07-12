package Practice

object Assignment1 extends App {
  def areaofRectangle(length: Int, breadth: Int, area: (Int, Int) => Int): Int = {
    area(length, breadth)
  }

  def volumeofCube(length: Int, volume: (Int) => Int): Int = volume(length)

  def areaofSquare(sideLength: Int, area1: (Int) => Int): Int = area1(sideLength)

  def greet(name: String, greet: (String) => (String)): String = greet(name)

  def checkEquality(name: String, name2: String, check: (String, String) => (Boolean)): Boolean = check(name, name2)

  def calculatingareaofRec(length: Int, breadth: Int): Int = length * breadth

  def calculatingvolumeofCube(length: Int): Int = length * length * length

  def calculatingareaofSquare(sideLength: Int): Int = sideLength * sideLength

  def greeting(name: String): String = {
    s"Hello $name"

  }

  def equalityChecker(name: String, name2: String): Boolean = name equals name2

  println(areaofRectangle(200, 345, calculatingareaofRec))
  println(volumeofCube(20, calculatingvolumeofCube))
  println(areaofSquare(100, calculatingareaofSquare))
  println(greet("Divyanshu", greeting))
  println(checkEquality("Scala", "Java", equalityChecker))

  println("<<<<<<<<<<<<<<<>????????????")

  println(areaofRectangle(21, 345, (length, breadth) => length * breadth))
  println(volumeofCube(20, (length) => length * length * length))
  println(areaofSquare(130, (sidelength) => sidelength * sidelength * sidelength))
  println(greet("Aakash", (name) => s"Hello $name"))
  println(checkEquality("Scala", "scala", (name, name2) => name equals name2))


}
