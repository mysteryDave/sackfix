package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180902
  */
case class StopPxField(override val value: Float) extends SfFieldFloat(99, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(99)StopPx=(").append(value).append(")")
}

object StopPxField {
  val TagId = 99  
  def apply(value: String) = try {
    new StopPxField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new StopPx("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[StopPxField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[StopPxField]
  }

  def decode(a: Any) : Option[StopPxField] = a match {
    case v: String => Some(StopPxField(v))
    case v: Float => Some(StopPxField(v))
    case v: Double => Some(StopPxField(v.toFloat))
    case v: Int => Some(StopPxField(v.toFloat))
    case v: StopPxField => Some(v)
    case _ => scala.Option.empty[StopPxField]
  } 
}
