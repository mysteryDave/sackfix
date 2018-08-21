package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180821
  */
case class UnderlyingStrikePriceField(override val value: Float) extends SfFieldFloat(316, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(316)UnderlyingStrikePrice=(").append(value).append(")")
}

object UnderlyingStrikePriceField {
  val TagId = 316  
  def apply(value: String) = try {
    new UnderlyingStrikePriceField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new UnderlyingStrikePrice("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[UnderlyingStrikePriceField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingStrikePriceField]
  }

  def decode(a: Any) : Option[UnderlyingStrikePriceField] = a match {
    case v: String => Some(UnderlyingStrikePriceField(v))
    case v: Float => Some(UnderlyingStrikePriceField(v))
    case v: Double => Some(UnderlyingStrikePriceField(v.toFloat))
    case v: Int => Some(UnderlyingStrikePriceField(v.toFloat))
    case v: UnderlyingStrikePriceField => Some(v)
    case _ => scala.Option.empty[UnderlyingStrikePriceField]
  } 
}
