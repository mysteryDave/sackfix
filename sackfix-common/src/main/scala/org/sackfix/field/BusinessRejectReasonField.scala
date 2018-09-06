package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180902
  */
case class BusinessRejectReasonField(override val value: Int) extends SfFieldInt(380, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(380)BusinessRejectReason=(").append(value).append(")").append(BusinessRejectReasonField.fixDescriptionByValue.getOrElse(value,""))
}

object BusinessRejectReasonField {
  val TagId = 380 
  val Other=0
  val UnkownId=1
  val UnknownSecurity=2
  val UnsupportedMessageType=3
  val ApplicationNotAvailable=4
  val ConditionallyRequiredFieldMissing=5
  val NotAuthorized=6
  val DelivertoFirmNotAvailableAtThisTime=7
  val InvalidPriceIncrement=18
  lazy val fixDescriptionByValue = Map(0->"OTHER",1->"UNKOWN_ID",
    2->"UNKNOWN_SECURITY",3->"UNSUPPORTED_MESSAGE_TYPE",4->"APPLICATION_NOT_AVAILABLE",
    5->"CONDITIONALLY_REQUIRED_FIELD_MISSING",6->"NOT_AUTHORIZED",7->"DELIVERTO_FIRM_NOT_AVAILABLE_AT_THIS_TIME",
    18->"INVALID_PRICE_INCREMENT")
 
  def apply(value: String) = try {
    new BusinessRejectReasonField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new BusinessRejectReason("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[BusinessRejectReasonField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[BusinessRejectReasonField]
  }

  def decode(a: Any) : Option[BusinessRejectReasonField] = a match {
    case v: String => Some(BusinessRejectReasonField(v))
    case v: Int => Some(BusinessRejectReasonField(v))
    case v: BusinessRejectReasonField => Some(v)
    case _ => scala.Option.empty[BusinessRejectReasonField]
  } 
}
