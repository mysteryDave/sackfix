package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180902
  */
case class ListSeqNoField(override val value: Int) extends SfFieldInt(67, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(67)ListSeqNo=(").append(value).append(")")
}

object ListSeqNoField {
  val TagId = 67  
  def apply(value: String) = try {
    new ListSeqNoField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new ListSeqNo("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[ListSeqNoField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ListSeqNoField]
  }

  def decode(a: Any) : Option[ListSeqNoField] = a match {
    case v: String => Some(ListSeqNoField(v))
    case v: Int => Some(ListSeqNoField(v))
    case v: ListSeqNoField => Some(v)
    case _ => scala.Option.empty[ListSeqNoField]
  } 
}
