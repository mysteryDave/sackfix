package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldFloat

/**
  * Generated by SackFix code generator on 20180902
  */
case class DiscretionOffsetField(override val value: Float) extends SfFieldFloat(389, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(389)DiscretionOffset=(").append(value).append(")")
}

object DiscretionOffsetField {
  val TagId = 389  
  def apply(value: String) = try {
    new DiscretionOffsetField(value.toFloat)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new DiscretionOffset("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[DiscretionOffsetField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DiscretionOffsetField]
  }

  def decode(a: Any) : Option[DiscretionOffsetField] = a match {
    case v: String => Some(DiscretionOffsetField(v))
    case v: Float => Some(DiscretionOffsetField(v))
    case v: Double => Some(DiscretionOffsetField(v.toFloat))
    case v: Int => Some(DiscretionOffsetField(v.toFloat))
    case v: DiscretionOffsetField => Some(v)
    case _ => scala.Option.empty[DiscretionOffsetField]
  } 
}
