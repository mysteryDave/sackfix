package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170404
  */
case class QuantityField(override val value: Float) extends SfFieldFloat(53, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(53)Quantity=(").append(value).append(")")
}

object QuantityField {
  val TagId = 53  
  def apply(value: String) = try {
    new QuantityField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new Quantity("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[QuantityField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[QuantityField]
  }

  def decode(a: Any) : Option[QuantityField] = a match {
    case v: String => Some(QuantityField(v))
    case v: Float => Some(QuantityField(v))
    case v: Double => Some(QuantityField(v.toFloat))
    case v: Int => Some(QuantityField(v.toFloat))
    case v: QuantityField => Some(v)
    case _ => scala.Option.empty[QuantityField]
  } 
}