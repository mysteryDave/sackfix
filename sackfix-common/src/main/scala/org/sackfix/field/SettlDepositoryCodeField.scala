package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class SettlDepositoryCodeField(override val value: String) extends SfFieldString(173, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(173)SettlDepositoryCode=(").append(value).append(")")
}

object SettlDepositoryCodeField {
  val TagId = 173  
  def decode(a: Option[Any]) : Option[SettlDepositoryCodeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SettlDepositoryCodeField]
  }

  def decode(a: Any) : Option[SettlDepositoryCodeField] = a match {
    case v: String => Some(SettlDepositoryCodeField(v))
    case v: SettlDepositoryCodeField => Some(v)
    case _ => scala.Option.empty[SettlDepositoryCodeField]
  } 
}
