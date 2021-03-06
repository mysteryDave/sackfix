package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class UnderlyingStrikeCurrencyField(override val value: String) extends SfFieldString(941, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(941)UnderlyingStrikeCurrency=(").append(value).append(")")
}

object UnderlyingStrikeCurrencyField {
  val TagId = 941  
  def decode(a: Option[Any]) : Option[UnderlyingStrikeCurrencyField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingStrikeCurrencyField]
  }

  def decode(a: Any) : Option[UnderlyingStrikeCurrencyField] = a match {
    case v: String => Some(UnderlyingStrikeCurrencyField(v))
    case v: UnderlyingStrikeCurrencyField => Some(v)
    case _ => scala.Option.empty[UnderlyingStrikeCurrencyField]
  } 
}
