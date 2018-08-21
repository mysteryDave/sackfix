package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180821
  */
case class DerivativeSecuritySubTypeField(override val value: String) extends SfFieldString(1250, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1250)DerivativeSecuritySubType=(").append(value).append(")")
}

object DerivativeSecuritySubTypeField {
  val TagId = 1250  
  def decode(a: Option[Any]) : Option[DerivativeSecuritySubTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DerivativeSecuritySubTypeField]
  }

  def decode(a: Any) : Option[DerivativeSecuritySubTypeField] = a match {
    case v: String => Some(DerivativeSecuritySubTypeField(v))
    case v: DerivativeSecuritySubTypeField => Some(v)
    case _ => scala.Option.empty[DerivativeSecuritySubTypeField]
  } 
}
