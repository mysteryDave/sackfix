package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class ApplIDField(override val value: String) extends SfFieldString(1180, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1180)ApplID=(").append(value).append(")")
}

object ApplIDField {
  val TagId = 1180  
  def decode(a: Option[Any]) : Option[ApplIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ApplIDField]
  }

  def decode(a: Any) : Option[ApplIDField] = a match {
    case v: String => Some(ApplIDField(v))
    case v: ApplIDField => Some(v)
    case _ => scala.Option.empty[ApplIDField]
  } 
}
