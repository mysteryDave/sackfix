package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180821
  */
case class LegAllocAccountField(override val value: String) extends SfFieldString(671, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(671)LegAllocAccount=(").append(value).append(")")
}

object LegAllocAccountField {
  val TagId = 671  
  def decode(a: Option[Any]) : Option[LegAllocAccountField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LegAllocAccountField]
  }

  def decode(a: Any) : Option[LegAllocAccountField] = a match {
    case v: String => Some(LegAllocAccountField(v))
    case v: LegAllocAccountField => Some(v)
    case _ => scala.Option.empty[LegAllocAccountField]
  } 
}
