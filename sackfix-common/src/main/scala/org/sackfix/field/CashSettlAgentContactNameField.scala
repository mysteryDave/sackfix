package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180821
  */
case class CashSettlAgentContactNameField(override val value: String) extends SfFieldString(186, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(186)CashSettlAgentContactName=(").append(value).append(")")
}

object CashSettlAgentContactNameField {
  val TagId = 186  
  def decode(a: Option[Any]) : Option[CashSettlAgentContactNameField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[CashSettlAgentContactNameField]
  }

  def decode(a: Any) : Option[CashSettlAgentContactNameField] = a match {
    case v: String => Some(CashSettlAgentContactNameField(v))
    case v: CashSettlAgentContactNameField => Some(v)
    case _ => scala.Option.empty[CashSettlAgentContactNameField]
  } 
}
