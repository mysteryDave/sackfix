package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20180902
  */
case class NoInstrumentPartySubIDsField(override val value: Int) extends SfNumInGroup(1052, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1052)NoInstrumentPartySubIDs=(").append(value).append(")")
}

object NoInstrumentPartySubIDsField {
  val TagId = 1052  
  def apply(value: String) = try {
    new NoInstrumentPartySubIDsField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoInstrumentPartySubIDs("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoInstrumentPartySubIDsField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoInstrumentPartySubIDsField]
  }

  def decode(a: Any) : Option[NoInstrumentPartySubIDsField] = a match {
    case v: String => Some(NoInstrumentPartySubIDsField(v))
    case v: Int => Some(NoInstrumentPartySubIDsField(v))
    case v: NoInstrumentPartySubIDsField => Some(v)
    case _ => scala.Option.empty[NoInstrumentPartySubIDsField]
  } 
}
