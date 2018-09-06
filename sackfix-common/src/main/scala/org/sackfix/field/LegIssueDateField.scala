package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldLocalMktDate
import java.time.LocalDate
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20180902
  */
case class LegIssueDateField(override val value: LocalDate) extends SfFieldLocalMktDate(249, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(249)LegIssueDate=(").append(value).append(")")
}

object LegIssueDateField {
  val TagId = 249  
  def apply(value: String) = try {
    new LegIssueDateField(LocalDate.from(SfFixDateFormats.localMktDate.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new LegIssueDate("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[LegIssueDateField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[LegIssueDateField]
  }

  def decode(a: Any) : Option[LegIssueDateField] = a match {
    case v: String => Some(LegIssueDateField(v))
    case v: LocalDate => Some(LegIssueDateField(v))
    case v: LegIssueDateField => Some(v)
    case _ => scala.Option.empty[LegIssueDateField]
  } 
}
