package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180821
  */
case class QuoteStatusReqIDField(override val value: String) extends SfFieldString(649, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(649)QuoteStatusReqID=(").append(value).append(")")
}

object QuoteStatusReqIDField {
  val TagId = 649  
  def decode(a: Option[Any]) : Option[QuoteStatusReqIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[QuoteStatusReqIDField]
  }

  def decode(a: Any) : Option[QuoteStatusReqIDField] = a match {
    case v: String => Some(QuoteStatusReqIDField(v))
    case v: QuoteStatusReqIDField => Some(v)
    case _ => scala.Option.empty[QuoteStatusReqIDField]
  } 
}
