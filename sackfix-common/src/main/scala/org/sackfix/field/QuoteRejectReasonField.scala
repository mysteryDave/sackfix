package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180902
  */
case class QuoteRejectReasonField(override val value: Int) extends SfFieldInt(300, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(300)QuoteRejectReason=(").append(value).append(")").append(QuoteRejectReasonField.fixDescriptionByValue.getOrElse(value,""))
}

object QuoteRejectReasonField {
  val TagId = 300 
  val UnknownSymbol=1
  val ExchangeClosed=2
  val QuoteRequestExceedsLimit=3
  val TooLateToEnter=4
  val UnknownQuote=5
  val DuplicateQuote=6
  val InvalidBidAskSpread=7
  val InvalidPrice=8
  val NotAuthorizedToQuoteSecurity=9
  val Other=99
  lazy val fixDescriptionByValue = Map(1->"UNKNOWN_SYMBOL",2->"EXCHANGE_CLOSED",
    3->"QUOTE_REQUEST_EXCEEDS_LIMIT",4->"TOO_LATE_TO_ENTER",5->"UNKNOWN_QUOTE",
    6->"DUPLICATE_QUOTE",7->"INVALID_BID_ASK_SPREAD",8->"INVALID_PRICE",
    9->"NOT_AUTHORIZED_TO_QUOTE_SECURITY",99->"OTHER")
 
  def apply(value: String) = try {
    new QuoteRejectReasonField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new QuoteRejectReason("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[QuoteRejectReasonField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[QuoteRejectReasonField]
  }

  def decode(a: Any) : Option[QuoteRejectReasonField] = a match {
    case v: String => Some(QuoteRejectReasonField(v))
    case v: Int => Some(QuoteRejectReasonField(v))
    case v: QuoteRejectReasonField => Some(v)
    case _ => scala.Option.empty[QuoteRejectReasonField]
  } 
}
