package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class SettlInstMsgIDField(override val value: String) extends SfFieldString(777, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(777)SettlInstMsgID=(").append(value).append(")")
}

object SettlInstMsgIDField {
  val TagId = 777  
  def decode(a: Option[Any]) : Option[SettlInstMsgIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SettlInstMsgIDField]
  }

  def decode(a: Any) : Option[SettlInstMsgIDField] = a match {
    case v: String => Some(SettlInstMsgIDField(v))
    case v: SettlInstMsgIDField => Some(v)
    case _ => scala.Option.empty[SettlInstMsgIDField]
  } 
}
