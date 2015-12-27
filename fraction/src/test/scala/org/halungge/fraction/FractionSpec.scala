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
     val intFraction = new Fraction(4,1)
      areEqual(4, intFraction) should be(true)
      areEqual(intFraction, 4) should be(true)
    }

    "be equal to itself " in {
    	areEqual(fraction, new Fraction(2, 3)) should be (true)
    }
    " with negative enum is equal to the fraction with negative denom" in {
      new Fraction(-1, 3) should be (new Fraction(1, -3))
    }
    "obey minus times minus is plus" in {
      new Fraction(1, 3) should be(new Fraction(-1,-3))
    }
    "should be smaller than 0 when denom or enum are negative" in {
      new Fraction(-1,3) < 0 should be(true)
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
  "comparison for Fraction " should {
    " should implement < correctly " in{
      val small = new Fraction(1, 3)
      val large = new Fraction(8,9)
      small < large should be(true)
      small < small should be(false)
      large < small should be(false)
    }
    " should implement > correctly " in{
      val small = new Fraction(1, 3)
      val large = new Fraction(8,9)
      large > small should be(true)
      large > large should be(false)
      small > large should be(false)
    }
    
  }


  

}