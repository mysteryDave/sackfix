package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180902
  */
case class TotNoRejQuotesField(override val value: Int) extends SfFieldInt(1170, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1170)TotNoRejQuotes=(").append(value).append(")")
}

object TotNoRejQuotesField {
  val TagId = 1170  
  def apply(value: String) = try {
    new TotNoRejQuotesField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new TotNoRejQuotes("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[TotNoRejQuotesField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[TotNoRejQuotesField]
  }

  def decode(a: Any) : Option[TotNoRejQuotesField] = a match {
    case v: String => Some(TotNoRejQuotesField(v))
    case v: Int => Some(TotNoRejQuotesField(v))
    case v: TotNoRejQuotesField => Some(v)
    case _ => scala.Option.empty[TotNoRejQuotesField]
  } 
}
