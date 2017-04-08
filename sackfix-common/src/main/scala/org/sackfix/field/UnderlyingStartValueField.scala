package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20170404
  */
case class UnderlyingStartValueField(override val value: Float) extends SfFieldFloat(884, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(884)UnderlyingStartValue=(").append(value).append(")")
}

object UnderlyingStartValueField {
  val TagId = 884  
  def apply(value: String) = try {
    new UnderlyingStartValueField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new UnderlyingStartValue("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[UnderlyingStartValueField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingStartValueField]
  }

  def decode(a: Any) : Option[UnderlyingStartValueField] = a match {
    case v: String => Some(UnderlyingStartValueField(v))
    case v: Float => Some(UnderlyingStartValueField(v))
    case v: Double => Some(UnderlyingStartValueField(v.toFloat))
    case v: Int => Some(UnderlyingStartValueField(v.toFloat))
    case v: UnderlyingStartValueField => Some(v)
    case _ => scala.Option.empty[UnderlyingStartValueField]
  } 
}