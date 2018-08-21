package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180821
  */
case class SettlPartySubIDField(override val value: String) extends SfFieldString(785, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(785)SettlPartySubID=(").append(value).append(")")
}

object SettlPartySubIDField {
  val TagId = 785  
  def decode(a: Option[Any]) : Option[SettlPartySubIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SettlPartySubIDField]
  }

  def decode(a: Any) : Option[SettlPartySubIDField] = a match {
    case v: String => Some(SettlPartySubIDField(v))
    case v: SettlPartySubIDField => Some(v)
    case _ => scala.Option.empty[SettlPartySubIDField]
  } 
}
