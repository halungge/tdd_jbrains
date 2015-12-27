package org.halungge.fraction

object Fraction{
  implicit def IntToFraction(x:Int) = new Fraction(x, 1)
}

 class Fraction(e: Int, d:Int){

  def euclid(a:Int, b:Int):Int = if(b == 0) a else euclid(b, a%b)
  
  private val ggt = euclid(e, d)
  val enum:Int = e/ggt
  val denom:Int = d / ggt
  
  
  def +(other:Fraction) = new Fraction(enum * other.denom + other.enum * denom, denom * other.denom)

  override def equals(other:Any):Boolean ={
    other match { 
      case o:Fraction => enum==o.enum && denom == o.denom
      case _ => false
    } 
  }
  

  
}



