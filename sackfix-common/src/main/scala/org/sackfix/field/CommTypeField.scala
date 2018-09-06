package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldString

/**
  * Generated by SackFix code generator on 20180902
  */
case class CommTypeField(override val value: String) extends SfFieldString(13, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(13)CommType=(").append(value).append(")").append(CommTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object CommTypeField {
  val TagId = 13 
  val PerUnit="1"
  val Percentage="2"
  val Absolute="3"
  val PercentageWaivedCashDiscount="4"
  val PercentageWaivedEnhancedUnits="5"
  val PointsPerBondOrOrContract="6"
  lazy val fixDescriptionByValue = Map("1"->"PER_UNIT","2"->"PERCENTAGE",
    "3"->"ABSOLUTE","4"->"PERCENTAGE_WAIVED_CASH_DISCOUNT","5"->"PERCENTAGE_WAIVED_ENHANCED_UNITS",
    "6"->"POINTS_PER_BOND_OR_OR_CONTRACT")
 
  def decode(a: Option[Any]) : Option[CommTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[CommTypeField]
  }

  def decode(a: Any) : Option[CommTypeField] = a match {
    case v: String => Some(CommTypeField(v))
    case v: Char => Some(CommTypeField(v.toString))
    case v: CommTypeField => Some(v)
    case _ => scala.Option.empty[CommTypeField]
  } 
}
