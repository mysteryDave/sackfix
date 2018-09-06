package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class EncodedAllocTextField(override val value: String) extends SfFieldString(361, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(361)EncodedAllocText=(").append(value).append(")")
}

object EncodedAllocTextField {
  val TagId = 361  
  def decode(a: Option[Any]) : Option[EncodedAllocTextField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[EncodedAllocTextField]
  }

  def decode(a: Any) : Option[EncodedAllocTextField] = a match {
    case v: String => Some(EncodedAllocTextField(v))
    case v: EncodedAllocTextField => Some(v)
    case _ => scala.Option.empty[EncodedAllocTextField]
  } 
}
