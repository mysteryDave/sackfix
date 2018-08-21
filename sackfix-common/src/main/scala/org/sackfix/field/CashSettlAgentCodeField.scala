package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180821
  */
case class CashSettlAgentCodeField(override val value: String) extends SfFieldString(183, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(183)CashSettlAgentCode=(").append(value).append(")")
}

object CashSettlAgentCodeField {
  val TagId = 183  
  def decode(a: Option[Any]) : Option[CashSettlAgentCodeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[CashSettlAgentCodeField]
  }

  def decode(a: Any) : Option[CashSettlAgentCodeField] = a match {
    case v: String => Some(CashSettlAgentCodeField(v))
    case v: CashSettlAgentCodeField => Some(v)
    case _ => scala.Option.empty[CashSettlAgentCodeField]
  } 
}
