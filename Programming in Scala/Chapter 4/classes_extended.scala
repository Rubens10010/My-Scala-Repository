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
