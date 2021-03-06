package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class SenderCompIDField(override val value: String) extends SfFieldString(49, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(49)SenderCompID=(").append(value).append(")")
}

object SenderCompIDField {
  val TagId = 49  
  def decode(a: Option[Any]) : Option[SenderCompIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SenderCompIDField]
  }

  def decode(a: Any) : Option[SenderCompIDField] = a match {
    case v: String => Some(SenderCompIDField(v))
    case v: SenderCompIDField => Some(v)
    case _ => scala.Option.empty[SenderCompIDField]
  } 
}
