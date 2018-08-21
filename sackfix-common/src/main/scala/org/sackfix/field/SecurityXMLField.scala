package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180821
  */
case class SecurityXMLField(override val value: String) extends SfFieldString(1185, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1185)SecurityXML=(").append(value).append(")")
}

object SecurityXMLField {
  val TagId = 1185  
  def decode(a: Option[Any]) : Option[SecurityXMLField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SecurityXMLField]
  }

  def decode(a: Any) : Option[SecurityXMLField] = a match {
    case v: String => Some(SecurityXMLField(v))
    case v: SecurityXMLField => Some(v)
    case _ => scala.Option.empty[SecurityXMLField]
  } 
}
