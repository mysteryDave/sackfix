package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180902
  */
case class UnderlyingDeliveryAmountField(override val value: Float) extends SfFieldFloat(1037, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1037)UnderlyingDeliveryAmount=(").append(value).append(")")
}

object UnderlyingDeliveryAmountField {
  val TagId = 1037  
  def apply(value: String) = try {
    new UnderlyingDeliveryAmountField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new UnderlyingDeliveryAmount("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[UnderlyingDeliveryAmountField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingDeliveryAmountField]
  }

  def decode(a: Any) : Option[UnderlyingDeliveryAmountField] = a match {
    case v: String => Some(UnderlyingDeliveryAmountField(v))
    case v: Float => Some(UnderlyingDeliveryAmountField(v))
    case v: Double => Some(UnderlyingDeliveryAmountField(v.toFloat))
    case v: Int => Some(UnderlyingDeliveryAmountField(v.toFloat))
    case v: UnderlyingDeliveryAmountField => Some(v)
    case _ => scala.Option.empty[UnderlyingDeliveryAmountField]
  } 
}
