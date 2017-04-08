package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20170404
  */
case class NoSettlPartySubIDsField(override val value: Int) extends SfNumInGroup(801, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(801)NoSettlPartySubIDs=(").append(value).append(")")
}

object NoSettlPartySubIDsField {
  val TagId = 801  
  def apply(value: String) = try {
    new NoSettlPartySubIDsField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoSettlPartySubIDs("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoSettlPartySubIDsField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoSettlPartySubIDsField]
  }

  def decode(a: Any) : Option[NoSettlPartySubIDsField] = a match {
    case v: String => Some(NoSettlPartySubIDsField(v))
    case v: Int => Some(NoSettlPartySubIDsField(v))
    case v: NoSettlPartySubIDsField => Some(v)
    case _ => scala.Option.empty[NoSettlPartySubIDsField]
  } 
}