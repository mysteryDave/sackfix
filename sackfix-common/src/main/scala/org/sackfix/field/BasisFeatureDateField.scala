package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldLocalMktDate
import java.time.LocalDate
import org.sackfix.common.validated.fields.SfFixDateFormats

/**
  * Generated by SackFix code generator on 20180902
  */
case class BasisFeatureDateField(override val value: LocalDate) extends SfFieldLocalMktDate(259, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(259)BasisFeatureDate=(").append(value).append(")")
}

object BasisFeatureDateField {
  val TagId = 259  
  def apply(value: String) = try {
    new BasisFeatureDateField(LocalDate.from(SfFixDateFormats.localMktDate.parse(value)))
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new BasisFeatureDate("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[BasisFeatureDateField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[BasisFeatureDateField]
  }

  def decode(a: Any) : Option[BasisFeatureDateField] = a match {
    case v: String => Some(BasisFeatureDateField(v))
    case v: LocalDate => Some(BasisFeatureDateField(v))
    case v: BasisFeatureDateField => Some(v)
    case _ => scala.Option.empty[BasisFeatureDateField]
  } 
}
