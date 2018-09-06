package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class TradeReportTransTypeStringField(override val value: String) extends SfFieldString(487, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(487)TradeReportTransTypeString=(").append(value).append(")")
}

object TradeReportTransTypeStringField {
  val TagId = 487  
  def decode(a: Option[Any]) : Option[TradeReportTransTypeStringField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[TradeReportTransTypeStringField]
  }

  def decode(a: Any) : Option[TradeReportTransTypeStringField] = a match {
    case v: String => Some(TradeReportTransTypeStringField(v))
    case v: Char => Some(TradeReportTransTypeStringField(v.toString))
    case v: TradeReportTransTypeStringField => Some(v)
    case _ => scala.Option.empty[TradeReportTransTypeStringField]
  } 
}
