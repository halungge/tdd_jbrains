package org.halungge.fraction

case class Fraction(enum: Int, denom:Int) {
  def +(other:Fraction) = Fraction(enum * other.denom + other.enum * denom, denom * other.denom)

}

