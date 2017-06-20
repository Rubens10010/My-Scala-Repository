// In file Summer.scala
// CheckSumAccumulator in classes
import ChecksumAccumulator.calculate

object Summer{
  def main(args: Array[String]) = {
    for	(arg <- args)
      println(arg + ": " + calculate(arg))
  }
}

// Compile with scalac ChecksumAccumulator.scala Summer.scala
// or fsc ChecksumAccumulator.scala Summer.scalac
// fsc creates a local server daemon attached to a port on the computer, to finish it: fsc -shutdown
// To call the application is with the name of the main class
