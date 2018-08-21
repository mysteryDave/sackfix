package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldUtcDateOnly
import java.time.LocalDate
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20180821
  */
case class TotalVolumeTradedDateField(override val value: LocalDate) extends SfFieldUtcDateOnly(449, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(449)TotalVolumeTradedDate=(").append(value).append(")")
}

object TotalVolumeTradedDateField {
  val TagId = 449  
  def apply(value: String) = try {
    new TotalVolumeTradedDateField(LocalDate.from(SfFixDateFormats.utcDateOnly.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new TotalVolumeTradedDate("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[TotalVolumeTradedDateField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[TotalVolumeTradedDateField]
  }

  def decode(a: Any) : Option[TotalVolumeTradedDateField] = a match {
    case v: String => Some(TotalVolumeTradedDateField(v))
    case v: LocalDate => Some(TotalVolumeTradedDateField(v))
    case v: TotalVolumeTradedDateField => Some(v)
    case _ => scala.Option.empty[TotalVolumeTradedDateField]
  } 
}
