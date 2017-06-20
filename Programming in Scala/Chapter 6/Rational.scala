
// Functional objects

// Scala classes have parameters that can be used inside
// Inmutable object

class Rational(n: Int, d: Int){ // class parameters
  // primary constructor
  require(d != 0) // precondition
  
  private val g = gcd(n.abs, d.abs) // private member
  val numer: Int = n/g;   // class fields
  val denom: Int = d/g;
  
  def this(n: Int) = this(n, 1) // Auxiliary constructor
  
  override def toString = numer + "/" + denom // print debug information
  
  private def gcd(a:Int, b:Int): Int =
    if(b == 0) a else gcd(b, a % b)
  
  def + (that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom, denom * that.denom
    )
    
  def + (i: Int): Rational =      // Overloading operator
    new Rational(numer + i * denom, denom)
    
  def - (that: Rational): Rational = 
    new Rational(
      numer * that.denom - that.numer * denom,
      denom * that.denom
    )
  
  def - (i: Int): Rational = 
    new Rational(numer - i * denom, denom)
        
  def * (that: Rational): Rational =
    new Rational(numer * that.numer, denom * that.denom)
    
  def * (i: Int): Rational =
    new Rational(numer * i, denom)  
  
  def / (that: Rational): Rational =
    new Rational(numer * that.denom, denom * that.numer)
  
  def / (i: Int): Rational = 
    new Rational(numer, denom * i)
  
  def lessThan(that: Rational) =
    this.numer * that.denom < that.numer * this.denom
  
  def max(that: Rational) =
    if (this.lessThan(that)) that else this
    
}

implicit def intToRational(x: Int) = new Rational(x)

val n = new Rational(3,2)
println(2+n)
