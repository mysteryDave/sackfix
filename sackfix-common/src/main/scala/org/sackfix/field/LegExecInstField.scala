package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class LegExecInstField(override val value: String) extends SfFieldString(1384, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1384)LegExecInst=(").append(value).append(")")
}

object LegExecInstField {
  val TagId = 1384  
  def decode(a: Option[Any]) : Option[LegExecInstField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LegExecInstField]
  }

  def decode(a: Any) : Option[LegExecInstField] = a match {
    case v: String => Some(LegExecInstField(v))
    case v: LegExecInstField => Some(v)
    case _ => scala.Option.empty[LegExecInstField]
  } 
}
