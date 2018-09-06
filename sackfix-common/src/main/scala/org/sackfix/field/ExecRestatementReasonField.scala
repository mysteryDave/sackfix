package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180902
  */
case class ExecRestatementReasonField(override val value: Int) extends SfFieldInt(378, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(378)ExecRestatementReason=(").append(value).append(")").append(ExecRestatementReasonField.fixDescriptionByValue.getOrElse(value,""))
}

object ExecRestatementReasonField {
  val TagId = 378 
  val GtCorporateAction=0
  val GtRenewalRestatement=1
  val WarehouseRecap=10
  val VerbalChange=2
  val RepricingOfOrder=3
  val BrokerOption=4
  val PartialDeclineOfOrderqty=5
  val CancelOnTradingHalt=6
  val CancelOnSystemFailure=7
  val MarketOption=8
  val CanceledNotBest=9
  val Other=99
  val PegRefresh=11
  lazy val fixDescriptionByValue = Map(0->"GT_CORPORATE_ACTION",1->"GT_RENEWAL_RESTATEMENT",
    10->"WAREHOUSE_RECAP",2->"VERBAL_CHANGE",3->"REPRICING_OF_ORDER",
    4->"BROKER_OPTION",5->"PARTIAL_DECLINE_OF_ORDERQTY",6->"CANCEL_ON_TRADING_HALT",
    7->"CANCEL_ON_SYSTEM_FAILURE",8->"MARKET_OPTION",9->"CANCELED_NOT_BEST",
    99->"OTHER",11->"PEG_REFRESH")
 
  def apply(value: String) = try {
    new ExecRestatementReasonField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new ExecRestatementReason("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[ExecRestatementReasonField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ExecRestatementReasonField]
  }

  def decode(a: Any) : Option[ExecRestatementReasonField] = a match {
    case v: String => Some(ExecRestatementReasonField(v))
    case v: Int => Some(ExecRestatementReasonField(v))
    case v: ExecRestatementReasonField => Some(v)
    case _ => scala.Option.empty[ExecRestatementReasonField]
  } 
}
