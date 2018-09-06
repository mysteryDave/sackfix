package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180902
  */
case class SecurityListTypeField(override val value: Int) extends SfFieldInt(1470, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1470)SecurityListType=(").append(value).append(")").append(SecurityListTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object SecurityListTypeField {
  val TagId = 1470 
  val IndustryClassification=1
  val TradingList=2
  val MarketMarketSegmentList=3
  val NewspaperList=4
  lazy val fixDescriptionByValue = Map(1->"INDUSTRY_CLASSIFICATION",2->"TRADING_LIST",
    3->"MARKET_MARKET_SEGMENT_LIST",4->"NEWSPAPER_LIST")
 
  def apply(value: String) = try {
    new SecurityListTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new SecurityListType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[SecurityListTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[SecurityListTypeField]
  }

  def decode(a: Any) : Option[SecurityListTypeField] = a match {
    case v: String => Some(SecurityListTypeField(v))
    case v: Int => Some(SecurityListTypeField(v))
    case v: SecurityListTypeField => Some(v)
    case _ => scala.Option.empty[SecurityListTypeField]
  } 
}
