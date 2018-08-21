package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180821
  */
case class ClientIDField(override val value: String) extends SfFieldString(109, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(109)ClientID=(").append(value).append(")")
}

object ClientIDField {
  val TagId = 109  
  def decode(a: Option[Any]) : Option[ClientIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ClientIDField]
  }

  def decode(a: Any) : Option[ClientIDField] = a match {
    case v: String => Some(ClientIDField(v))
    case v: ClientIDField => Some(v)
    case _ => scala.Option.empty[ClientIDField]
  } 
}
