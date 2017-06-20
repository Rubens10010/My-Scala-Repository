object numeric
{
  def EPS = 1e-5
  
  // Calculates SQRT of a given value 'x' by Newton's method

  def sqrt(x: Double): Double = {
    def loop(y: Double): Double =
      if(math.abs(y*y - x) / x > EPS) loop(((x/y) + y) / 2.0)
      else y
    
    loop(1.0)
  }
  
  // Computes the exponentiation of given number 'x' in power 'y'
  
  def power(x: Double, y: Int): Double = {
    def loop(xx: Double, acc: Double, yy: Int): Double = 
      if(yy == 0) acc
      else if(yy % 2 == 0) loop(xx*xx,acc,yy/2)
      else loop(xx, acc*xx, yy-1)
    
    loop(x, 1.0, y)
  }
  
  // Computes the GCD of two given numbers
  
  def gcd(x: Int, y: Int):Int = if(y == 0) x else gcd(y, x%y)
  
  // Computes the LCM of two given numbers
  
  def lcm(x: Int, y: Int): Int = math.abs(x*y)/gcd(x,y)
  
  // Prints the n th levels of Pascal's Triangle
  
  def pascalTriangle(n: Int): Unit = {
    def pascal(i: Int, j: Int): Int = 
      if(j == 0 || j == i)  1
      else pascal(i - 1, j - 1) + pascal(i - 1, j)
      
    def loop(m: Int): Unit = 
      if (m < n) {
        for(k <- 0 to m) print(pascal(m, k) + " ")
        print("\n")
        loop(m+1)
      }else print("\n")
    
    loop(0)
  }
  
  // Checks whether the given number is power of two
  
  def isPowerOfTwo(x: Int): Boolean =
    (x & (x - 1)) == 0
  
  // Compute the n-th Fibonacci numbers
  
  def fibonacci(n: Int): Int = 
    if(n == 0 || n == 1) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
    
  // Efficient fibonacci
  
  def fibonacciIter(n: Int): Int = {
    def loop(a: Int, b: Int, k: Int): Int = 
      if (k > 0) loop(b, a+b, k-1)
      else b
    loop(0,1,n)
  }
  
  // scalable Fibonacci
   def fibonacciIter(n: BigInt): BigInt = {
    def loop(a: BigInt, b: BigInt, k: BigInt): BigInt = 
      if (k > 0) loop(b, a+b, k-1)
      else b
    loop(0,1,n)
  }
 
  def main(args: Array[String]):Unit = {
    println("Sqrt of 10: "  + sqrt(10));
    println("Power of 2 to 10: "  + power(2,10))
    pascalTriangle(3)
    fibonacciIter(100)
    System.exit(1)
  }
}
