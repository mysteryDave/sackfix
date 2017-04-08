package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class DerivativeSecurityXMLField(override val value: String) extends SfFieldString(1283, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1283)DerivativeSecurityXML=(").append(value).append(")")
}

object DerivativeSecurityXMLField {
  val TagId = 1283  
  def decode(a: Option[Any]) : Option[DerivativeSecurityXMLField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DerivativeSecurityXMLField]
  }

  def decode(a: Any) : Option[DerivativeSecurityXMLField] = a match {
    case v: String => Some(DerivativeSecurityXMLField(v))
    case v: DerivativeSecurityXMLField => Some(v)
    case _ => scala.Option.empty[DerivativeSecurityXMLField]
  } 
}