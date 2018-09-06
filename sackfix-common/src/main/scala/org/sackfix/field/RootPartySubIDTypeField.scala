package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180902
  */
case class RootPartySubIDTypeField(override val value: Int) extends SfFieldInt(1122, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1122)RootPartySubIDType=(").append(value).append(")")
}

object RootPartySubIDTypeField {
  val TagId = 1122  
  def apply(value: String) = try {
    new RootPartySubIDTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new RootPartySubIDType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[RootPartySubIDTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[RootPartySubIDTypeField]
  }

  def decode(a: Any) : Option[RootPartySubIDTypeField] = a match {
    case v: String => Some(RootPartySubIDTypeField(v))
    case v: Int => Some(RootPartySubIDTypeField(v))
    case v: RootPartySubIDTypeField => Some(v)
    case _ => scala.Option.empty[RootPartySubIDTypeField]
  } 
}
