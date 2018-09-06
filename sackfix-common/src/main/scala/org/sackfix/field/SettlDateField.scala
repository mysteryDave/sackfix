package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldLocalMktDate
import java.time.LocalDate
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20180902
  */
case class SettlDateField(override val value: LocalDate) extends SfFieldLocalMktDate(64, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(64)SettlDate=(").append(value).append(")")
}

object SettlDateField {
  val TagId = 64  
  def apply(value: String) = try {
    new SettlDateField(LocalDate.from(SfFixDateFormats.localMktDate.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new SettlDate("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[SettlDateField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SettlDateField]
  }

  def decode(a: Any) : Option[SettlDateField] = a match {
    case v: String => Some(SettlDateField(v))
    case v: LocalDate => Some(SettlDateField(v))
    case v: SettlDateField => Some(v)
    case _ => scala.Option.empty[SettlDateField]
  } 
}
