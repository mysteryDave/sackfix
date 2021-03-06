package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class SecondaryFirmTradeIDField(override val value: String) extends SfFieldString(1042, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1042)SecondaryFirmTradeID=(").append(value).append(")")
}

object SecondaryFirmTradeIDField {
  val TagId = 1042  
  def decode(a: Option[Any]) : Option[SecondaryFirmTradeIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SecondaryFirmTradeIDField]
  }

  def decode(a: Any) : Option[SecondaryFirmTradeIDField] = a match {
    case v: String => Some(SecondaryFirmTradeIDField(v))
    case v: SecondaryFirmTradeIDField => Some(v)
    case _ => scala.Option.empty[SecondaryFirmTradeIDField]
  } 
}
