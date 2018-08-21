package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180821
  */
case class TradeReportTypeField(override val value: Int) extends SfFieldInt(856, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(856)TradeReportType=(").append(value).append(")").append(TradeReportTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object TradeReportTypeField {
  val TagId = 856 
  val Submit=0
  val Alleged=1
  val Accept=2
  val Decline=3
  val Addendum=4
  val NoWas=5
  val TradeReportCancel=6
  val LockedInTradeBreak=7
  val Defaulted=8
  val InvalidCmta=9
  val Pended=10
  val AllegedNew=11
  val AllegedAddendum=12
  val AllegedNoWas=13
  val AllegedTradeReportCancel=14
  val Alleged2=15
  lazy val fixDescriptionByValue = Map(0->"SUBMIT",1->"ALLEGED",
    2->"ACCEPT",3->"DECLINE",4->"ADDENDUM",
    5->"NO_WAS",6->"TRADE_REPORT_CANCEL",7->"LOCKED_IN_TRADE_BREAK",
    8->"DEFAULTED",9->"INVALID_CMTA",10->"PENDED",
    11->"ALLEGED_NEW",12->"ALLEGED_ADDENDUM",13->"ALLEGED_NO_WAS",
    14->"ALLEGED_TRADE_REPORT_CANCEL",15->"ALLEGED2")
 
  def apply(value: String) = try {
    new TradeReportTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new TradeReportType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[TradeReportTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[TradeReportTypeField]
  }

  def decode(a: Any) : Option[TradeReportTypeField] = a match {
    case v: String => Some(TradeReportTypeField(v))
    case v: Int => Some(TradeReportTypeField(v))
    case v: TradeReportTypeField => Some(v)
    case _ => scala.Option.empty[TradeReportTypeField]
  } 
}
