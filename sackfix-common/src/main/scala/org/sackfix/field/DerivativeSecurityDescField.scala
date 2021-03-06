package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class DerivativeSecurityDescField(override val value: String) extends SfFieldString(1279, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1279)DerivativeSecurityDesc=(").append(value).append(")")
}

object DerivativeSecurityDescField {
  val TagId = 1279  
  def decode(a: Option[Any]) : Option[DerivativeSecurityDescField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DerivativeSecurityDescField]
  }

  def decode(a: Any) : Option[DerivativeSecurityDescField] = a match {
    case v: String => Some(DerivativeSecurityDescField(v))
    case v: DerivativeSecurityDescField => Some(v)
    case _ => scala.Option.empty[DerivativeSecurityDescField]
  } 
}
