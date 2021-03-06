package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldBoolean

/**
  * Generated by SackFix code generator on 20180902
  */
case class ReportedPxDiffField(override val value: Boolean) extends SfFieldBoolean(1134, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1134)ReportedPxDiff=(").append({if (value) "Y" else "N"}).append(")")
}

object ReportedPxDiffField {
  val TagId = 1134  
  def apply(value: String) = try {
    new ReportedPxDiffField(value match {
      case "Y" => true
      case "N" => false
      case _ => throw new IllegalArgumentException("ReportedPxDiff.apply("+value+"] failed, bad value, expected Y or N.")
    })
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new ReportedPxDiff("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[ReportedPxDiffField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ReportedPxDiffField]
  }

  def decode(a: Any) : Option[ReportedPxDiffField] = a match {
    case v: String => Some(ReportedPxDiffField(v))
    case v: Boolean => Some(ReportedPxDiffField(v))
    case v: ReportedPxDiffField => Some(v)
    case _ => scala.Option.empty[ReportedPxDiffField]
  } 
}
