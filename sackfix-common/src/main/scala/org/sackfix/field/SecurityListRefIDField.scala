package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180821
  */
case class SecurityListRefIDField(override val value: String) extends SfFieldString(1466, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1466)SecurityListRefID=(").append(value).append(")")
}

object SecurityListRefIDField {
  val TagId = 1466  
  def decode(a: Option[Any]) : Option[SecurityListRefIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SecurityListRefIDField]
  }

  def decode(a: Any) : Option[SecurityListRefIDField] = a match {
    case v: String => Some(SecurityListRefIDField(v))
    case v: SecurityListRefIDField => Some(v)
    case _ => scala.Option.empty[SecurityListRefIDField]
  } 
}
