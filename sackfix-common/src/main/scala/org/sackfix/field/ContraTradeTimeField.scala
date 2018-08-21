package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldUtcTimeStamp
import java.time.LocalDateTime
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20180821
  */
case class ContraTradeTimeField(override val value: LocalDateTime) extends SfFieldUtcTimeStamp(438, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(438)ContraTradeTime=(").append(value).append(")")
}

object ContraTradeTimeField {
  val TagId = 438  
  def apply(value: String) = try {
    new ContraTradeTimeField(LocalDateTime.from(SfFixDateFormats.utcTimeStamp.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new ContraTradeTime("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[ContraTradeTimeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ContraTradeTimeField]
  }

  def decode(a: Any) : Option[ContraTradeTimeField] = a match {
    case v: String => Some(ContraTradeTimeField(v))
    case v: LocalDateTime => Some(ContraTradeTimeField(v))
    case v: ContraTradeTimeField => Some(v)
    case _ => scala.Option.empty[ContraTradeTimeField]
  } 
}
