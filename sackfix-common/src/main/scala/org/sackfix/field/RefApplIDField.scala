package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class RefApplIDField(override val value: String) extends SfFieldString(1355, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1355)RefApplID=(").append(value).append(")")
}

object RefApplIDField {
  val TagId = 1355  
  def decode(a: Option[Any]) : Option[RefApplIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[RefApplIDField]
  }

  def decode(a: Any) : Option[RefApplIDField] = a match {
    case v: String => Some(RefApplIDField(v))
    case v: RefApplIDField => Some(v)
    case _ => scala.Option.empty[RefApplIDField]
  } 
}
