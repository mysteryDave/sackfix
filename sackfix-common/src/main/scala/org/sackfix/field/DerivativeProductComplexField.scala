package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180821
  */
case class DerivativeProductComplexField(override val value: String) extends SfFieldString(1228, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1228)DerivativeProductComplex=(").append(value).append(")")
}

object DerivativeProductComplexField {
  val TagId = 1228  
  def decode(a: Option[Any]) : Option[DerivativeProductComplexField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DerivativeProductComplexField]
  }

  def decode(a: Any) : Option[DerivativeProductComplexField] = a match {
    case v: String => Some(DerivativeProductComplexField(v))
    case v: DerivativeProductComplexField => Some(v)
    case _ => scala.Option.empty[DerivativeProductComplexField]
  } 
}
