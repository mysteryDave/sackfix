package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180821
  */
case class ReportedPxField(override val value: Float) extends SfFieldFloat(861, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(861)ReportedPx=(").append(value).append(")")
}

object ReportedPxField {
  val TagId = 861  
  def apply(value: String) = try {
    new ReportedPxField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new ReportedPx("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[ReportedPxField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ReportedPxField]
  }

  def decode(a: Any) : Option[ReportedPxField] = a match {
    case v: String => Some(ReportedPxField(v))
    case v: Float => Some(ReportedPxField(v))
    case v: Double => Some(ReportedPxField(v.toFloat))
    case v: Int => Some(ReportedPxField(v.toFloat))
    case v: ReportedPxField => Some(v)
    case _ => scala.Option.empty[ReportedPxField]
  } 
}
