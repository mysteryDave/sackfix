package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class SecurityXMLDataField(override val value: String) extends SfFieldString(1185, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1185)SecurityXMLData=(").append(value).append(")")
}

object SecurityXMLDataField {
  val TagId = 1185  
  def decode(a: Option[Any]) : Option[SecurityXMLDataField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SecurityXMLDataField]
  }

  def decode(a: Any) : Option[SecurityXMLDataField] = a match {
    case v: String => Some(SecurityXMLDataField(v))
    case v: SecurityXMLDataField => Some(v)
    case _ => scala.Option.empty[SecurityXMLDataField]
  } 
}
