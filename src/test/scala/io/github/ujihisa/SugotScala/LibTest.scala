package io.github.ujihisa.SugotScala

import org.scalatest._

class LibTest extends FlatSpec with Matchers {
  "sec()" should "convert from seconds to tick" in {
    val result = Lib.sec(23)
    result.shouldBe(460)
  }
}
