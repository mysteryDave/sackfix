package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180821
  */
case class ConfirmRefIDField(override val value: String) extends SfFieldString(772, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(772)ConfirmRefID=(").append(value).append(")")
}

object ConfirmRefIDField {
  val TagId = 772  
  def decode(a: Option[Any]) : Option[ConfirmRefIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ConfirmRefIDField]
  }

  def decode(a: Any) : Option[ConfirmRefIDField] = a match {
    case v: String => Some(ConfirmRefIDField(v))
    case v: ConfirmRefIDField => Some(v)
    case _ => scala.Option.empty[ConfirmRefIDField]
  } 
}
