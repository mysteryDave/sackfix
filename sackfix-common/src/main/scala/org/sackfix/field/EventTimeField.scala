package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldUtcTimeStamp
import java.time.LocalDateTime
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20180902
  */
case class EventTimeField(override val value: LocalDateTime) extends SfFieldUtcTimeStamp(1145, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1145)EventTime=(").append(value).append(")")
}

object EventTimeField {
  val TagId = 1145  
  def apply(value: String) = try {
    new EventTimeField(LocalDateTime.from(SfFixDateFormats.utcTimeStamp.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new EventTime("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[EventTimeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[EventTimeField]
  }

  def decode(a: Any) : Option[EventTimeField] = a match {
    case v: String => Some(EventTimeField(v))
    case v: LocalDateTime => Some(EventTimeField(v))
    case v: EventTimeField => Some(v)
    case _ => scala.Option.empty[EventTimeField]
  } 
}
