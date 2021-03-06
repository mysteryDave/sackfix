package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class EmailTypeField(override val value: String) extends SfFieldString(94, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(94)EmailType=(").append(value).append(")").append(EmailTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object EmailTypeField {
  val TagId = 94 
  val New="0"
  val Reply="1"
  val AdminReply="2"
  lazy val fixDescriptionByValue = Map("0"->"NEW","1"->"REPLY",
    "2"->"ADMIN_REPLY")
 
  def decode(a: Option[Any]) : Option[EmailTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[EmailTypeField]
  }

  def decode(a: Any) : Option[EmailTypeField] = a match {
    case v: String => Some(EmailTypeField(v))
    case v: Char => Some(EmailTypeField(v.toString))
    case v: EmailTypeField => Some(v)
    case _ => scala.Option.empty[EmailTypeField]
  } 
}
