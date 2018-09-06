package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class SecurityDescField(override val value: String) extends SfFieldString(107, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(107)SecurityDesc=(").append(value).append(")")
}

object SecurityDescField {
  val TagId = 107  
  def decode(a: Option[Any]) : Option[SecurityDescField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SecurityDescField]
  }

  def decode(a: Any) : Option[SecurityDescField] = a match {
    case v: String => Some(SecurityDescField(v))
    case v: SecurityDescField => Some(v)
    case _ => scala.Option.empty[SecurityDescField]
  } 
}
