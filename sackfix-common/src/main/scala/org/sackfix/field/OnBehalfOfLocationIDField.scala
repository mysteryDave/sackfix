package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class OnBehalfOfLocationIDField(override val value: String) extends SfFieldString(144, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(144)OnBehalfOfLocationID=(").append(value).append(")")
}

object OnBehalfOfLocationIDField {
  val TagId = 144  
  def decode(a: Option[Any]) : Option[OnBehalfOfLocationIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[OnBehalfOfLocationIDField]
  }

  def decode(a: Any) : Option[OnBehalfOfLocationIDField] = a match {
    case v: String => Some(OnBehalfOfLocationIDField(v))
    case v: OnBehalfOfLocationIDField => Some(v)
    case _ => scala.Option.empty[OnBehalfOfLocationIDField]
  } 
}
