package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180821
  */
case class PegSecurityDescField(override val value: String) extends SfFieldString(1099, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1099)PegSecurityDesc=(").append(value).append(")")
}

object PegSecurityDescField {
  val TagId = 1099  
  def decode(a: Option[Any]) : Option[PegSecurityDescField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[PegSecurityDescField]
  }

  def decode(a: Any) : Option[PegSecurityDescField] = a match {
    case v: String => Some(PegSecurityDescField(v))
    case v: PegSecurityDescField => Some(v)
    case _ => scala.Option.empty[PegSecurityDescField]
  } 
}
