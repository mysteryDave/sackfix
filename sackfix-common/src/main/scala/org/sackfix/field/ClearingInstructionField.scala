package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180821
  */
case class ClearingInstructionField(override val value: Int) extends SfFieldInt(577, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(577)ClearingInstruction=(").append(value).append(")").append(ClearingInstructionField.fixDescriptionByValue.getOrElse(value,""))
}

object ClearingInstructionField {
  val TagId = 577 
  val ProcessNormally=0
  val ExcludeFromAllNetting=1
  val BilateralNettingOnly=2
  val ExClearing=3
  val SpecialTrade=4
  val MultilateralNetting=5
  val ClearAgainstCentralCounterparty=6
  val ExcludeFromCentralCounterparty=7
  val ManualMode=8
  val AutomaticPostingMode=9
  val AutomaticGiveUpMode=10
  val QualifiedServiceRepresentativeQsr=11
  val CustomerTrade=12
  val SelfClearing=13
  lazy val fixDescriptionByValue = Map(0->"PROCESS_NORMALLY",1->"EXCLUDE_FROM_ALL_NETTING",
    2->"BILATERAL_NETTING_ONLY",3->"EX_CLEARING",4->"SPECIAL_TRADE",
    5->"MULTILATERAL_NETTING",6->"CLEAR_AGAINST_CENTRAL_COUNTERPARTY",7->"EXCLUDE_FROM_CENTRAL_COUNTERPARTY",
    8->"MANUAL_MODE",9->"AUTOMATIC_POSTING_MODE",10->"AUTOMATIC_GIVE_UP_MODE",
    11->"QUALIFIED_SERVICE_REPRESENTATIVE_QSR",12->"CUSTOMER_TRADE",13->"SELF_CLEARING")
 
  def apply(value: String) = try {
    new ClearingInstructionField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new ClearingInstruction("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[ClearingInstructionField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[ClearingInstructionField]
  }

  def decode(a: Any) : Option[ClearingInstructionField] = a match {
    case v: String => Some(ClearingInstructionField(v))
    case v: Int => Some(ClearingInstructionField(v))
    case v: ClearingInstructionField => Some(v)
    case _ => scala.Option.empty[ClearingInstructionField]
  } 
}
