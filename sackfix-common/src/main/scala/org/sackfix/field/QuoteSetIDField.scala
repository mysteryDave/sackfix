package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class QuoteSetIDField(override val value: String) extends SfFieldString(302, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(302)QuoteSetID=(").append(value).append(")")
}

object QuoteSetIDField {
  val TagId = 302  
  def decode(a: Option[Any]) : Option[QuoteSetIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[QuoteSetIDField]
  }

  def decode(a: Any) : Option[QuoteSetIDField] = a match {
    case v: String => Some(QuoteSetIDField(v))
    case v: QuoteSetIDField => Some(v)
    case _ => scala.Option.empty[QuoteSetIDField]
  } 
}
