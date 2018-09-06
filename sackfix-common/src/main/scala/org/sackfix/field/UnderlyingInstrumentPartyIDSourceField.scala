package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class UnderlyingInstrumentPartyIDSourceField(override val value: String) extends SfFieldString(1060, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1060)UnderlyingInstrumentPartyIDSource=(").append(value).append(")")
}

object UnderlyingInstrumentPartyIDSourceField {
  val TagId = 1060  
  def decode(a: Option[Any]) : Option[UnderlyingInstrumentPartyIDSourceField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingInstrumentPartyIDSourceField]
  }

  def decode(a: Any) : Option[UnderlyingInstrumentPartyIDSourceField] = a match {
    case v: String => Some(UnderlyingInstrumentPartyIDSourceField(v))
    case v: Char => Some(UnderlyingInstrumentPartyIDSourceField(v.toString))
    case v: UnderlyingInstrumentPartyIDSourceField => Some(v)
    case _ => scala.Option.empty[UnderlyingInstrumentPartyIDSourceField]
  } 
}
