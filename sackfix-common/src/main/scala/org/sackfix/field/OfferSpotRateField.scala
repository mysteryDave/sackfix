package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180902
  */
case class OfferSpotRateField(override val value: Float) extends SfFieldFloat(190, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(190)OfferSpotRate=(").append(value).append(")")
}

object OfferSpotRateField {
  val TagId = 190  
  def apply(value: String) = try {
    new OfferSpotRateField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new OfferSpotRate("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[OfferSpotRateField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[OfferSpotRateField]
  }

  def decode(a: Any) : Option[OfferSpotRateField] = a match {
    case v: String => Some(OfferSpotRateField(v))
    case v: Float => Some(OfferSpotRateField(v))
    case v: Double => Some(OfferSpotRateField(v.toFloat))
    case v: Int => Some(OfferSpotRateField(v.toFloat))
    case v: OfferSpotRateField => Some(v)
    case _ => scala.Option.empty[OfferSpotRateField]
  } 
}
