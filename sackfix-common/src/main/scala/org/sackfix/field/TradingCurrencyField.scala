package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class TradingCurrencyField(override val value: String) extends SfFieldString(1245, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1245)TradingCurrency=(").append(value).append(")")
}

object TradingCurrencyField {
  val TagId = 1245  
  def decode(a: Option[Any]) : Option[TradingCurrencyField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[TradingCurrencyField]
  }

  def decode(a: Any) : Option[TradingCurrencyField] = a match {
    case v: String => Some(TradingCurrencyField(v))
    case v: TradingCurrencyField => Some(v)
    case _ => scala.Option.empty[TradingCurrencyField]
  } 
}
