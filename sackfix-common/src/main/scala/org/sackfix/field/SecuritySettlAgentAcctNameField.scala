package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class SecuritySettlAgentAcctNameField(override val value: String) extends SfFieldString(179, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(179)SecuritySettlAgentAcctName=(").append(value).append(")")
}

object SecuritySettlAgentAcctNameField {
  val TagId = 179  
  def decode(a: Option[Any]) : Option[SecuritySettlAgentAcctNameField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SecuritySettlAgentAcctNameField]
  }

  def decode(a: Any) : Option[SecuritySettlAgentAcctNameField] = a match {
    case v: String => Some(SecuritySettlAgentAcctNameField(v))
    case v: SecuritySettlAgentAcctNameField => Some(v)
    case _ => scala.Option.empty[SecuritySettlAgentAcctNameField]
  } 
}
