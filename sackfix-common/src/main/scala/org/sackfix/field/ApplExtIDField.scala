package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180902
  */
case class ApplExtIDField(override val value: Int) extends SfFieldInt(1156, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1156)ApplExtID=(").append(value).append(")")
}

object ApplExtIDField {
  val TagId = 1156  
  def apply(value: String) = try {
    new ApplExtIDField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new ApplExtID("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[ApplExtIDField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ApplExtIDField]
  }

  def decode(a: Any) : Option[ApplExtIDField] = a match {
    case v: String => Some(ApplExtIDField(v))
    case v: Int => Some(ApplExtIDField(v))
    case v: ApplExtIDField => Some(v)
    case _ => scala.Option.empty[ApplExtIDField]
  } 
}
