package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180821
  */
case class ExDestinationField(override val value: String) extends SfFieldString(100, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(100)ExDestination=(").append(value).append(")")
}

object ExDestinationField {
  val TagId = 100  
  def decode(a: Option[Any]) : Option[ExDestinationField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ExDestinationField]
  }

  def decode(a: Any) : Option[ExDestinationField] = a match {
    case v: String => Some(ExDestinationField(v))
    case v: ExDestinationField => Some(v)
    case _ => scala.Option.empty[ExDestinationField]
  } 
}
