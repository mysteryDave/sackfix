package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180902
  */
case class SecondaryLowLimitPriceField(override val value: Float) extends SfFieldFloat(1221, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1221)SecondaryLowLimitPrice=(").append(value).append(")")
}

object SecondaryLowLimitPriceField {
  val TagId = 1221  
  def apply(value: String) = try {
    new SecondaryLowLimitPriceField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new SecondaryLowLimitPrice("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[SecondaryLowLimitPriceField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SecondaryLowLimitPriceField]
  }

  def decode(a: Any) : Option[SecondaryLowLimitPriceField] = a match {
    case v: String => Some(SecondaryLowLimitPriceField(v))
    case v: Float => Some(SecondaryLowLimitPriceField(v))
    case v: Double => Some(SecondaryLowLimitPriceField(v.toFloat))
    case v: Int => Some(SecondaryLowLimitPriceField(v.toFloat))
    case v: SecondaryLowLimitPriceField => Some(v)
    case _ => scala.Option.empty[SecondaryLowLimitPriceField]
  } 
}
