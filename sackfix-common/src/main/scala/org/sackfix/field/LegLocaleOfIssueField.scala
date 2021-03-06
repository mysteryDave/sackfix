package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class LegLocaleOfIssueField(override val value: String) extends SfFieldString(598, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(598)LegLocaleOfIssue=(").append(value).append(")")
}

object LegLocaleOfIssueField {
  val TagId = 598  
  def decode(a: Option[Any]) : Option[LegLocaleOfIssueField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LegLocaleOfIssueField]
  }

  def decode(a: Any) : Option[LegLocaleOfIssueField] = a match {
    case v: String => Some(LegLocaleOfIssueField(v))
    case v: LegLocaleOfIssueField => Some(v)
    case _ => scala.Option.empty[LegLocaleOfIssueField]
  } 
}
