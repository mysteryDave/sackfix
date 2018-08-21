package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180821
  */
case class LegAllocIDField(override val value: String) extends SfFieldString(1366, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1366)LegAllocID=(").append(value).append(")")
}

object LegAllocIDField {
  val TagId = 1366  
  def decode(a: Option[Any]) : Option[LegAllocIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LegAllocIDField]
  }

  def decode(a: Any) : Option[LegAllocIDField] = a match {
    case v: String => Some(LegAllocIDField(v))
    case v: LegAllocIDField => Some(v)
    case _ => scala.Option.empty[LegAllocIDField]
  } 
}
