package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class TransferReasonField(override val value: String) extends SfFieldString(830, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(830)TransferReason=(").append(value).append(")")
}

object TransferReasonField {
  val TagId = 830  
  def decode(a: Option[Any]) : Option[TransferReasonField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[TransferReasonField]
  }

  def decode(a: Any) : Option[TransferReasonField] = a match {
    case v: String => Some(TransferReasonField(v))
    case v: TransferReasonField => Some(v)
    case _ => scala.Option.empty[TransferReasonField]
  } 
}
