package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldUtcTimeStamp
import java.time.LocalDateTime
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20180821
  */
case class SendingTimeField(override val value: LocalDateTime) extends SfFieldUtcTimeStamp(52, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(52)SendingTime=(").append(value).append(")")
}

object SendingTimeField {
  val TagId = 52  
  def apply(value: String) = try {
    new SendingTimeField(LocalDateTime.from(SfFixDateFormats.utcTimeStamp.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new SendingTime("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[SendingTimeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SendingTimeField]
  }

  def decode(a: Any) : Option[SendingTimeField] = a match {
    case v: String => Some(SendingTimeField(v))
    case v: LocalDateTime => Some(SendingTimeField(v))
    case v: SendingTimeField => Some(v)
    case _ => scala.Option.empty[SendingTimeField]
  } 
}
