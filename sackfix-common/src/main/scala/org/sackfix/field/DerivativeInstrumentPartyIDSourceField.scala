package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class DerivativeInstrumentPartyIDSourceField(override val value: String) extends SfFieldString(1294, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1294)DerivativeInstrumentPartyIDSource=(").append(value).append(")")
}

object DerivativeInstrumentPartyIDSourceField {
  val TagId = 1294  
  def decode(a: Option[Any]) : Option[DerivativeInstrumentPartyIDSourceField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DerivativeInstrumentPartyIDSourceField]
  }

  def decode(a: Any) : Option[DerivativeInstrumentPartyIDSourceField] = a match {
    case v: String => Some(DerivativeInstrumentPartyIDSourceField(v))
    case v: DerivativeInstrumentPartyIDSourceField => Some(v)
    case _ => scala.Option.empty[DerivativeInstrumentPartyIDSourceField]
  } 
}
