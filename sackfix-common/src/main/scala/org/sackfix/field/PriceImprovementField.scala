package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180902
  */
case class PriceImprovementField(override val value: Float) extends SfFieldFloat(639, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(639)PriceImprovement=(").append(value).append(")")
}

object PriceImprovementField {
  val TagId = 639  
  def apply(value: String) = try {
    new PriceImprovementField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new PriceImprovement("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[PriceImprovementField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[PriceImprovementField]
  }

  def decode(a: Any) : Option[PriceImprovementField] = a match {
    case v: String => Some(PriceImprovementField(v))
    case v: Float => Some(PriceImprovementField(v))
    case v: Double => Some(PriceImprovementField(v.toFloat))
    case v: Int => Some(PriceImprovementField(v.toFloat))
    case v: PriceImprovementField => Some(v)
    case _ => scala.Option.empty[PriceImprovementField]
  } 
}
