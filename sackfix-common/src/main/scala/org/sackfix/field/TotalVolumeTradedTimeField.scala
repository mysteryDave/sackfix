package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldUtcTimeOnly
import java.time.LocalTime
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20180902
  */
case class TotalVolumeTradedTimeField(override val value: LocalTime) extends SfFieldUtcTimeOnly(450, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(450)TotalVolumeTradedTime=(").append(value).append(")")
}

object TotalVolumeTradedTimeField {
  val TagId = 450  
  def apply(value: String) = try {
    new TotalVolumeTradedTimeField(LocalTime.from(SfFixDateFormats.utcTimeOnly.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new TotalVolumeTradedTime("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[TotalVolumeTradedTimeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[TotalVolumeTradedTimeField]
  }

  def decode(a: Any) : Option[TotalVolumeTradedTimeField] = a match {
    case v: String => Some(TotalVolumeTradedTimeField(v))
    case v: LocalTime => Some(TotalVolumeTradedTimeField(v))
    case v: TotalVolumeTradedTimeField => Some(v)
    case _ => scala.Option.empty[TotalVolumeTradedTimeField]
  } 
}
