package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class AffectedOrderIDField(override val value: String) extends SfFieldString(535, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(535)AffectedOrderID=(").append(value).append(")")
}

object AffectedOrderIDField {
  val TagId = 535  
  def decode(a: Option[Any]) : Option[AffectedOrderIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[AffectedOrderIDField]
  }

  def decode(a: Any) : Option[AffectedOrderIDField] = a match {
    case v: String => Some(AffectedOrderIDField(v))
    case v: AffectedOrderIDField => Some(v)
    case _ => scala.Option.empty[AffectedOrderIDField]
  } 
}
