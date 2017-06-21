/** Local Functions **/
/*< Scala allows you to definde functions inside other functions (local functions)>*/
// Compile as: scalac local_functions.scala
// run as: scala FindLongLines 'width'  "File"

import scala.io.Source

object LongLines {
  def processFile(filename: String, width: Int) = {
    def processLine(line: String) = {   
      if(line.length > width)  // use parameters of outer processLine function
        println(filename + ": " + line.trim)
    }
    
    val source = Source.fromFile(filename)
    for(line <- source.getLines())
      processLine(line)
  }
}

object FindLongLines {
  def main(args: Array[String]) = {
    val width = args(0).toInt
    for (arg <- args.drop(1))
      LongLines.processFile(arg, width)
  }
}
