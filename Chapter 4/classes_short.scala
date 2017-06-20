class ChecksumAccumulator {
  private var sum = 0
  def add(b: Byte): Unit = sum += b
  def cheksum(): Int = ~(sum & 0xFF) + 1
}
