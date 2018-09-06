package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180902
  */
case class MarginRatioField(override val value: Float) extends SfFieldFloat(898, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(898)MarginRatio=(").append(value).append(")")
}

object MarginRatioField {
  val TagId = 898  
  def apply(value: String) = try {
    new MarginRatioField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new MarginRatio("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[MarginRatioField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[MarginRatioField]
  }

  def decode(a: Any) : Option[MarginRatioField] = a match {
    case v: String => Some(MarginRatioField(v))
    case v: Float => Some(MarginRatioField(v))
    case v: Double => Some(MarginRatioField(v.toFloat))
    case v: Int => Some(MarginRatioField(v.toFloat))
    case v: MarginRatioField => Some(v)
    case _ => scala.Option.empty[MarginRatioField]
  } 
}
