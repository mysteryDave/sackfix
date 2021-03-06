package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldLocalMktDate
import java.time.LocalDate
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20180902
  */
case class SendingDateField(override val value: LocalDate) extends SfFieldLocalMktDate(51, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(51)SendingDate=(").append(value).append(")")
}

object SendingDateField {
  val TagId = 51  
  def apply(value: String) = try {
    new SendingDateField(LocalDate.from(SfFixDateFormats.localMktDate.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new SendingDate("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[SendingDateField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SendingDateField]
  }

  def decode(a: Any) : Option[SendingDateField] = a match {
    case v: String => Some(SendingDateField(v))
    case v: LocalDate => Some(SendingDateField(v))
    case v: SendingDateField => Some(v)
    case _ => scala.Option.empty[SendingDateField]
  } 
}
