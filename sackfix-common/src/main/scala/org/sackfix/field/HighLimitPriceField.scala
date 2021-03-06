package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180902
  */
case class HighLimitPriceField(override val value: Float) extends SfFieldFloat(1149, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1149)HighLimitPrice=(").append(value).append(")")
}

object HighLimitPriceField {
  val TagId = 1149  
  def apply(value: String) = try {
    new HighLimitPriceField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new HighLimitPrice("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[HighLimitPriceField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[HighLimitPriceField]
  }

  def decode(a: Any) : Option[HighLimitPriceField] = a match {
    case v: String => Some(HighLimitPriceField(v))
    case v: Float => Some(HighLimitPriceField(v))
    case v: Double => Some(HighLimitPriceField(v.toFloat))
    case v: Int => Some(HighLimitPriceField(v.toFloat))
    case v: HighLimitPriceField => Some(v)
    case _ => scala.Option.empty[HighLimitPriceField]
  } 
}
