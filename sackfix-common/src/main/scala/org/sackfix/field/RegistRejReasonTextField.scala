package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class RegistRejReasonTextField(override val value: String) extends SfFieldString(496, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(496)RegistRejReasonText=(").append(value).append(")")
}

object RegistRejReasonTextField {
  val TagId = 496  
  def decode(a: Option[Any]) : Option[RegistRejReasonTextField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[RegistRejReasonTextField]
  }

  def decode(a: Any) : Option[RegistRejReasonTextField] = a match {
    case v: String => Some(RegistRejReasonTextField(v))
    case v: RegistRejReasonTextField => Some(v)
    case _ => scala.Option.empty[RegistRejReasonTextField]
  } 
}
