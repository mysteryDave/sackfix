package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170404
  */
case class ComplexEventPriceField(override val value: Float) extends SfFieldFloat(1486, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1486)ComplexEventPrice=(").append(value).append(")")
}

object ComplexEventPriceField {
  val TagId = 1486  
  def apply(value: String) = try {
    new ComplexEventPriceField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new ComplexEventPrice("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[ComplexEventPriceField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ComplexEventPriceField]
  }

  def decode(a: Any) : Option[ComplexEventPriceField] = a match {
    case v: String => Some(ComplexEventPriceField(v))
    case v: Float => Some(ComplexEventPriceField(v))
    case v: Double => Some(ComplexEventPriceField(v.toFloat))
    case v: Int => Some(ComplexEventPriceField(v.toFloat))
    case v: ComplexEventPriceField => Some(v)
    case _ => scala.Option.empty[ComplexEventPriceField]
  } 
}