package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180821
  */
case class HostCrossIDField(override val value: String) extends SfFieldString(961, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(961)HostCrossID=(").append(value).append(")")
}

object HostCrossIDField {
  val TagId = 961  
  def decode(a: Option[Any]) : Option[HostCrossIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[HostCrossIDField]
  }

  def decode(a: Any) : Option[HostCrossIDField] = a match {
    case v: String => Some(HostCrossIDField(v))
    case v: HostCrossIDField => Some(v)
    case _ => scala.Option.empty[HostCrossIDField]
  } 
}
