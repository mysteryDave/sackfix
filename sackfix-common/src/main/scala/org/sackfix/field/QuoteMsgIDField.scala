package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class QuoteMsgIDField(override val value: String) extends SfFieldString(1166, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1166)QuoteMsgID=(").append(value).append(")")
}

object QuoteMsgIDField {
  val TagId = 1166  
  def decode(a: Option[Any]) : Option[QuoteMsgIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[QuoteMsgIDField]
  }

  def decode(a: Any) : Option[QuoteMsgIDField] = a match {
    case v: String => Some(QuoteMsgIDField(v))
    case v: QuoteMsgIDField => Some(v)
    case _ => scala.Option.empty[QuoteMsgIDField]
  } 
}
