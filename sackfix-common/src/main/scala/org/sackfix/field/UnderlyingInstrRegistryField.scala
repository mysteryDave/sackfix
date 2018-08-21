package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180821
  */
case class UnderlyingInstrRegistryField(override val value: String) extends SfFieldString(595, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(595)UnderlyingInstrRegistry=(").append(value).append(")")
}

object UnderlyingInstrRegistryField {
  val TagId = 595  
  def decode(a: Option[Any]) : Option[UnderlyingInstrRegistryField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingInstrRegistryField]
  }

  def decode(a: Any) : Option[UnderlyingInstrRegistryField] = a match {
    case v: String => Some(UnderlyingInstrRegistryField(v))
    case v: UnderlyingInstrRegistryField => Some(v)
    case _ => scala.Option.empty[UnderlyingInstrRegistryField]
  } 
}
