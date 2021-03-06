package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class InputSourceField(override val value: String) extends SfFieldString(979, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(979)InputSource=(").append(value).append(")")
}

object InputSourceField {
  val TagId = 979  
  def decode(a: Option[Any]) : Option[InputSourceField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[InputSourceField]
  }

  def decode(a: Any) : Option[InputSourceField] = a match {
    case v: String => Some(InputSourceField(v))
    case v: InputSourceField => Some(v)
    case _ => scala.Option.empty[InputSourceField]
  } 
}
