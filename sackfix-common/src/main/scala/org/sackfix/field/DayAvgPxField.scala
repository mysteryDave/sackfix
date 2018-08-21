package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180821
  */
case class DayAvgPxField(override val value: Float) extends SfFieldFloat(426, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(426)DayAvgPx=(").append(value).append(")")
}

object DayAvgPxField {
  val TagId = 426  
  def apply(value: String) = try {
    new DayAvgPxField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new DayAvgPx("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[DayAvgPxField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DayAvgPxField]
  }

  def decode(a: Any) : Option[DayAvgPxField] = a match {
    case v: String => Some(DayAvgPxField(v))
    case v: Float => Some(DayAvgPxField(v))
    case v: Double => Some(DayAvgPxField(v.toFloat))
    case v: Int => Some(DayAvgPxField(v.toFloat))
    case v: DayAvgPxField => Some(v)
    case _ => scala.Option.empty[DayAvgPxField]
  } 
}
