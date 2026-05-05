object TestRunner {
  def main(args: Array[String]): Unit = {
    val signalcase_1 = Signal(85, 95, 22, 11, 5)
    assert(Policy.score(signalcase_1) == 176)
    assert(Policy.classify(signalcase_1) == "accept")
    val signalcase_2 = Signal(84, 71, 9, 17, 9)
    assert(Policy.score(signalcase_2) == 154)
    assert(Policy.classify(signalcase_2) == "accept")
    val signalcase_3 = Signal(70, 71, 11, 5, 12)
    assert(Policy.score(signalcase_3) == 188)
    assert(Policy.classify(signalcase_3) == "accept")
  }
}
