package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180902
  */
case class CollInquiryQualifierField(override val value: Int) extends SfFieldInt(896, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(896)CollInquiryQualifier=(").append(value).append(")").append(CollInquiryQualifierField.fixDescriptionByValue.getOrElse(value,""))
}

object CollInquiryQualifierField {
  val TagId = 896 
  val Tradedate=0
  val GcInstrument=1
  val Collateralinstrument=2
  val SubstitutionEligible=3
  val NotAssigned=4
  val PartiallyAssigned=5
  val FullyAssigned=6
  val OutstandingTrades=7
  lazy val fixDescriptionByValue = Map(0->"TRADEDATE",1->"GC_INSTRUMENT",
    2->"COLLATERALINSTRUMENT",3->"SUBSTITUTION_ELIGIBLE",4->"NOT_ASSIGNED",
    5->"PARTIALLY_ASSIGNED",6->"FULLY_ASSIGNED",7->"OUTSTANDING_TRADES")
 
  def apply(value: String) = try {
    new CollInquiryQualifierField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new CollInquiryQualifier("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[CollInquiryQualifierField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[CollInquiryQualifierField]
  }

  def decode(a: Any) : Option[CollInquiryQualifierField] = a match {
    case v: String => Some(CollInquiryQualifierField(v))
    case v: Int => Some(CollInquiryQualifierField(v))
    case v: CollInquiryQualifierField => Some(v)
    case _ => scala.Option.empty[CollInquiryQualifierField]
  } 
}
