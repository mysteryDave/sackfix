package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180902
  */
case class ContAmtTypeField(override val value: Int) extends SfFieldInt(519, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(519)ContAmtType=(").append(value).append(")").append(ContAmtTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object ContAmtTypeField {
  val TagId = 519 
  val CommissionAmount=1
  val CommissionPercent=2
  val InitialChargeAmount=3
  val InitialChargePercent=4
  val DiscountAmount=5
  val DiscountPercent=6
  val DilutionLevyAmount=7
  val DilutionLevyPercent=8
  val ExitChargeAmount=9
  val ExitChargePercent=10
  val FundBasedRenewalCommissionPercent=11
  val ProjectedFundValue=12
  val FundBasedRenewalCommissionAmount=13
  val FundBasedRenewalCommissionAmount2=14
  val NetSettlementAmount=15
  lazy val fixDescriptionByValue = Map(1->"COMMISSION_AMOUNT",2->"COMMISSION_PERCENT",
    3->"INITIAL_CHARGE_AMOUNT",4->"INITIAL_CHARGE_PERCENT",5->"DISCOUNT_AMOUNT",
    6->"DISCOUNT_PERCENT",7->"DILUTION_LEVY_AMOUNT",8->"DILUTION_LEVY_PERCENT",
    9->"EXIT_CHARGE_AMOUNT",10->"EXIT_CHARGE_PERCENT",11->"FUND_BASED_RENEWAL_COMMISSION_PERCENT",
    12->"PROJECTED_FUND_VALUE",13->"FUND_BASED_RENEWAL_COMMISSION_AMOUNT",14->"FUND_BASED_RENEWAL_COMMISSION_AMOUNT2",
    15->"NET_SETTLEMENT_AMOUNT")
 
  def apply(value: String) = try {
    new ContAmtTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new ContAmtType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[ContAmtTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ContAmtTypeField]
  }

  def decode(a: Any) : Option[ContAmtTypeField] = a match {
    case v: String => Some(ContAmtTypeField(v))
    case v: Int => Some(ContAmtTypeField(v))
    case v: ContAmtTypeField => Some(v)
    case _ => scala.Option.empty[ContAmtTypeField]
  } 
}
