/** First-class Functions **/

/*< You can write down functions as unnamed literals and then pass them
      around as values, a function literal is compiled into a class that when
      instantiated at run-time is a function value. >*/      

// (x: int) => x + 1 "Function literal"
// var increase = (x: Int) => x + 1
// increase(10)

// Many statements in function literal, form a block:
   /* increase = (x: Int) => {
      println("we")
      println("are")
      println("young!")
      x + 1
    }*/
    
// For each with function literals, defined in trait Traversable
  /*val someNumbers = List(-11, -10, -5, 0, 5, 10)
  someNumbers.foreach((x:Int) => println(x)) */
  
// filter method with function literals
// someNumbers.filter((x: Int) => x > 0)
  
/** Short forms of function literals**/

// target typing:
// someNumbers.filter((x) => x > 0)

// Leaving out parentheses
// someNumbers.filter(x = > x > 0)

/** Placeholder syntax **/

// Used to make a function literal even more concise, you can use underscores
// as placeholders for one or more parameters

// someNumbers.filter(_ > 0)
// val f = (_: Int) + (_: Int) // Specifying parameter types

/** Partially applied functions **/

// You don't supply all of the arguments needed by the function
// someNumbers.foreach( println _)    // always leave a space

// Transforming def into function values:
/* def sum(a: Int, b: Int, c: Int) = a + b + c
    val a = sum _ // generate a class from sum with an apply method
    a(1,2,3)  // a refers to a function value object
    val b = sum(1, _: Int, 3)     
    b(2)  // b invokes sum(1,2,3) */
    
// When you leave off all parameters, you can express it leaving off the underscores
someNumbers.foreach(println)  // function parameter
val c = sum // error function is not required

