package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180902
  */
case class UnderlyingEndValueField(override val value: Float) extends SfFieldFloat(886, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(886)UnderlyingEndValue=(").append(value).append(")")
}

object UnderlyingEndValueField {
  val TagId = 886  
  def apply(value: String) = try {
    new UnderlyingEndValueField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new UnderlyingEndValue("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[UnderlyingEndValueField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingEndValueField]
  }

  def decode(a: Any) : Option[UnderlyingEndValueField] = a match {
    case v: String => Some(UnderlyingEndValueField(v))
    case v: Float => Some(UnderlyingEndValueField(v))
    case v: Double => Some(UnderlyingEndValueField(v.toFloat))
    case v: Int => Some(UnderlyingEndValueField(v.toFloat))
    case v: UnderlyingEndValueField => Some(v)
    case _ => scala.Option.empty[UnderlyingEndValueField]
  } 
}
