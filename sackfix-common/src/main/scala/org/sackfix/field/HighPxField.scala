package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180821
  */
case class HighPxField(override val value: Float) extends SfFieldFloat(332, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(332)HighPx=(").append(value).append(")")
}

object HighPxField {
  val TagId = 332  
  def apply(value: String) = try {
    new HighPxField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new HighPx("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[HighPxField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[HighPxField]
  }

  def decode(a: Any) : Option[HighPxField] = a match {
    case v: String => Some(HighPxField(v))
    case v: Float => Some(HighPxField(v))
    case v: Double => Some(HighPxField(v.toFloat))
    case v: Int => Some(HighPxField(v.toFloat))
    case v: HighPxField => Some(v)
    case _ => scala.Option.empty[HighPxField]
  } 
}
