package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180902
  */
case class TotNoQuoteEntriesField(override val value: Int) extends SfFieldInt(304, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(304)TotNoQuoteEntries=(").append(value).append(")")
}

object TotNoQuoteEntriesField {
  val TagId = 304  
  def apply(value: String) = try {
    new TotNoQuoteEntriesField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new TotNoQuoteEntries("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[TotNoQuoteEntriesField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[TotNoQuoteEntriesField]
  }

  def decode(a: Any) : Option[TotNoQuoteEntriesField] = a match {
    case v: String => Some(TotNoQuoteEntriesField(v))
    case v: Int => Some(TotNoQuoteEntriesField(v))
    case v: TotNoQuoteEntriesField => Some(v)
    case _ => scala.Option.empty[TotNoQuoteEntriesField]
  } 
}
