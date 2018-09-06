package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class LegTimeUnitField(override val value: String) extends SfFieldString(1001, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1001)LegTimeUnit=(").append(value).append(")")
}

object LegTimeUnitField {
  val TagId = 1001  
  def decode(a: Option[Any]) : Option[LegTimeUnitField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LegTimeUnitField]
  }

  def decode(a: Any) : Option[LegTimeUnitField] = a match {
    case v: String => Some(LegTimeUnitField(v))
    case v: LegTimeUnitField => Some(v)
    case _ => scala.Option.empty[LegTimeUnitField]
  } 
}
