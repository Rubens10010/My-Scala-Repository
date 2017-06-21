/** Special function call forms **/
/* < A few special forms of function definitions and function calls have been added to the language: repeated parameters, named arguments and default arguents > */

/** Repeated parameters */
def echo(args: String*) =   // type of repeated parameter is array of declared type
  for (arg <- args) println(arg)

// -> echo(), echo("one"), echo("hello", "world")
// -> val arr = Array("what's'", "up","doc"); echo(arr) // error
// echo(arr: _*)  // pass each element of arr as its own argument

/** Name Arguments */
/*< Named arguments allow you to pass arguments to a function in derrent order than established >*/

def speed(distance: Float, time: Float): Float =
  distance / time

speed(100,10)
speed(distance = 100, time = 10)
speed(time = 10, distance = 100)

/** Default parameter values*/
/*< Scala lets you specify default values for function parameters >*/
def printTime(out: java.io.PrintStream= Console.out) =
  out.println("time = " + System.currentTimeMillis())
  
def printTime2(out: java.io.PrintStream = Console.out, divisor: Int = 1) =
  out.println("time = " + System.currentTimeMillis()/divisor)

printTime2(out = Console.err)
printTime2(divisor = 1000)
