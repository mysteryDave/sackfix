package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class OnBehalfOfCompIDField(override val value: String) extends SfFieldString(115, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(115)OnBehalfOfCompID=(").append(value).append(")")
}

object OnBehalfOfCompIDField {
  val TagId = 115  
  def decode(a: Option[Any]) : Option[OnBehalfOfCompIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[OnBehalfOfCompIDField]
  }

  def decode(a: Any) : Option[OnBehalfOfCompIDField] = a match {
    case v: String => Some(OnBehalfOfCompIDField(v))
    case v: OnBehalfOfCompIDField => Some(v)
    case _ => scala.Option.empty[OnBehalfOfCompIDField]
  } 
}