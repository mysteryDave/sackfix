package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180902
  */
case class CapPriceField(override val value: Float) extends SfFieldFloat(1199, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1199)CapPrice=(").append(value).append(")")
}

object CapPriceField {
  val TagId = 1199  
  def apply(value: String) = try {
    new CapPriceField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new CapPrice("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[CapPriceField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[CapPriceField]
  }

  def decode(a: Any) : Option[CapPriceField] = a match {
    case v: String => Some(CapPriceField(v))
    case v: Float => Some(CapPriceField(v))
    case v: Double => Some(CapPriceField(v.toFloat))
    case v: Int => Some(CapPriceField(v.toFloat))
    case v: CapPriceField => Some(v)
    case _ => scala.Option.empty[CapPriceField]
  } 
}
