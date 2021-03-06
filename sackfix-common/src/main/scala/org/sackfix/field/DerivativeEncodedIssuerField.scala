package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class DerivativeEncodedIssuerField(override val value: String) extends SfFieldString(1278, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1278)DerivativeEncodedIssuer=(").append(value).append(")")
}

object DerivativeEncodedIssuerField {
  val TagId = 1278  
  def decode(a: Option[Any]) : Option[DerivativeEncodedIssuerField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DerivativeEncodedIssuerField]
  }

  def decode(a: Any) : Option[DerivativeEncodedIssuerField] = a match {
    case v: String => Some(DerivativeEncodedIssuerField(v))
    case v: DerivativeEncodedIssuerField => Some(v)
    case _ => scala.Option.empty[DerivativeEncodedIssuerField]
  } 
}
