package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180821
  */
case class SecurityListIDField(override val value: String) extends SfFieldString(1465, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1465)SecurityListID=(").append(value).append(")")
}

object SecurityListIDField {
  val TagId = 1465  
  def decode(a: Option[Any]) : Option[SecurityListIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SecurityListIDField]
  }

  def decode(a: Any) : Option[SecurityListIDField] = a match {
    case v: String => Some(SecurityListIDField(v))
    case v: SecurityListIDField => Some(v)
    case _ => scala.Option.empty[SecurityListIDField]
  } 
}
