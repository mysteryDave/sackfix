package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class FirmTradeIDField(override val value: String) extends SfFieldString(1041, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1041)FirmTradeID=(").append(value).append(")")
}

object FirmTradeIDField {
  val TagId = 1041  
  def decode(a: Option[Any]) : Option[FirmTradeIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[FirmTradeIDField]
  }

  def decode(a: Any) : Option[FirmTradeIDField] = a match {
    case v: String => Some(FirmTradeIDField(v))
    case v: FirmTradeIDField => Some(v)
    case _ => scala.Option.empty[FirmTradeIDField]
  } 
}
