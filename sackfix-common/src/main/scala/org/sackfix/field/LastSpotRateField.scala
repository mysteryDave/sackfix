package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180821
  */
case class LastSpotRateField(override val value: Float) extends SfFieldFloat(194, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(194)LastSpotRate=(").append(value).append(")")
}

object LastSpotRateField {
  val TagId = 194  
  def apply(value: String) = try {
    new LastSpotRateField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new LastSpotRate("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[LastSpotRateField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LastSpotRateField]
  }

  def decode(a: Any) : Option[LastSpotRateField] = a match {
    case v: String => Some(LastSpotRateField(v))
    case v: Float => Some(LastSpotRateField(v))
    case v: Double => Some(LastSpotRateField(v.toFloat))
    case v: Int => Some(LastSpotRateField(v.toFloat))
    case v: LastSpotRateField => Some(v)
    case _ => scala.Option.empty[LastSpotRateField]
  } 
}
