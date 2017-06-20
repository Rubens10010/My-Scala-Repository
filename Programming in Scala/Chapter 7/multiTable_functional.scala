/** 7.8 Refactoring imperative-style code **/
// Run as:  "scala multitable_functional.scala"
/* Pg 177 ... printMultitable has a side effect: printing a multiplication table to the standard output ... we refactored the function so that it returns the multiplication table in a string. */

// Returns a row as a sequence
def makeRowSeq(row: Int) =
  for (col <- 1 to 10) yield {
    val prod = (row*col).toString
    val padding = " " * (4 - prod.length)
    padding + prod
  }
  
// Returns a row as a string
def makeRow(row: Int) = makeRowSeq(row).mkString

// Returns table as a string with one row per line
def multiTable() = {
  
  val tableSeq = // a sequence of row strings
    for (row <- 1 to 10)
    yield makeRow(row)
    
  tableSeq.mkString("\n")
}

print(multiTable())
