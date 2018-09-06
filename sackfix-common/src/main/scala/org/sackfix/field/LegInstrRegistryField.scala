package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class LegInstrRegistryField(override val value: String) extends SfFieldString(599, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(599)LegInstrRegistry=(").append(value).append(")")
}

object LegInstrRegistryField {
  val TagId = 599  
  def decode(a: Option[Any]) : Option[LegInstrRegistryField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LegInstrRegistryField]
  }

  def decode(a: Any) : Option[LegInstrRegistryField] = a match {
    case v: String => Some(LegInstrRegistryField(v))
    case v: LegInstrRegistryField => Some(v)
    case _ => scala.Option.empty[LegInstrRegistryField]
  } 
}
