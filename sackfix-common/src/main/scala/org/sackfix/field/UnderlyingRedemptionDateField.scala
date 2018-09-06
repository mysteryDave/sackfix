package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldLocalMktDate
import java.time.LocalDate
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20180902
  */
case class UnderlyingRedemptionDateField(override val value: LocalDate) extends SfFieldLocalMktDate(247, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(247)UnderlyingRedemptionDate=(").append(value).append(")")
}

object UnderlyingRedemptionDateField {
  val TagId = 247  
  def apply(value: String) = try {
    new UnderlyingRedemptionDateField(LocalDate.from(SfFixDateFormats.localMktDate.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new UnderlyingRedemptionDate("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[UnderlyingRedemptionDateField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[UnderlyingRedemptionDateField]
  }

  def decode(a: Any) : Option[UnderlyingRedemptionDateField] = a match {
    case v: String => Some(UnderlyingRedemptionDateField(v))
    case v: LocalDate => Some(UnderlyingRedemptionDateField(v))
    case v: UnderlyingRedemptionDateField => Some(v)
    case _ => scala.Option.empty[UnderlyingRedemptionDateField]
  } 
}
