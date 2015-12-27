package org.halungge.fraction

import org.scalatest.Matchers
import org.scalatest.FlatSpec
import org.scalatest.WordSpec

class FractionSpec extends WordSpec with Matchers {
	val fraction = new Fraction(2, 3)
  import Fraction._
  "a Fraction" should {
    "have a denominator and an enumerator " in {
      fraction.enum should be(2)
      fraction.denom should be(3)
    }
    "be maximally reduced " in {
      new Fraction(2, 4) should be(new Fraction(1, 2))
    }
    "be equal to an integer if it has denominator 1" in {
    areEqual(4, new Fraction(4,1)) should be(true)      
    areEqual(fraction, new Fraction(2, 3)) should be (true)
    }
  }

  "addition for fraction " should {
    val f1 = new Fraction(7, 3)
    val f2 = new Fraction(4, 5)
    " sum two fractions  correctly " in {
      f1 + f2 should be(new Fraction(47, 15))
    }
    " be neutral under addition" in {
      val f2 = new Fraction(0, 3)
      f1 + f2 should be(f1)
    }
    " add correctly an Int and a Fraction" in {
    	5 + f1 should be(new Fraction(22, 3))
    }
    " be commutative" in {
      f1 + f2 should be(f2 + f1) 
    }
  }


  //  " a Fraction with denom=1 " should " equal its Integer representation " in {
  //    new Fraction(4, 1) should be(4)
  //  }
  //  

}