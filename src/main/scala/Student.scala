import java.util.stream.Collectors
import java.util

final class Student(val name: String,
                    val rollNumber: Int,
                    val mobile: Option[String],
                    val section: Char) extends Serializable {

  override def toString: String =
    s"""Student($name, $rollNumber, $mobile, $section)"""
}

object Student extends App {

  def studentToJson(student: Student): String = {
    val partA =
      s"""{
         |    "name": "${student.name}",
         |    "rollNumber": ${student.rollNumber},""".stripMargin

    val partB = if (student.mobile.nonEmpty) s"""\n    "mobile": "${student.mobile.get}",""" else ""

    val partC =
      s"""
         |    "section": "${student.section}"
         |}""".stripMargin

    partA + partB + partC
  }

  def studentsToJson(students: util.List[Student]): String = {
    students
      .stream()
      .map(student => studentToJson(student))
      .collect(Collectors.joining(",", "[", "]"))
  }





}
