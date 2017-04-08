package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170404
  */
case class TotalVolumeTradedField(override val value: Float) extends SfFieldFloat(387, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(387)TotalVolumeTraded=(").append(value).append(")")
}

object TotalVolumeTradedField {
  val TagId = 387  
  def apply(value: String) = try {
    new TotalVolumeTradedField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new TotalVolumeTraded("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[TotalVolumeTradedField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[TotalVolumeTradedField]
  }

  def decode(a: Any) : Option[TotalVolumeTradedField] = a match {
    case v: String => Some(TotalVolumeTradedField(v))
    case v: Float => Some(TotalVolumeTradedField(v))
    case v: Double => Some(TotalVolumeTradedField(v.toFloat))
    case v: Int => Some(TotalVolumeTradedField(v.toFloat))
    case v: TotalVolumeTradedField => Some(v)
    case _ => scala.Option.empty[TotalVolumeTradedField]
  } 
}