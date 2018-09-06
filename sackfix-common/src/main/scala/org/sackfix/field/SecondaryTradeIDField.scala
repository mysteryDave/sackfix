package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class SecondaryTradeIDField(override val value: String) extends SfFieldString(1040, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1040)SecondaryTradeID=(").append(value).append(")")
}

object SecondaryTradeIDField {
  val TagId = 1040  
  def decode(a: Option[Any]) : Option[SecondaryTradeIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SecondaryTradeIDField]
  }

  def decode(a: Any) : Option[SecondaryTradeIDField] = a match {
    case v: String => Some(SecondaryTradeIDField(v))
    case v: SecondaryTradeIDField => Some(v)
    case _ => scala.Option.empty[SecondaryTradeIDField]
  } 
}
