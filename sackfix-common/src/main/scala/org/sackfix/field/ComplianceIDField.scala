package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class ComplianceIDField(override val value: String) extends SfFieldString(376, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(376)ComplianceID=(").append(value).append(")")
}

object ComplianceIDField {
  val TagId = 376  
  def decode(a: Option[Any]) : Option[ComplianceIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ComplianceIDField]
  }

  def decode(a: Any) : Option[ComplianceIDField] = a match {
    case v: String => Some(ComplianceIDField(v))
    case v: ComplianceIDField => Some(v)
    case _ => scala.Option.empty[ComplianceIDField]
  } 
}
