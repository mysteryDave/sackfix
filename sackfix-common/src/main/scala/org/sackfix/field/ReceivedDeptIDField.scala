package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20170404
  */
case class ReceivedDeptIDField(override val value: String) extends SfFieldString(1030, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1030)ReceivedDeptID=(").append(value).append(")")
}

object ReceivedDeptIDField {
  val TagId = 1030  
  def decode(a: Option[Any]) : Option[ReceivedDeptIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ReceivedDeptIDField]
  }

  def decode(a: Any) : Option[ReceivedDeptIDField] = a match {
    case v: String => Some(ReceivedDeptIDField(v))
    case v: ReceivedDeptIDField => Some(v)
    case _ => scala.Option.empty[ReceivedDeptIDField]
  } 
}