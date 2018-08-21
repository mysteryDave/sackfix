package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180821
  */
case class UndlyInstrumentPartySubIDTypeField(override val value: Int) extends SfFieldInt(1064, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1064)UndlyInstrumentPartySubIDType=(").append(value).append(")")
}

object UndlyInstrumentPartySubIDTypeField {
  val TagId = 1064  
  def apply(value: String) = try {
    new UndlyInstrumentPartySubIDTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new UndlyInstrumentPartySubIDType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[UndlyInstrumentPartySubIDTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UndlyInstrumentPartySubIDTypeField]
  }

  def decode(a: Any) : Option[UndlyInstrumentPartySubIDTypeField] = a match {
    case v: String => Some(UndlyInstrumentPartySubIDTypeField(v))
    case v: Int => Some(UndlyInstrumentPartySubIDTypeField(v))
    case v: UndlyInstrumentPartySubIDTypeField => Some(v)
    case _ => scala.Option.empty[UndlyInstrumentPartySubIDTypeField]
  } 
}
