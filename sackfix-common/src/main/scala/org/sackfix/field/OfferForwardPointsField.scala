package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180902
  */
case class OfferForwardPointsField(override val value: Float) extends SfFieldFloat(191, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(191)OfferForwardPoints=(").append(value).append(")")
}

object OfferForwardPointsField {
  val TagId = 191  
  def apply(value: String) = try {
    new OfferForwardPointsField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new OfferForwardPoints("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[OfferForwardPointsField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[OfferForwardPointsField]
  }

  def decode(a: Any) : Option[OfferForwardPointsField] = a match {
    case v: String => Some(OfferForwardPointsField(v))
    case v: Float => Some(OfferForwardPointsField(v))
    case v: Double => Some(OfferForwardPointsField(v.toFloat))
    case v: Int => Some(OfferForwardPointsField(v.toFloat))
    case v: OfferForwardPointsField => Some(v)
    case _ => scala.Option.empty[OfferForwardPointsField]
  } 
}
