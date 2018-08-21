package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180821
  */
case class LowPxField(override val value: Float) extends SfFieldFloat(333, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(333)LowPx=(").append(value).append(")")
}

object LowPxField {
  val TagId = 333  
  def apply(value: String) = try {
    new LowPxField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new LowPx("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[LowPxField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LowPxField]
  }

  def decode(a: Any) : Option[LowPxField] = a match {
    case v: String => Some(LowPxField(v))
    case v: Float => Some(LowPxField(v))
    case v: Double => Some(LowPxField(v.toFloat))
    case v: Int => Some(LowPxField(v.toFloat))
    case v: LowPxField => Some(v)
    case _ => scala.Option.empty[LowPxField]
  } 
}
