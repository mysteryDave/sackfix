package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class UnderlyingLegSecuritySubTypeField(override val value: String) extends SfFieldString(1338, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1338)UnderlyingLegSecuritySubType=(").append(value).append(")")
}

object UnderlyingLegSecuritySubTypeField {
  val TagId = 1338  
  def decode(a: Option[Any]) : Option[UnderlyingLegSecuritySubTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingLegSecuritySubTypeField]
  }

  def decode(a: Any) : Option[UnderlyingLegSecuritySubTypeField] = a match {
    case v: String => Some(UnderlyingLegSecuritySubTypeField(v))
    case v: UnderlyingLegSecuritySubTypeField => Some(v)
    case _ => scala.Option.empty[UnderlyingLegSecuritySubTypeField]
  } 
}
