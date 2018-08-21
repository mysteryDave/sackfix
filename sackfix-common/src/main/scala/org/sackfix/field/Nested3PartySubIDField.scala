package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180821
  */
case class Nested3PartySubIDField(override val value: String) extends SfFieldString(953, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(953)Nested3PartySubID=(").append(value).append(")")
}

object Nested3PartySubIDField {
  val TagId = 953  
  def decode(a: Option[Any]) : Option[Nested3PartySubIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[Nested3PartySubIDField]
  }

  def decode(a: Any) : Option[Nested3PartySubIDField] = a match {
    case v: String => Some(Nested3PartySubIDField(v))
    case v: Nested3PartySubIDField => Some(v)
    case _ => scala.Option.empty[Nested3PartySubIDField]
  } 
}
