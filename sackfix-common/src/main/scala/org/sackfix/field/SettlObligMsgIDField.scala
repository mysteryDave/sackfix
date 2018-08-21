package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180821
  */
case class SettlObligMsgIDField(override val value: String) extends SfFieldString(1160, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1160)SettlObligMsgID=(").append(value).append(")")
}

object SettlObligMsgIDField {
  val TagId = 1160  
  def decode(a: Option[Any]) : Option[SettlObligMsgIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SettlObligMsgIDField]
  }

  def decode(a: Any) : Option[SettlObligMsgIDField] = a match {
    case v: String => Some(SettlObligMsgIDField(v))
    case v: SettlObligMsgIDField => Some(v)
    case _ => scala.Option.empty[SettlObligMsgIDField]
  } 
}
