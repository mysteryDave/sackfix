package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class EncodedHeadlineField(override val value: String) extends SfFieldString(359, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(359)EncodedHeadline=(").append(value).append(")")
}

object EncodedHeadlineField {
  val TagId = 359  
  def decode(a: Option[Any]) : Option[EncodedHeadlineField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[EncodedHeadlineField]
  }

  def decode(a: Any) : Option[EncodedHeadlineField] = a match {
    case v: String => Some(EncodedHeadlineField(v))
    case v: EncodedHeadlineField => Some(v)
    case _ => scala.Option.empty[EncodedHeadlineField]
  } 
}