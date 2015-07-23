

import scala.io.Source
object Main {
  def main(args: Array[String]): Unit = {
    val src = Source.fromFile("data/cost.csv").getLines
    val header = src.take(1).next
    val headers = header.split(",")
    val closeIndex = headers.toList.indexOf("Close")
    for(l <- src) {
      println(l.split(",")(closeIndex))
    }
  }
}