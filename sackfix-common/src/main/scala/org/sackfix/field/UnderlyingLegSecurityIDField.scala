package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180821
  */
case class UnderlyingLegSecurityIDField(override val value: String) extends SfFieldString(1332, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1332)UnderlyingLegSecurityID=(").append(value).append(")")
}

object UnderlyingLegSecurityIDField {
  val TagId = 1332  
  def decode(a: Option[Any]) : Option[UnderlyingLegSecurityIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingLegSecurityIDField]
  }

  def decode(a: Any) : Option[UnderlyingLegSecurityIDField] = a match {
    case v: String => Some(UnderlyingLegSecurityIDField(v))
    case v: UnderlyingLegSecurityIDField => Some(v)
    case _ => scala.Option.empty[UnderlyingLegSecurityIDField]
  } 
}
