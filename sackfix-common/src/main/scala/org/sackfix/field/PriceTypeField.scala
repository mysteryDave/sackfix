package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180821
  */
case class PriceTypeField(override val value: Int) extends SfFieldInt(423, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(423)PriceType=(").append(value).append(")").append(PriceTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object PriceTypeField {
  val TagId = 423 
  val Percentage=1
  val FixedCabinetTradePrice=10
  val VariableCabinetTradePrice=11
  val PerUnit=2
  val FixedAmount=3
  val Discount=4
  val Premium=5
  val Spread=6
  val TedPrice=7
  val TedYield=8
  val Yield=9
  val ProductTicksInHalfs=13
  val ProductTicksInFourths=14
  val ProductTicksInEights=15
  val ProductTicksInSixteenths=16
  val ProductTicksInThirtySeconds=17
  val ProductTicksInSixtyForths=18
  val ProductTicksInOneTwentyEights=19
  lazy val fixDescriptionByValue = Map(1->"PERCENTAGE",10->"FIXED_CABINET_TRADE_PRICE",
    11->"VARIABLE_CABINET_TRADE_PRICE",2->"PER_UNIT",3->"FIXED_AMOUNT",
    4->"DISCOUNT",5->"PREMIUM",6->"SPREAD",
    7->"TED_PRICE",8->"TED_YIELD",9->"YIELD",
    13->"PRODUCT_TICKS_IN_HALFS",14->"PRODUCT_TICKS_IN_FOURTHS",15->"PRODUCT_TICKS_IN_EIGHTS",
    16->"PRODUCT_TICKS_IN_SIXTEENTHS",17->"PRODUCT_TICKS_IN_THIRTY_SECONDS",18->"PRODUCT_TICKS_IN_SIXTY_FORTHS",
    19->"PRODUCT_TICKS_IN_ONE_TWENTY_EIGHTS")
 
  def apply(value: String) = try {
    new PriceTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new PriceType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[PriceTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[PriceTypeField]
  }

  def decode(a: Any) : Option[PriceTypeField] = a match {
    case v: String => Some(PriceTypeField(v))
    case v: Int => Some(PriceTypeField(v))
    case v: PriceTypeField => Some(v)
    case _ => scala.Option.empty[PriceTypeField]
  } 
}
