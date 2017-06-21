/** Tail Recursion **/
/*< Use recursion to transform while loops into functional style with only vals>*/

def approximateLoop(initialGuess: Double): Double = {
  var guess = initialGuess
  while(!isGoodEnough(guess))
    guess = improve(guess)
  guess
}

def approximate(guess: Double): Double =  // compiler jump back here
  if (isGoodEnough(guess)) guess
  else approximate(improve(guess))    // tail recursive
  
// tracing tail-recursive functions

def boom(x: Int): Int = 
  if (x == 0) throw new Exception("Boom!")
  else boom(x-1) + 1  // not tail recursive because of +

def bang(x: Int): Int =
  if (x == 0) throw new Exception("bang!")
  else bang(x - 1)
  
-g:notailcalls  // get a longer stack trace
bang(5)

// limits of tail recursion
// no optimizacion when

def isEven(x: Int): Boolean =
  if (x == 0) true else isOdd(x - 1)
def isOdd(x: Int): Boolean =
  if (x == 0) false else isEven(x - 1)

// or final call goes to function value:
val funValue = nestedFun _
def nestedFun(x: Int) : Unit = {
  if (x != 0) { println(x); funValue(x - 1) } // it has to call itself directly
}
