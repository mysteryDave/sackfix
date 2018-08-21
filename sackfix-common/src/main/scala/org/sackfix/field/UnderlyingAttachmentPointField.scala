package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180821
  */
case class UnderlyingAttachmentPointField(override val value: Float) extends SfFieldFloat(1459, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1459)UnderlyingAttachmentPoint=(").append(value).append(")")
}

object UnderlyingAttachmentPointField {
  val TagId = 1459  
  def apply(value: String) = try {
    new UnderlyingAttachmentPointField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new UnderlyingAttachmentPoint("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[UnderlyingAttachmentPointField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingAttachmentPointField]
  }

  def decode(a: Any) : Option[UnderlyingAttachmentPointField] = a match {
    case v: String => Some(UnderlyingAttachmentPointField(v))
    case v: Float => Some(UnderlyingAttachmentPointField(v))
    case v: Double => Some(UnderlyingAttachmentPointField(v.toFloat))
    case v: Int => Some(UnderlyingAttachmentPointField(v.toFloat))
    case v: UnderlyingAttachmentPointField => Some(v)
    case _ => scala.Option.empty[UnderlyingAttachmentPointField]
  } 
}
