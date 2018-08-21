package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180821
  */
case class AccountField(override val value: String) extends SfFieldString(1, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1)Account=(").append(value).append(")")
}

object AccountField {
  val TagId = 1  
  def decode(a: Option[Any]) : Option[AccountField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[AccountField]
  }

  def decode(a: Any) : Option[AccountField] = a match {
    case v: String => Some(AccountField(v))
    case v: AccountField => Some(v)
    case _ => scala.Option.empty[AccountField]
  } 
}
