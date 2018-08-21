package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180821
  */
case class AllocTextField(override val value: String) extends SfFieldString(161, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(161)AllocText=(").append(value).append(")")
}

object AllocTextField {
  val TagId = 161  
  def decode(a: Option[Any]) : Option[AllocTextField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[AllocTextField]
  }

  def decode(a: Any) : Option[AllocTextField] = a match {
    case v: String => Some(AllocTextField(v))
    case v: AllocTextField => Some(v)
    case _ => scala.Option.empty[AllocTextField]
  } 
}
