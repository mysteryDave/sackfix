package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class HeadlineField(override val value: String) extends SfFieldString(148, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(148)Headline=(").append(value).append(")")
}

object HeadlineField {
  val TagId = 148  
  def decode(a: Option[Any]) : Option[HeadlineField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[HeadlineField]
  }

  def decode(a: Any) : Option[HeadlineField] = a match {
    case v: String => Some(HeadlineField(v))
    case v: HeadlineField => Some(v)
    case _ => scala.Option.empty[HeadlineField]
  } 
}
