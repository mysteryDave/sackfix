package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class PegSymbolField(override val value: String) extends SfFieldString(1098, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1098)PegSymbol=(").append(value).append(")")
}

object PegSymbolField {
  val TagId = 1098  
  def decode(a: Option[Any]) : Option[PegSymbolField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[PegSymbolField]
  }

  def decode(a: Any) : Option[PegSymbolField] = a match {
    case v: String => Some(PegSymbolField(v))
    case v: PegSymbolField => Some(v)
    case _ => scala.Option.empty[PegSymbolField]
  } 
}
