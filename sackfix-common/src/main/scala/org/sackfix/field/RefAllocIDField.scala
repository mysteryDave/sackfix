package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class RefAllocIDField(override val value: String) extends SfFieldString(72, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(72)RefAllocID=(").append(value).append(")")
}

object RefAllocIDField {
  val TagId = 72  
  def decode(a: Option[Any]) : Option[RefAllocIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[RefAllocIDField]
  }

  def decode(a: Any) : Option[RefAllocIDField] = a match {
    case v: String => Some(RefAllocIDField(v))
    case v: RefAllocIDField => Some(v)
    case _ => scala.Option.empty[RefAllocIDField]
  } 
}
