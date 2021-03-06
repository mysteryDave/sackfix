package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class SecondaryTradeReportRefIDField(override val value: String) extends SfFieldString(881, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(881)SecondaryTradeReportRefID=(").append(value).append(")")
}

object SecondaryTradeReportRefIDField {
  val TagId = 881  
  def decode(a: Option[Any]) : Option[SecondaryTradeReportRefIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SecondaryTradeReportRefIDField]
  }

  def decode(a: Any) : Option[SecondaryTradeReportRefIDField] = a match {
    case v: String => Some(SecondaryTradeReportRefIDField(v))
    case v: SecondaryTradeReportRefIDField => Some(v)
    case _ => scala.Option.empty[SecondaryTradeReportRefIDField]
  } 
}
