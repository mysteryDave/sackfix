package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class RptSysField(override val value: String) extends SfFieldString(1135, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1135)RptSys=(").append(value).append(")")
}

object RptSysField {
  val TagId = 1135  
  def decode(a: Option[Any]) : Option[RptSysField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[RptSysField]
  }

  def decode(a: Any) : Option[RptSysField] = a match {
    case v: String => Some(RptSysField(v))
    case v: RptSysField => Some(v)
    case _ => scala.Option.empty[RptSysField]
  } 
}
