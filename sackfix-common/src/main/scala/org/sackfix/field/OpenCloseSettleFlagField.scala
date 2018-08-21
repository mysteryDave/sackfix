package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180821
  */
case class OpenCloseSettleFlagField(override val value: String) extends SfFieldString(286, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(286)OpenCloseSettleFlag=(").append(value).append(")").append(OpenCloseSettleFlagField.fixDescriptionByValue.getOrElse(value,""))
}

object OpenCloseSettleFlagField {
  val TagId = 286 
  val DailyOpen="0"
  val SessionOpen="1"
  val DeliverySettlementPrice="2"
  val ExpectedPrice="3"
  val PriceFromPreviousBusinessDay="4"
  lazy val fixDescriptionByValue = Map("0"->"DAILY_OPEN","1"->"SESSION_OPEN",
    "2"->"DELIVERY_SETTLEMENT_PRICE","3"->"EXPECTED_PRICE","4"->"PRICE_FROM_PREVIOUS_BUSINESS_DAY")
 
  def decode(a: Option[Any]) : Option[OpenCloseSettleFlagField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[OpenCloseSettleFlagField]
  }

  def decode(a: Any) : Option[OpenCloseSettleFlagField] = a match {
    case v: String => Some(OpenCloseSettleFlagField(v))
    case v: OpenCloseSettleFlagField => Some(v)
    case _ => scala.Option.empty[OpenCloseSettleFlagField]
  } 
}
