package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180821
  */
case class TradeRequestIDField(override val value: String) extends SfFieldString(568, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(568)TradeRequestID=(").append(value).append(")")
}

object TradeRequestIDField {
  val TagId = 568  
  def decode(a: Option[Any]) : Option[TradeRequestIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[TradeRequestIDField]
  }

  def decode(a: Any) : Option[TradeRequestIDField] = a match {
    case v: String => Some(TradeRequestIDField(v))
    case v: TradeRequestIDField => Some(v)
    case _ => scala.Option.empty[TradeRequestIDField]
  } 
}
