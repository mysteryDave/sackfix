package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180821
  */
case class UnderlyingSettlementStatusField(override val value: String) extends SfFieldString(988, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(988)UnderlyingSettlementStatus=(").append(value).append(")")
}

object UnderlyingSettlementStatusField {
  val TagId = 988  
  def decode(a: Option[Any]) : Option[UnderlyingSettlementStatusField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingSettlementStatusField]
  }

  def decode(a: Any) : Option[UnderlyingSettlementStatusField] = a match {
    case v: String => Some(UnderlyingSettlementStatusField(v))
    case v: UnderlyingSettlementStatusField => Some(v)
    case _ => scala.Option.empty[UnderlyingSettlementStatusField]
  } 
}
