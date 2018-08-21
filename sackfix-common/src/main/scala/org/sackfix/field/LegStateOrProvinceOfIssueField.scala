package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180821
  */
case class LegStateOrProvinceOfIssueField(override val value: String) extends SfFieldString(597, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(597)LegStateOrProvinceOfIssue=(").append(value).append(")")
}

object LegStateOrProvinceOfIssueField {
  val TagId = 597  
  def decode(a: Option[Any]) : Option[LegStateOrProvinceOfIssueField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LegStateOrProvinceOfIssueField]
  }

  def decode(a: Any) : Option[LegStateOrProvinceOfIssueField] = a match {
    case v: String => Some(LegStateOrProvinceOfIssueField(v))
    case v: LegStateOrProvinceOfIssueField => Some(v)
    case _ => scala.Option.empty[LegStateOrProvinceOfIssueField]
  } 
}
