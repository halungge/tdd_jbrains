package example1

import org.scalatest.Matchers
import org.scalatest.FlatSpec
import org.halungge.fraction.Fraction

class FractionIntegrationSpec extends FlatSpec with Matchers{
  "  " should " be able to call + on Fraction " in {
    val f1 = Fraction(7,3)
    val f2 = Fraction(4,5)
   
    f1 + f2 shouldBe Fraction(47, 15)
  }

}