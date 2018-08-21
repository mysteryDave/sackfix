package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180821
  */
case class CashDistribAgentAcctNumberField(override val value: String) extends SfFieldString(500, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(500)CashDistribAgentAcctNumber=(").append(value).append(")")
}

object CashDistribAgentAcctNumberField {
  val TagId = 500  
  def decode(a: Option[Any]) : Option[CashDistribAgentAcctNumberField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[CashDistribAgentAcctNumberField]
  }

  def decode(a: Any) : Option[CashDistribAgentAcctNumberField] = a match {
    case v: String => Some(CashDistribAgentAcctNumberField(v))
    case v: CashDistribAgentAcctNumberField => Some(v)
    case _ => scala.Option.empty[CashDistribAgentAcctNumberField]
  } 
}
