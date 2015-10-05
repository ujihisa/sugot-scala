package io.github.ujihisa.sugotscala

import org.scalatest._

class LibTest extends FlatSpec with Matchers {
  val l = new Lib(null)

  "sec()" should "convert from seconds to tick" in {
    val result = l.sec(23)
    result.shouldBe(460)
  }
}
