package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class ExecBrokerField(override val value: String) extends SfFieldString(76, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(76)ExecBroker=(").append(value).append(")")
}

object ExecBrokerField {
  val TagId = 76  
  def decode(a: Option[Any]) : Option[ExecBrokerField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ExecBrokerField]
  }

  def decode(a: Any) : Option[ExecBrokerField] = a match {
    case v: String => Some(ExecBrokerField(v))
    case v: ExecBrokerField => Some(v)
    case _ => scala.Option.empty[ExecBrokerField]
  } 
}
