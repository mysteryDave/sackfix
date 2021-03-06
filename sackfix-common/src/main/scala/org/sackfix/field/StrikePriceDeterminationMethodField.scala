package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180902
  */
case class StrikePriceDeterminationMethodField(override val value: Int) extends SfFieldInt(1478, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(1478)StrikePriceDeterminationMethod=(").append(value).append(")").append(StrikePriceDeterminationMethodField.fixDescriptionByValue.getOrElse(value,""))
}

object StrikePriceDeterminationMethodField {
  val TagId = 1478 
  val FixedStrike=1
  val StrikeSetAtExpirationToUnderlyingOrOtherValue=2
  val StrikeSetToAverageOfUnderlyingSettlementPriceAcrossTheLifeOfTheOption=3
  val StrikeSetToOptimalValue=4
  lazy val fixDescriptionByValue = Map(1->"FIXED_STRIKE",2->"STRIKE_SET_AT_EXPIRATION_TO_UNDERLYING_OR_OTHER_VALUE",
    3->"STRIKE_SET_TO_AVERAGE_OF_UNDERLYING_SETTLEMENT_PRICE_ACROSS_THE_LIFE_OF_THE_OPTION",4->"STRIKE_SET_TO_OPTIMAL_VALUE")
 
  def apply(value: String) = try {
    new StrikePriceDeterminationMethodField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new StrikePriceDeterminationMethod("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[StrikePriceDeterminationMethodField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[StrikePriceDeterminationMethodField]
  }

  def decode(a: Any) : Option[StrikePriceDeterminationMethodField] = a match {
    case v: String => Some(StrikePriceDeterminationMethodField(v))
    case v: Int => Some(StrikePriceDeterminationMethodField(v))
    case v: StrikePriceDeterminationMethodField => Some(v)
    case _ => scala.Option.empty[StrikePriceDeterminationMethodField]
  } 
}
