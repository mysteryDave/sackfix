package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180902
  */
case class TotNoCxldQuotesField(override val value: Int) extends SfFieldInt(1168, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1168)TotNoCxldQuotes=(").append(value).append(")")
}

object TotNoCxldQuotesField {
  val TagId = 1168  
  def apply(value: String) = try {
    new TotNoCxldQuotesField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new TotNoCxldQuotes("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[TotNoCxldQuotesField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[TotNoCxldQuotesField]
  }

  def decode(a: Any) : Option[TotNoCxldQuotesField] = a match {
    case v: String => Some(TotNoCxldQuotesField(v))
    case v: Int => Some(TotNoCxldQuotesField(v))
    case v: TotNoCxldQuotesField => Some(v)
    case _ => scala.Option.empty[TotNoCxldQuotesField]
  } 
}
