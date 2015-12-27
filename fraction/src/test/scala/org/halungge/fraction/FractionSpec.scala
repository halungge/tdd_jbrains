package org.halungge.fraction

import org.scalatest.Matchers
import org.scalatest.FlatSpec

class FractionSpec extends FlatSpec with Matchers{
  
//  "a Fraction " should " be maximally reduced " in {
//    Fraction(2,4) should be(Fraction(1,2))
//  }
  
  "a Fraction" should " have a denominator " in {
    Fraction(2, 3).denom shouldEqual 3
  }

}