package org.halungge.fraction

object Fraction{
  implicit def intToFraction(x:Int) = new Fraction(x, 1)
  def areEqual(f1:Fraction, f2:Fraction) = f1.equals(f2)    
}

 class Fraction(e: Int, d:Int){
  import Fraction._
  
  private val sign = Math.signum(e * d).toInt
  private val ggt = euclid(e, d)
  val enum:Int = e/ggt * sign
  val denom:Int = d / ggt
  
  private def euclid(a:Int, b:Int):Int = if(b == 0) a else euclid(b, a%b)
  
  def +(other:Fraction) = new Fraction(enum * other.denom + other.enum * denom, denom * other.denom)
  def <(other:Fraction) = enum * other.denom < other.enum * denom
  def >(other:Fraction) = other < this && !areEqual(other, this)
  
  
  override def equals(other:Any):Boolean ={
    
    other match { 
      case o:Fraction => enum==o.enum && denom == o.denom
      case _ => false
    } 
  }
  

  
}



