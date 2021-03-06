package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class MassActionReportIDField(override val value: String) extends SfFieldString(1369, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1369)MassActionReportID=(").append(value).append(")")
}

object MassActionReportIDField {
  val TagId = 1369  
  def decode(a: Option[Any]) : Option[MassActionReportIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[MassActionReportIDField]
  }

  def decode(a: Any) : Option[MassActionReportIDField] = a match {
    case v: String => Some(MassActionReportIDField(v))
    case v: MassActionReportIDField => Some(v)
    case _ => scala.Option.empty[MassActionReportIDField]
  } 
}
