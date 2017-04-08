package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20170404
  */
case class EncodedUnderlyingSecurityDescLenField(override val value: Int) extends SfFieldInt(364, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(364)EncodedUnderlyingSecurityDescLen=(").append(value).append(")")
}

object EncodedUnderlyingSecurityDescLenField {
  val TagId = 364  
  def apply(value: String) = try {
    new EncodedUnderlyingSecurityDescLenField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new EncodedUnderlyingSecurityDescLen("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[EncodedUnderlyingSecurityDescLenField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[EncodedUnderlyingSecurityDescLenField]
  }

  def decode(a: Any) : Option[EncodedUnderlyingSecurityDescLenField] = a match {
    case v: String => Some(EncodedUnderlyingSecurityDescLenField(v))
    case v: Int => Some(EncodedUnderlyingSecurityDescLenField(v))
    case v: EncodedUnderlyingSecurityDescLenField => Some(v)
    case _ => scala.Option.empty[EncodedUnderlyingSecurityDescLenField]
  } 
}