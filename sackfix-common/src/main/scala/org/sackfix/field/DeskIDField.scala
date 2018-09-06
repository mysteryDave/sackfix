package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class DeskIDField(override val value: String) extends SfFieldString(284, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(284)DeskID=(").append(value).append(")")
}

object DeskIDField {
  val TagId = 284  
  def decode(a: Option[Any]) : Option[DeskIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DeskIDField]
  }

  def decode(a: Any) : Option[DeskIDField] = a match {
    case v: String => Some(DeskIDField(v))
    case v: DeskIDField => Some(v)
    case _ => scala.Option.empty[DeskIDField]
  } 
}
