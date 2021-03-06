package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldUtcTimeStamp
import java.time.LocalDateTime
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20180902
  */
case class TradSesPreCloseTimeField(override val value: LocalDateTime) extends SfFieldUtcTimeStamp(343, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(343)TradSesPreCloseTime=(").append(value).append(")")
}

object TradSesPreCloseTimeField {
  val TagId = 343  
  def apply(value: String) = try {
    new TradSesPreCloseTimeField(LocalDateTime.from(SfFixDateFormats.utcTimeStamp.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new TradSesPreCloseTime("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[TradSesPreCloseTimeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[TradSesPreCloseTimeField]
  }

  def decode(a: Any) : Option[TradSesPreCloseTimeField] = a match {
    case v: String => Some(TradSesPreCloseTimeField(v))
    case v: LocalDateTime => Some(TradSesPreCloseTimeField(v))
    case v: TradSesPreCloseTimeField => Some(v)
    case _ => scala.Option.empty[TradSesPreCloseTimeField]
  } 
}
