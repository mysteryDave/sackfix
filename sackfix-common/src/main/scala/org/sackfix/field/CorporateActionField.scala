package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180821
  */
case class CorporateActionField(override val value: String) extends SfFieldString(292, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(292)CorporateAction=(").append(value).append(")").append(CorporateActionField.fixDescriptionByValue.getOrElse(value,""))
}

object CorporateActionField {
  val TagId = 292 
  val ExDividend="A"
  val ExDistribution="B"
  val ExRights="C"
  val New="D"
  val ExInterest="E"
  val CashDividend="F"
  val StockDividend="G"
  val NonIntegerStockSplit="H"
  val ReverseStockSplit="I"
  val StandardIntegerStockSplit="J"
  val PositionConsolidation="K"
  val LiquidationReorganization="L"
  val MergerReorganization="M"
  val RightsOffering="N"
  val ShareholderMeeting="O"
  val Spinoff="P"
  val TenderOffer="Q"
  val Warrant="R"
  val SpecialAction="S"
  val SymbolConversion="T"
  val Cusip="U"
  val LeapRollover="V"
  lazy val fixDescriptionByValue = Map("A"->"EX_DIVIDEND","B"->"EX_DISTRIBUTION",
    "C"->"EX_RIGHTS","D"->"NEW","E"->"EX_INTEREST",
    "F"->"CASH_DIVIDEND","G"->"STOCK_DIVIDEND","H"->"NON_INTEGER_STOCK_SPLIT",
    "I"->"REVERSE_STOCK_SPLIT","J"->"STANDARD_INTEGER_STOCK_SPLIT","K"->"POSITION_CONSOLIDATION",
    "L"->"LIQUIDATION_REORGANIZATION","M"->"MERGER_REORGANIZATION","N"->"RIGHTS_OFFERING",
    "O"->"SHAREHOLDER_MEETING","P"->"SPINOFF","Q"->"TENDER_OFFER",
    "R"->"WARRANT","S"->"SPECIAL_ACTION","T"->"SYMBOL_CONVERSION",
    "U"->"CUSIP","V"->"LEAP_ROLLOVER")
 
  def decode(a: Option[Any]) : Option[CorporateActionField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[CorporateActionField]
  }

  def decode(a: Any) : Option[CorporateActionField] = a match {
    case v: String => Some(CorporateActionField(v))
    case v: CorporateActionField => Some(v)
    case _ => scala.Option.empty[CorporateActionField]
  } 
}
