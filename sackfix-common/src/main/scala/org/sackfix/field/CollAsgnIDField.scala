package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class CollAsgnIDField(override val value: String) extends SfFieldString(902, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(902)CollAsgnID=(").append(value).append(")")
}

object CollAsgnIDField {
  val TagId = 902  
  def decode(a: Option[Any]) : Option[CollAsgnIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[CollAsgnIDField]
  }

  def decode(a: Any) : Option[CollAsgnIDField] = a match {
    case v: String => Some(CollAsgnIDField(v))
    case v: CollAsgnIDField => Some(v)
    case _ => scala.Option.empty[CollAsgnIDField]
  } 
}
