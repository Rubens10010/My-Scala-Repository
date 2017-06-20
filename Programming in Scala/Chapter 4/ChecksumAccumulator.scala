class ChecksumAccumulator{
  
  private var sum = 0		// private variable
  var max = 100	// public variable
  
  def add(b: Byte):Unit = { sum += b}  // arguments are vals
  def checksum(): Int = ~(sum & 0xFF) + 1
}

// Singletons

import scala.collection.mutable

object ChecksumAccumulator {
  private val cache = mutable.Map.empty[String, Int]	// scala doesn't have static members
  def calculate(s: String): Int = 
    if(cache.contains(s))
      cache(s)
    else {
      val acc = new ChecksumAccumulator
      for(c <- s)
        acc.add(c.toByte)
      val cs = acc.checksum()
      cache += (s -> cs)
      cs
    }
}

//ChecksumAccumulator.calculate("Every value is an object. ")	// invoke singleton method
