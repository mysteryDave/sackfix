package org.sackfix.field

import org.sackfix.common.validated.fields.SfNumInGroup

/**
  * Generated by SackFix code generator on 20180902
  */
case class NoSettlPartyIDsField(override val value: Int) extends SfNumInGroup(781, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(781)NoSettlPartyIDs=(").append(value).append(")")
}

object NoSettlPartyIDsField {
  val TagId = 781  
  def apply(value: String) = try {
    new NoSettlPartyIDsField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new NoSettlPartyIDs("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[NoSettlPartyIDsField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NoSettlPartyIDsField]
  }

  def decode(a: Any) : Option[NoSettlPartyIDsField] = a match {
    case v: String => Some(NoSettlPartyIDsField(v))
    case v: Int => Some(NoSettlPartyIDsField(v))
    case v: NoSettlPartyIDsField => Some(v)
    case _ => scala.Option.empty[NoSettlPartyIDsField]
  } 
}
