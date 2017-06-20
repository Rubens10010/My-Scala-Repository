class CheckSumAccumulator{
  
  private var sum = 0		// private variable
  var max = 100	// public variable
  
  def add(b: Byte):Unit = {  // arguments are vals
    sum += b
  }

  def checksum(): Int = {
    return ~(sum & 0xFF) + 1
  }
}

// Singletons

import scala.collection.mutable

object CheckSumAccumulator {
  private val cache = mutable.Map.empty[String, Int]	// scala doesn't have static members
  def calculate(s: String): Int = 
    if(cache.contains(s))
      cache(s)
    else {
      val acc = new CheckSumAccumulator
      for(c <- s)
        acc.add(c.toByte)
      val cs = acc.checksum()
      cache += (s -> cs)
      cs
    }
}

println(CheckSumAccumulator.calculate("Every value is an object. "))	// invoke singleton method
