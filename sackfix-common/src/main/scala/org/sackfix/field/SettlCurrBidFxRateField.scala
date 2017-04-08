package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170404
  */
case class SettlCurrBidFxRateField(override val value: Float) extends SfFieldFloat(656, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(656)SettlCurrBidFxRate=(").append(value).append(")")
}

object SettlCurrBidFxRateField {
  val TagId = 656  
  def apply(value: String) = try {
    new SettlCurrBidFxRateField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new SettlCurrBidFxRate("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[SettlCurrBidFxRateField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SettlCurrBidFxRateField]
  }

  def decode(a: Any) : Option[SettlCurrBidFxRateField] = a match {
    case v: String => Some(SettlCurrBidFxRateField(v))
    case v: Float => Some(SettlCurrBidFxRateField(v))
    case v: Double => Some(SettlCurrBidFxRateField(v.toFloat))
    case v: Int => Some(SettlCurrBidFxRateField(v.toFloat))
    case v: SettlCurrBidFxRateField => Some(v)
    case _ => scala.Option.empty[SettlCurrBidFxRateField]
  } 
}