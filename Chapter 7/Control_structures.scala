// Built-in Control structures

// All return values

// If expression

val filename =        // it will never change
  if(!args.isEmpty) args(0)
  else "default.txt"
  
// while loops

def gcdLoop(x: Long, y: Long) = {
  var a = x
  var b = y
  while (a != 0){
    val temp = a
    a = b % a
    b = temp
  }
  b
}

// Do while

var line = ""
do {
  line = readLine()
  println("Read: " + line)
} while(line != "")

// -- Functional style
def gcd(x: Long, y: Long): Long = 
  if(y == 0) x else gcd(y, x % y)
  
// For expression -- Iteration through collections
val filesHere = (new java.io.File(".")).listFiles   // Array[File] to iterate through files in current Directory

for (file <- filesHere)   // Generator, iterator (val)
  println(file)
  
// Range For Loop
for (i <- 1 to 4)
  println("Iteration " + i)
  
for (i <- 1 until 4)
  println("Iteration " + i)
  
// Not common
for(i <- 0 to filesHere.length - 1)
  println(filesHere(i))
  
// Filtering
val filesHere = (new java.io.File(".")).listFiles

for(file <- filesHere if file.getName.endsWith(".scala")) // use an if filter
  println(file)
  
// Multiple filters
for(
  file <- filesHere
  if file.isFile
  if file.getName.endsWith(".scala")
) println("file: " + file)

// Nested iteration

def fileLines(file: java.io.File) = 
  scala.io.Source.fromFile(file).getLines().toList
  
def grep(pattern: String) =
  for {           // Use curly brackets otherwise should use ;
    file <- filesHere
    if file.getName.endsWith(".scala")  //";"
    line <- fileLines(file)
    if line.trim.matches(pattern)
  } println(file + ": " + line.trim)
  
// Mid-stream assignment
def grep(pattern: String) =
  for {           // Use curly brackets otherwise should use ;
    file <- filesHere
    if file.getName.endsWith(".scala")  //";"
    line <- fileLines(file)
    trimmed = line.trim
    if trimmed.matches(pattern)
  } println(file + ": " + trimmed)  
  
grep(".*gcd.*")

// Producing a new Collection
def scalaFiles =
  for {
    file <-filesHere
    if file.getName.endsWith(".scala")
  } yield file      // value to store in Array[File]

// Transforming array[File] to Array[Int]
val forLineLengths = 
  for {
    file <- filesHere
    if file.getName.endsWith(".scala")
    line <- fileLines(file)
    trimmed = line.trim
    if trimmed.matches(".*for.*")
  } yield trimmed.length
  
// Thowing exceptions

val half = 
  if(n%2 == 0)
    n/2
  else
    throw new RuntimeException("n must be even")
    
// Catching exceptions

import java.io.FileReader
import java.io.FileNotFoundExcetion
import java.io.IOException

try {
  val f = new FileReader("input.txt")
} catch {
  case ex: FileNotFoundExcetion => // Handle missing file
  case ex: IOException => // Handle other I/O error
}

// Finally to execute code no matter what
import java.io.FileReader

val file = new FileReader("input.txt")
try{
  // use the file
} finally{
  file.close()
}

// yielding a values
import java.net.URL
import java.net.MalformedURLException

def urlFor(path: String) = 
  try {
    new URL(path)
  } catch {
    case e: MalformedURLException =>
      new URL("http://www.scala-lang.org")
  }
  
// Match Expressions

/* Scala's match expression lets you select from a number of alternatives ~ Switch using arbbitrary patterns*/

val firstArg = if (args.length > 0) args(0) else ""
firstArg match {
  case "salt" => println("pepper")
  case "chips" => println("salsa")
  case "eggs" => println("bacon")
  case _ => println("huh?")
}

// Living without break and continue

var i = 0
var foundIt = false
while (i < args.length && !foundIt) {
  if (!args(i).startsWith("-")) {
    if (args(i).endsWith(".scala"))
      foundIt = true
  }
  i = i + 1
}

// functional style

def searchFrom(i: Int): Int =
  if (i >= args.length) - 1
  else if (args(i).startsWith("-")) searchFrom(i + 1)
  else if (args(i).endsWith(".scala")) i
  else searchFrom(i + 1)
  
val i = searchFrom(0)
