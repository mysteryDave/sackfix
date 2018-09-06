package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class UnderlyingSecurityIDField(override val value: String) extends SfFieldString(309, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(309)UnderlyingSecurityID=(").append(value).append(")")
}

object UnderlyingSecurityIDField {
  val TagId = 309  
  def decode(a: Option[Any]) : Option[UnderlyingSecurityIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingSecurityIDField]
  }

  def decode(a: Any) : Option[UnderlyingSecurityIDField] = a match {
    case v: String => Some(UnderlyingSecurityIDField(v))
    case v: UnderlyingSecurityIDField => Some(v)
    case _ => scala.Option.empty[UnderlyingSecurityIDField]
  } 
}
