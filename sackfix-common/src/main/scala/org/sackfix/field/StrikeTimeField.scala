package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldUtcTimeStamp
import java.time.LocalDateTime
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20180902
  */
case class StrikeTimeField(override val value: LocalDateTime) extends SfFieldUtcTimeStamp(443, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(443)StrikeTime=(").append(value).append(")")
}

object StrikeTimeField {
  val TagId = 443  
  def apply(value: String) = try {
    new StrikeTimeField(LocalDateTime.from(SfFixDateFormats.utcTimeStamp.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new StrikeTime("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[StrikeTimeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[StrikeTimeField]
  }

  def decode(a: Any) : Option[StrikeTimeField] = a match {
    case v: String => Some(StrikeTimeField(v))
    case v: LocalDateTime => Some(StrikeTimeField(v))
    case v: StrikeTimeField => Some(v)
    case _ => scala.Option.empty[StrikeTimeField]
  } 
}
