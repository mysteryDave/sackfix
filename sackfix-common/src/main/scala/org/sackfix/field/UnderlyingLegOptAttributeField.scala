package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180821
  */
case class UnderlyingLegOptAttributeField(override val value: String) extends SfFieldString(1391, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1391)UnderlyingLegOptAttribute=(").append(value).append(")")
}

object UnderlyingLegOptAttributeField {
  val TagId = 1391  
  def decode(a: Option[Any]) : Option[UnderlyingLegOptAttributeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingLegOptAttributeField]
  }

  def decode(a: Any) : Option[UnderlyingLegOptAttributeField] = a match {
    case v: String => Some(UnderlyingLegOptAttributeField(v))
    case v: Char => Some(UnderlyingLegOptAttributeField(v.toString))
    case v: UnderlyingLegOptAttributeField => Some(v)
    case _ => scala.Option.empty[UnderlyingLegOptAttributeField]
  } 
}
