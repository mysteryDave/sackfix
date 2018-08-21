package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldLocalMktDate
import java.time.LocalDate
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20180821
  */
case class DateOfBirthField(override val value: LocalDate) extends SfFieldLocalMktDate(486, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(486)DateOfBirth=(").append(value).append(")")
}

object DateOfBirthField {
  val TagId = 486  
  def apply(value: String) = try {
    new DateOfBirthField(LocalDate.from(SfFixDateFormats.localMktDate.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new DateOfBirth("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[DateOfBirthField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[DateOfBirthField]
  }

  def decode(a: Any) : Option[DateOfBirthField] = a match {
    case v: String => Some(DateOfBirthField(v))
    case v: LocalDate => Some(DateOfBirthField(v))
    case v: DateOfBirthField => Some(v)
    case _ => scala.Option.empty[DateOfBirthField]
  } 
}
