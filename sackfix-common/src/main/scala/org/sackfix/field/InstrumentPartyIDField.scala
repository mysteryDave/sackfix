package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180821
  */
case class InstrumentPartyIDField(override val value: String) extends SfFieldString(1019, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1019)InstrumentPartyID=(").append(value).append(")")
}

object InstrumentPartyIDField {
  val TagId = 1019  
  def decode(a: Option[Any]) : Option[InstrumentPartyIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[InstrumentPartyIDField]
  }

  def decode(a: Any) : Option[InstrumentPartyIDField] = a match {
    case v: String => Some(InstrumentPartyIDField(v))
    case v: InstrumentPartyIDField => Some(v)
    case _ => scala.Option.empty[InstrumentPartyIDField]
  } 
}
