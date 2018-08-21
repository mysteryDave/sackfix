package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180821
  */
case class TaxAdvantageTypeField(override val value: Int) extends SfFieldInt(495, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(495)TaxAdvantageType=(").append(value).append(")").append(TaxAdvantageTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object TaxAdvantageTypeField {
  val TagId = 495 
  val None=0
  val MaxiIsa=1
  val Tessa=2
  val MiniCashIsa=3
  val MiniStocksAndSharesIsa=4
  val MiniInsuranceIsa=5
  val CurrentYearPayment=6
  val PriorYearPayment=7
  val AssetTransfer=8
  val EmployeePriorYear=9
  val Employee=10
  val Employer=11
  val Employer2=12
  val NonFundPrototypeIra=13
  val NonFundQualifiedPlan=14
  val DefinedContributionPlan=15
  val IndividualRetirementAccount=16
  val IndividualRetirementAccount2=17
  val Keogh=18
  val ProfitSharingPlan=19
  val _401K=20
  val SelfDirectedIra=21
  val _403B=22
  val _457=23
  val RothIra=24
  val RothIra2=25
  val RothConversionIra=26
  val RothConversionIra2=27
  val EducationIra=28
  val EducationIra2=29
  val Other=999
  lazy val fixDescriptionByValue = Map(0->"NONE",1->"MAXI_ISA",
    2->"TESSA",3->"MINI_CASH_ISA",4->"MINI_STOCKS_AND_SHARES_ISA",
    5->"MINI_INSURANCE_ISA",6->"CURRENT_YEAR_PAYMENT",7->"PRIOR_YEAR_PAYMENT",
    8->"ASSET_TRANSFER",9->"EMPLOYEE_PRIOR_YEAR",10->"EMPLOYEE",
    11->"EMPLOYER",12->"EMPLOYER2",13->"NON_FUND_PROTOTYPE_IRA",
    14->"NON_FUND_QUALIFIED_PLAN",15->"DEFINED_CONTRIBUTION_PLAN",16->"INDIVIDUAL_RETIREMENT_ACCOUNT",
    17->"INDIVIDUAL_RETIREMENT_ACCOUNT2",18->"KEOGH",19->"PROFIT_SHARING_PLAN",
    20->"_401_K",21->"SELF_DIRECTED_IRA",22->"_403_B",
    23->"_457",24->"ROTH_IRA",25->"ROTH_IRA2",
    26->"ROTH_CONVERSION_IRA",27->"ROTH_CONVERSION_IRA2",28->"EDUCATION_IRA",
    29->"EDUCATION_IRA2",999->"OTHER")
 
  def apply(value: String) = try {
    new TaxAdvantageTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new TaxAdvantageType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[TaxAdvantageTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[TaxAdvantageTypeField]
  }

  def decode(a: Any) : Option[TaxAdvantageTypeField] = a match {
    case v: String => Some(TaxAdvantageTypeField(v))
    case v: Int => Some(TaxAdvantageTypeField(v))
    case v: TaxAdvantageTypeField => Some(v)
    case _ => scala.Option.empty[TaxAdvantageTypeField]
  } 
}
