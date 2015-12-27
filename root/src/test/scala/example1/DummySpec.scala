package example1

import org.scalatest.Matchers
import org.scalatest.FlatSpec


class DummySpec extends FlatSpec with Matchers{
  " a number 1  " should 
    "equal to 1" in {
      1 shouldBe 1
    }
  

}