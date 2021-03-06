package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class UnderlyingSecurityDescField(override val value: String) extends SfFieldString(307, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(307)UnderlyingSecurityDesc=(").append(value).append(")")
}

object UnderlyingSecurityDescField {
  val TagId = 307  
  def decode(a: Option[Any]) : Option[UnderlyingSecurityDescField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingSecurityDescField]
  }

  def decode(a: Any) : Option[UnderlyingSecurityDescField] = a match {
    case v: String => Some(UnderlyingSecurityDescField(v))
    case v: UnderlyingSecurityDescField => Some(v)
    case _ => scala.Option.empty[UnderlyingSecurityDescField]
  } 
}
