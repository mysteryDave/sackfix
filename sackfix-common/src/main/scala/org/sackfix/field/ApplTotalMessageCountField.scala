package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180902
  */
case class ApplTotalMessageCountField(override val value: Int) extends SfFieldInt(1349, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1349)ApplTotalMessageCount=(").append(value).append(")")
}

object ApplTotalMessageCountField {
  val TagId = 1349  
  def apply(value: String) = try {
    new ApplTotalMessageCountField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new ApplTotalMessageCount("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[ApplTotalMessageCountField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ApplTotalMessageCountField]
  }

  def decode(a: Any) : Option[ApplTotalMessageCountField] = a match {
    case v: String => Some(ApplTotalMessageCountField(v))
    case v: Int => Some(ApplTotalMessageCountField(v))
    case v: ApplTotalMessageCountField => Some(v)
    case _ => scala.Option.empty[ApplTotalMessageCountField]
  } 
}
