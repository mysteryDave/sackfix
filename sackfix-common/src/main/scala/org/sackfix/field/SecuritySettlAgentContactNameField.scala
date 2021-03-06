package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class SecuritySettlAgentContactNameField(override val value: String) extends SfFieldString(180, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(180)SecuritySettlAgentContactName=(").append(value).append(")")
}

object SecuritySettlAgentContactNameField {
  val TagId = 180  
  def decode(a: Option[Any]) : Option[SecuritySettlAgentContactNameField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SecuritySettlAgentContactNameField]
  }

  def decode(a: Any) : Option[SecuritySettlAgentContactNameField] = a match {
    case v: String => Some(SecuritySettlAgentContactNameField(v))
    case v: SecuritySettlAgentContactNameField => Some(v)
    case _ => scala.Option.empty[SecuritySettlAgentContactNameField]
  } 
}
