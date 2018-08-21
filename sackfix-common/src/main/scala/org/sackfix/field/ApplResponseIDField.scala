package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180821
  */
case class ApplResponseIDField(override val value: String) extends SfFieldString(1353, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1353)ApplResponseID=(").append(value).append(")")
}

object ApplResponseIDField {
  val TagId = 1353  
  def decode(a: Option[Any]) : Option[ApplResponseIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ApplResponseIDField]
  }

  def decode(a: Any) : Option[ApplResponseIDField] = a match {
    case v: String => Some(ApplResponseIDField(v))
    case v: ApplResponseIDField => Some(v)
    case _ => scala.Option.empty[ApplResponseIDField]
  } 
}
