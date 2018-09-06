package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class AffectedSecondaryOrderIDField(override val value: String) extends SfFieldString(536, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(536)AffectedSecondaryOrderID=(").append(value).append(")")
}

object AffectedSecondaryOrderIDField {
  val TagId = 536  
  def decode(a: Option[Any]) : Option[AffectedSecondaryOrderIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[AffectedSecondaryOrderIDField]
  }

  def decode(a: Any) : Option[AffectedSecondaryOrderIDField] = a match {
    case v: String => Some(AffectedSecondaryOrderIDField(v))
    case v: AffectedSecondaryOrderIDField => Some(v)
    case _ => scala.Option.empty[AffectedSecondaryOrderIDField]
  } 
}
