package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180902
  */
case class SettlCurrFxRateField(override val value: Float) extends SfFieldFloat(155, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(155)SettlCurrFxRate=(").append(value).append(")")
}

object SettlCurrFxRateField {
  val TagId = 155  
  def apply(value: String) = try {
    new SettlCurrFxRateField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new SettlCurrFxRate("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[SettlCurrFxRateField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SettlCurrFxRateField]
  }

  def decode(a: Any) : Option[SettlCurrFxRateField] = a match {
    case v: String => Some(SettlCurrFxRateField(v))
    case v: Float => Some(SettlCurrFxRateField(v))
    case v: Double => Some(SettlCurrFxRateField(v.toFloat))
    case v: Int => Some(SettlCurrFxRateField(v.toFloat))
    case v: SettlCurrFxRateField => Some(v)
    case _ => scala.Option.empty[SettlCurrFxRateField]
  } 
}
