package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180902
  */
case class ApplLastSeqNumField(override val value: Int) extends SfFieldInt(1350, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1350)ApplLastSeqNum=(").append(value).append(")")
}

object ApplLastSeqNumField {
  val TagId = 1350  
  def apply(value: String) = try {
    new ApplLastSeqNumField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new ApplLastSeqNum("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[ApplLastSeqNumField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ApplLastSeqNumField]
  }

  def decode(a: Any) : Option[ApplLastSeqNumField] = a match {
    case v: String => Some(ApplLastSeqNumField(v))
    case v: Int => Some(ApplLastSeqNumField(v))
    case v: ApplLastSeqNumField => Some(v)
    case _ => scala.Option.empty[ApplLastSeqNumField]
  } 
}
