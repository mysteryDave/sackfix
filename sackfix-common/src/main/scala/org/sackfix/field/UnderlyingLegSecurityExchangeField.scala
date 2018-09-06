package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class UnderlyingLegSecurityExchangeField(override val value: String) extends SfFieldString(1341, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1341)UnderlyingLegSecurityExchange=(").append(value).append(")")
}

object UnderlyingLegSecurityExchangeField {
  val TagId = 1341  
  def decode(a: Option[Any]) : Option[UnderlyingLegSecurityExchangeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingLegSecurityExchangeField]
  }

  def decode(a: Any) : Option[UnderlyingLegSecurityExchangeField] = a match {
    case v: String => Some(UnderlyingLegSecurityExchangeField(v))
    case v: UnderlyingLegSecurityExchangeField => Some(v)
    case _ => scala.Option.empty[UnderlyingLegSecurityExchangeField]
  } 
}
