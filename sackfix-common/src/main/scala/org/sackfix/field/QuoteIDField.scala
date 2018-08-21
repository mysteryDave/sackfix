package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180821
  */
case class QuoteIDField(override val value: String) extends SfFieldString(117, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(117)QuoteID=(").append(value).append(")")
}

object QuoteIDField {
  val TagId = 117  
  def decode(a: Option[Any]) : Option[QuoteIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[QuoteIDField]
  }

  def decode(a: Any) : Option[QuoteIDField] = a match {
    case v: String => Some(QuoteIDField(v))
    case v: QuoteIDField => Some(v)
    case _ => scala.Option.empty[QuoteIDField]
  } 
}
