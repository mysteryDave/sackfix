package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180821
  */
case class TotNumTradeReportsField(override val value: Int) extends SfFieldInt(748, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(748)TotNumTradeReports=(").append(value).append(")")
}

object TotNumTradeReportsField {
  val TagId = 748  
  def apply(value: String) = try {
    new TotNumTradeReportsField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new TotNumTradeReports("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[TotNumTradeReportsField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[TotNumTradeReportsField]
  }

  def decode(a: Any) : Option[TotNumTradeReportsField] = a match {
    case v: String => Some(TotNumTradeReportsField(v))
    case v: Int => Some(TotNumTradeReportsField(v))
    case v: TotNumTradeReportsField => Some(v)
    case _ => scala.Option.empty[TotNumTradeReportsField]
  } 
}
