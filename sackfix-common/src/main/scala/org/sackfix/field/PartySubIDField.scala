package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class PartySubIDField(override val value: String) extends SfFieldString(523, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(523)PartySubID=(").append(value).append(")")
}

object PartySubIDField {
  val TagId = 523  
  def decode(a: Option[Any]) : Option[PartySubIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[PartySubIDField]
  }

  def decode(a: Any) : Option[PartySubIDField] = a match {
    case v: String => Some(PartySubIDField(v))
    case v: PartySubIDField => Some(v)
    case _ => scala.Option.empty[PartySubIDField]
  } 
}
