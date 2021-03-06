package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class Nested4PartyIDField(override val value: String) extends SfFieldString(1415, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1415)Nested4PartyID=(").append(value).append(")")
}

object Nested4PartyIDField {
  val TagId = 1415  
  def decode(a: Option[Any]) : Option[Nested4PartyIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[Nested4PartyIDField]
  }

  def decode(a: Any) : Option[Nested4PartyIDField] = a match {
    case v: String => Some(Nested4PartyIDField(v))
    case v: Nested4PartyIDField => Some(v)
    case _ => scala.Option.empty[Nested4PartyIDField]
  } 
}
