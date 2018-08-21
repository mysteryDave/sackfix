package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180821
  */
case class UndlyInstrumentPartyIDField(override val value: String) extends SfFieldString(1059, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1059)UndlyInstrumentPartyID=(").append(value).append(")")
}

object UndlyInstrumentPartyIDField {
  val TagId = 1059  
  def decode(a: Option[Any]) : Option[UndlyInstrumentPartyIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UndlyInstrumentPartyIDField]
  }

  def decode(a: Any) : Option[UndlyInstrumentPartyIDField] = a match {
    case v: String => Some(UndlyInstrumentPartyIDField(v))
    case v: UndlyInstrumentPartyIDField => Some(v)
    case _ => scala.Option.empty[UndlyInstrumentPartyIDField]
  } 
}
