package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldUtcTimeStamp
import java.time.LocalDateTime
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20180821
  */
case class HopSendingTimeField(override val value: LocalDateTime) extends SfFieldUtcTimeStamp(629, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(629)HopSendingTime=(").append(value).append(")")
}

object HopSendingTimeField {
  val TagId = 629  
  def apply(value: String) = try {
    new HopSendingTimeField(LocalDateTime.from(SfFixDateFormats.utcTimeStamp.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new HopSendingTime("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[HopSendingTimeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[HopSendingTimeField]
  }

  def decode(a: Any) : Option[HopSendingTimeField] = a match {
    case v: String => Some(HopSendingTimeField(v))
    case v: LocalDateTime => Some(HopSendingTimeField(v))
    case v: HopSendingTimeField => Some(v)
    case _ => scala.Option.empty[HopSendingTimeField]
  } 
}
