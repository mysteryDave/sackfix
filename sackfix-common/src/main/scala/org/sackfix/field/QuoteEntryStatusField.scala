package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180902
  */
case class QuoteEntryStatusField(override val value: Int) extends SfFieldInt(1167, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1167)QuoteEntryStatus=(").append(value).append(")").append(QuoteEntryStatusField.fixDescriptionByValue.getOrElse(value,""))
}

object QuoteEntryStatusField {
  val TagId = 1167 
  val Accepted=0
  val Rejected=5
  val RemovedFromMarket=6
  val Expired=7
  val LockedMarketWarning=12
  val CrossMarketWarning=13
  val CanceledDueToLockMarket=14
  val CanceledDueToCrossMarket=15
  val Active=16
  lazy val fixDescriptionByValue = Map(0->"ACCEPTED",5->"REJECTED",
    6->"REMOVED_FROM_MARKET",7->"EXPIRED",12->"LOCKED_MARKET_WARNING",
    13->"CROSS_MARKET_WARNING",14->"CANCELED_DUE_TO_LOCK_MARKET",15->"CANCELED_DUE_TO_CROSS_MARKET",
    16->"ACTIVE")
 
  def apply(value: String) = try {
    new QuoteEntryStatusField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new QuoteEntryStatus("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[QuoteEntryStatusField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[QuoteEntryStatusField]
  }

  def decode(a: Any) : Option[QuoteEntryStatusField] = a match {
    case v: String => Some(QuoteEntryStatusField(v))
    case v: Int => Some(QuoteEntryStatusField(v))
    case v: QuoteEntryStatusField => Some(v)
    case _ => scala.Option.empty[QuoteEntryStatusField]
  } 
}
