package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class CollReqIDField(override val value: String) extends SfFieldString(894, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(894)CollReqID=(").append(value).append(")")
}

object CollReqIDField {
  val TagId = 894  
  def decode(a: Option[Any]) : Option[CollReqIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[CollReqIDField]
  }

  def decode(a: Any) : Option[CollReqIDField] = a match {
    case v: String => Some(CollReqIDField(v))
    case v: CollReqIDField => Some(v)
    case _ => scala.Option.empty[CollReqIDField]
  } 
}
