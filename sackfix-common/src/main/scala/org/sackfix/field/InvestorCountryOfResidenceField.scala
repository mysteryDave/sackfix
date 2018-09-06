package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class InvestorCountryOfResidenceField(override val value: String) extends SfFieldString(475, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(475)InvestorCountryOfResidence=(").append(value).append(")")
}

object InvestorCountryOfResidenceField {
  val TagId = 475  
  def decode(a: Option[Any]) : Option[InvestorCountryOfResidenceField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[InvestorCountryOfResidenceField]
  }

  def decode(a: Any) : Option[InvestorCountryOfResidenceField] = a match {
    case v: String => Some(InvestorCountryOfResidenceField(v))
    case v: InvestorCountryOfResidenceField => Some(v)
    case _ => scala.Option.empty[InvestorCountryOfResidenceField]
  } 
}
