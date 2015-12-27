package org.halungge.fraction

import org.scalatest.Matchers
import org.scalatest.FlatSpec
import org.scalatest.WordSpec

class FractionSpec extends WordSpec with Matchers {
  "a Fraction" should {
    "have a denominator and an enumerator " in {
      val fraction = new Fraction(2, 3)
      fraction.enum should be(2)
      fraction.denom should be(3)
    }
    "be maximally reduced " in {
      new Fraction(2, 4) should be(new Fraction(1, 2))
    }
  }

  "two fractions " should {
    val f1 = new Fraction(7, 3)
    " sum up correctly " in {
      val f2 = new Fraction(4, 5)
      f1 + f2 should be(new Fraction(47, 15))
    }
    " be neutral under addition" in {
      val f2 = new Fraction(0, 3)
      f1 + f2 should be(f1)
    }
  }

  "a Integer and a Fraction " should {
    " add correctly to Fraction" in {
      5 + new Fraction(4, 3) should be(new Fraction(19, 3))
    }
  }

  //  " a Fraction with denom=1 " should " equal its Integer representation " in {
  //    new Fraction(4, 1) should be(4)
  //  }
  //  

}