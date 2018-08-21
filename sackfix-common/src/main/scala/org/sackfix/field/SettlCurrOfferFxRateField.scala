package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180821
  */
case class SettlCurrOfferFxRateField(override val value: Float) extends SfFieldFloat(657, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(657)SettlCurrOfferFxRate=(").append(value).append(")")
}

object SettlCurrOfferFxRateField {
  val TagId = 657  
  def apply(value: String) = try {
    new SettlCurrOfferFxRateField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new SettlCurrOfferFxRate("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[SettlCurrOfferFxRateField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SettlCurrOfferFxRateField]
  }

  def decode(a: Any) : Option[SettlCurrOfferFxRateField] = a match {
    case v: String => Some(SettlCurrOfferFxRateField(v))
    case v: Float => Some(SettlCurrOfferFxRateField(v))
    case v: Double => Some(SettlCurrOfferFxRateField(v.toFloat))
    case v: Int => Some(SettlCurrOfferFxRateField(v.toFloat))
    case v: SettlCurrOfferFxRateField => Some(v)
    case _ => scala.Option.empty[SettlCurrOfferFxRateField]
  } 
}
