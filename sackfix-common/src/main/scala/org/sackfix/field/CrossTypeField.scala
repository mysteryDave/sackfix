package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180902
  */
case class CrossTypeField(override val value: Int) extends SfFieldInt(549, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(549)CrossType=(").append(value).append(")").append(CrossTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object CrossTypeField {
  val TagId = 549 
  val CrossTradeWhichIsExecutedCompletelyOrNot=1
  val CrossTradeWhichIsExecutedPartiallyAndTheRestIsCancelled=2
  val CrossTradeWhichIsPartiallyExecutedWithTheUnfilledPortionsRemainingActive=3
  val CrossTradeIsExecutedWithExistingOrdersWithTheSamePrice=4
  lazy val fixDescriptionByValue = Map(1->"CROSS_TRADE_WHICH_IS_EXECUTED_COMPLETELY_OR_NOT",2->"CROSS_TRADE_WHICH_IS_EXECUTED_PARTIALLY_AND_THE_REST_IS_CANCELLED",
    3->"CROSS_TRADE_WHICH_IS_PARTIALLY_EXECUTED_WITH_THE_UNFILLED_PORTIONS_REMAINING_ACTIVE",4->"CROSS_TRADE_IS_EXECUTED_WITH_EXISTING_ORDERS_WITH_THE_SAME_PRICE")
 
  def apply(value: String) = try {
    new CrossTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new CrossType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[CrossTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[CrossTypeField]
  }

  def decode(a: Any) : Option[CrossTypeField] = a match {
    case v: String => Some(CrossTypeField(v))
    case v: Int => Some(CrossTypeField(v))
    case v: CrossTypeField => Some(v)
    case _ => scala.Option.empty[CrossTypeField]
  } 
}
