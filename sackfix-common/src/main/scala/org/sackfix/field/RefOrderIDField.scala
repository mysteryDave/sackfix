package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180821
  */
case class RefOrderIDField(override val value: String) extends SfFieldString(1080, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1080)RefOrderID=(").append(value).append(")")
}

object RefOrderIDField {
  val TagId = 1080  
  def decode(a: Option[Any]) : Option[RefOrderIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[RefOrderIDField]
  }

  def decode(a: Any) : Option[RefOrderIDField] = a match {
    case v: String => Some(RefOrderIDField(v))
    case v: RefOrderIDField => Some(v)
    case _ => scala.Option.empty[RefOrderIDField]
  } 
}
