package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180821
  */
case class PaymentRefField(override val value: String) extends SfFieldString(476, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(476)PaymentRef=(").append(value).append(")")
}

object PaymentRefField {
  val TagId = 476  
  def decode(a: Option[Any]) : Option[PaymentRefField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[PaymentRefField]
  }

  def decode(a: Any) : Option[PaymentRefField] = a match {
    case v: String => Some(PaymentRefField(v))
    case v: PaymentRefField => Some(v)
    case _ => scala.Option.empty[PaymentRefField]
  } 
}
