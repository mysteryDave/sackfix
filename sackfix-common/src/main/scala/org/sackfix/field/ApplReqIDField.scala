package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180821
  */
case class ApplReqIDField(override val value: String) extends SfFieldString(1346, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1346)ApplReqID=(").append(value).append(")")
}

object ApplReqIDField {
  val TagId = 1346  
  def decode(a: Option[Any]) : Option[ApplReqIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ApplReqIDField]
  }

  def decode(a: Any) : Option[ApplReqIDField] = a match {
    case v: String => Some(ApplReqIDField(v))
    case v: ApplReqIDField => Some(v)
    case _ => scala.Option.empty[ApplReqIDField]
  } 
}
