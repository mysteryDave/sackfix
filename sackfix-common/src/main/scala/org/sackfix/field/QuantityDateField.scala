package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldLocalMktDate
import java.time.LocalDate
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20180821
  */
case class QuantityDateField(override val value: LocalDate) extends SfFieldLocalMktDate(976, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(976)QuantityDate=(").append(value).append(")")
}

object QuantityDateField {
  val TagId = 976  
  def apply(value: String) = try {
    new QuantityDateField(LocalDate.from(SfFixDateFormats.localMktDate.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new QuantityDate("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[QuantityDateField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[QuantityDateField]
  }

  def decode(a: Any) : Option[QuantityDateField] = a match {
    case v: String => Some(QuantityDateField(v))
    case v: LocalDate => Some(QuantityDateField(v))
    case v: QuantityDateField => Some(v)
    case _ => scala.Option.empty[QuantityDateField]
  } 
}
