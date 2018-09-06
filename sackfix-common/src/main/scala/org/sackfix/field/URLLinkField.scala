package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class URLLinkField(override val value: String) extends SfFieldString(149, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(149)URLLink=(").append(value).append(")")
}

object URLLinkField {
  val TagId = 149  
  def decode(a: Option[Any]) : Option[URLLinkField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[URLLinkField]
  }

  def decode(a: Any) : Option[URLLinkField] = a match {
    case v: String => Some(URLLinkField(v))
    case v: URLLinkField => Some(v)
    case _ => scala.Option.empty[URLLinkField]
  } 
}
