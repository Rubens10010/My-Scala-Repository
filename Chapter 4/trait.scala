import ChecksumAccumulator.calculate

// Scala.App is a trait for applications on scala, you just
// need to extend from App and write the main inside the singleton.
// You can also access args array

object FallWinterSpringSummer extends App {
  for(season <- List("fall","winter","spring"))
    println(season + ": " + calculate(season))
}
