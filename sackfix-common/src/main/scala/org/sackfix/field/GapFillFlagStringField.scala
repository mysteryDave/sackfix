package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class GapFillFlagStringField(override val value: String) extends SfFieldString(123, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(123)GapFillFlagString=(").append(value).append(")")
}

object GapFillFlagStringField {
  val TagId = 123  
  def decode(a: Option[Any]) : Option[GapFillFlagStringField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[GapFillFlagStringField]
  }

  def decode(a: Any) : Option[GapFillFlagStringField] = a match {
    case v: String => Some(GapFillFlagStringField(v))
    case v: GapFillFlagStringField => Some(v)
    case _ => scala.Option.empty[GapFillFlagStringField]
  } 
}