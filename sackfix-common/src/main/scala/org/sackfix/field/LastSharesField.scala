package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180821
  */
case class LastSharesField(override val value: Float) extends SfFieldFloat(32, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(32)LastShares=(").append(value).append(")")
}

object LastSharesField {
  val TagId = 32  
  def apply(value: String) = try {
    new LastSharesField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new LastShares("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[LastSharesField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LastSharesField]
  }

  def decode(a: Any) : Option[LastSharesField] = a match {
    case v: String => Some(LastSharesField(v))
    case v: Float => Some(LastSharesField(v))
    case v: Double => Some(LastSharesField(v.toFloat))
    case v: Int => Some(LastSharesField(v.toFloat))
    case v: LastSharesField => Some(v)
    case _ => scala.Option.empty[LastSharesField]
  } 
}
