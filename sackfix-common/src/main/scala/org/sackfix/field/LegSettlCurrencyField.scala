package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180821
  */
case class LegSettlCurrencyField(override val value: String) extends SfFieldString(675, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(675)LegSettlCurrency=(").append(value).append(")")
}

object LegSettlCurrencyField {
  val TagId = 675  
  def decode(a: Option[Any]) : Option[LegSettlCurrencyField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LegSettlCurrencyField]
  }

  def decode(a: Any) : Option[LegSettlCurrencyField] = a match {
    case v: String => Some(LegSettlCurrencyField(v))
    case v: LegSettlCurrencyField => Some(v)
    case _ => scala.Option.empty[LegSettlCurrencyField]
  } 
}
