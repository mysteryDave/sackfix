package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class CashDistribAgentAcctNameField(override val value: String) extends SfFieldString(502, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(502)CashDistribAgentAcctName=(").append(value).append(")")
}

object CashDistribAgentAcctNameField {
  val TagId = 502  
  def decode(a: Option[Any]) : Option[CashDistribAgentAcctNameField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[CashDistribAgentAcctNameField]
  }

  def decode(a: Any) : Option[CashDistribAgentAcctNameField] = a match {
    case v: String => Some(CashDistribAgentAcctNameField(v))
    case v: CashDistribAgentAcctNameField => Some(v)
    case _ => scala.Option.empty[CashDistribAgentAcctNameField]
  } 
}
