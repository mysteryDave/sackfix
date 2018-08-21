package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180821
  */
case class PossDupFlagStringField(override val value: String) extends SfFieldString(43, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(43)PossDupFlagString=(").append(value).append(")")
}

object PossDupFlagStringField {
  val TagId = 43  
  def decode(a: Option[Any]) : Option[PossDupFlagStringField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[PossDupFlagStringField]
  }

  def decode(a: Any) : Option[PossDupFlagStringField] = a match {
    case v: String => Some(PossDupFlagStringField(v))
    case v: PossDupFlagStringField => Some(v)
    case _ => scala.Option.empty[PossDupFlagStringField]
  } 
}
