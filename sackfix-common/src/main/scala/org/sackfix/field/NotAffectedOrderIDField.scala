package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class NotAffectedOrderIDField(override val value: String) extends SfFieldString(1371, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1371)NotAffectedOrderID=(").append(value).append(")")
}

object NotAffectedOrderIDField {
  val TagId = 1371  
  def decode(a: Option[Any]) : Option[NotAffectedOrderIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[NotAffectedOrderIDField]
  }

  def decode(a: Any) : Option[NotAffectedOrderIDField] = a match {
    case v: String => Some(NotAffectedOrderIDField(v))
    case v: NotAffectedOrderIDField => Some(v)
    case _ => scala.Option.empty[NotAffectedOrderIDField]
  } 
}
