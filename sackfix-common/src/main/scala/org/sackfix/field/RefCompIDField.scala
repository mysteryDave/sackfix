package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class RefCompIDField(override val value: String) extends SfFieldString(930, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(930)RefCompID=(").append(value).append(")")
}

object RefCompIDField {
  val TagId = 930  
  def decode(a: Option[Any]) : Option[RefCompIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[RefCompIDField]
  }

  def decode(a: Any) : Option[RefCompIDField] = a match {
    case v: String => Some(RefCompIDField(v))
    case v: RefCompIDField => Some(v)
    case _ => scala.Option.empty[RefCompIDField]
  } 
}
