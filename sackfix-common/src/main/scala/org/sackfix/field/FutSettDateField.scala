package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldLocalMktDate
import java.time.LocalDate
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20180902
  */
case class FutSettDateField(override val value: LocalDate) extends SfFieldLocalMktDate(64, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(64)FutSettDate=(").append(value).append(")")
}

object FutSettDateField {
  val TagId = 64  
  def apply(value: String) = try {
    new FutSettDateField(LocalDate.from(SfFixDateFormats.localMktDate.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new FutSettDate("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[FutSettDateField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[FutSettDateField]
  }

  def decode(a: Any) : Option[FutSettDateField] = a match {
    case v: String => Some(FutSettDateField(v))
    case v: LocalDate => Some(FutSettDateField(v))
    case v: FutSettDateField => Some(v)
    case _ => scala.Option.empty[FutSettDateField]
  } 
}
