package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20180902
  */
case class NoUndlyInstrumentPartySubIDsField(override val value: Int) extends SfNumInGroup(1062, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1062)NoUndlyInstrumentPartySubIDs=(").append(value).append(")")
}

object NoUndlyInstrumentPartySubIDsField {
  val TagId = 1062  
  def apply(value: String) = try {
    new NoUndlyInstrumentPartySubIDsField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoUndlyInstrumentPartySubIDs("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoUndlyInstrumentPartySubIDsField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoUndlyInstrumentPartySubIDsField]
  }

  def decode(a: Any) : Option[NoUndlyInstrumentPartySubIDsField] = a match {
    case v: String => Some(NoUndlyInstrumentPartySubIDsField(v))
    case v: Int => Some(NoUndlyInstrumentPartySubIDsField(v))
    case v: NoUndlyInstrumentPartySubIDsField => Some(v)
    case _ => scala.Option.empty[NoUndlyInstrumentPartySubIDsField]
  } 
}
