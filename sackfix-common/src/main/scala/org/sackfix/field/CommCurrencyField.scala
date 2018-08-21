package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180821
  */
case class CommCurrencyField(override val value: String) extends SfFieldString(479, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(479)CommCurrency=(").append(value).append(")")
}

object CommCurrencyField {
  val TagId = 479  
  def decode(a: Option[Any]) : Option[CommCurrencyField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[CommCurrencyField]
  }

  def decode(a: Any) : Option[CommCurrencyField] = a match {
    case v: String => Some(CommCurrencyField(v))
    case v: CommCurrencyField => Some(v)
    case _ => scala.Option.empty[CommCurrencyField]
  } 
}
