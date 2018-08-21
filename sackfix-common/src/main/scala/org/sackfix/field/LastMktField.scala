package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180821
  */
case class LastMktField(override val value: String) extends SfFieldString(30, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(30)LastMkt=(").append(value).append(")")
}

object LastMktField {
  val TagId = 30  
  def decode(a: Option[Any]) : Option[LastMktField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LastMktField]
  }

  def decode(a: Any) : Option[LastMktField] = a match {
    case v: String => Some(LastMktField(v))
    case v: LastMktField => Some(v)
    case _ => scala.Option.empty[LastMktField]
  } 
}
