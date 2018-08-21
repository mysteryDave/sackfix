package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180821
  */
case class CashDistribAgentNameField(override val value: String) extends SfFieldString(498, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(498)CashDistribAgentName=(").append(value).append(")")
}

object CashDistribAgentNameField {
  val TagId = 498  
  def decode(a: Option[Any]) : Option[CashDistribAgentNameField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[CashDistribAgentNameField]
  }

  def decode(a: Any) : Option[CashDistribAgentNameField] = a match {
    case v: String => Some(CashDistribAgentNameField(v))
    case v: CashDistribAgentNameField => Some(v)
    case _ => scala.Option.empty[CashDistribAgentNameField]
  } 
}
