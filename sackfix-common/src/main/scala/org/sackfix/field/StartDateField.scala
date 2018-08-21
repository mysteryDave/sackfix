package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldLocalMktDate
import java.time.LocalDate
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20180821
  */
case class StartDateField(override val value: LocalDate) extends SfFieldLocalMktDate(916, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(916)StartDate=(").append(value).append(")")
}

object StartDateField {
  val TagId = 916  
  def apply(value: String) = try {
    new StartDateField(LocalDate.from(SfFixDateFormats.localMktDate.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new StartDate("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[StartDateField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[StartDateField]
  }

  def decode(a: Any) : Option[StartDateField] = a match {
    case v: String => Some(StartDateField(v))
    case v: LocalDate => Some(StartDateField(v))
    case v: StartDateField => Some(v)
    case _ => scala.Option.empty[StartDateField]
  } 
}
