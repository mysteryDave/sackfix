package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180821
  */
case class OriginalNotionalPercentageOutstandingField(override val value: Float) extends SfFieldFloat(1452, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1452)OriginalNotionalPercentageOutstanding=(").append(value).append(")")
}

object OriginalNotionalPercentageOutstandingField {
  val TagId = 1452  
  def apply(value: String) = try {
    new OriginalNotionalPercentageOutstandingField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new OriginalNotionalPercentageOutstanding("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[OriginalNotionalPercentageOutstandingField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[OriginalNotionalPercentageOutstandingField]
  }

  def decode(a: Any) : Option[OriginalNotionalPercentageOutstandingField] = a match {
    case v: String => Some(OriginalNotionalPercentageOutstandingField(v))
    case v: Float => Some(OriginalNotionalPercentageOutstandingField(v))
    case v: Double => Some(OriginalNotionalPercentageOutstandingField(v.toFloat))
    case v: Int => Some(OriginalNotionalPercentageOutstandingField(v.toFloat))
    case v: OriginalNotionalPercentageOutstandingField => Some(v)
    case _ => scala.Option.empty[OriginalNotionalPercentageOutstandingField]
  } 
}
