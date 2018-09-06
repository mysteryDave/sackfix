package org.sackfix.field

import org.sackfix.common.validated.fields.SfFieldInt

/**
  * Generated by SackFix code generator on 20180902
  */
case class PosTransTypeField(override val value: Int) extends SfFieldInt(709, value) {
  override def toString = appendStringBuilder().toString
  override def appendStringBuilder(b:StringBuilder = new StringBuilder()) = b.append("(709)PosTransType=(").append(value).append(")").append(PosTransTypeField.fixDescriptionByValue.getOrElse(value,""))
}

object PosTransTypeField {
  val TagId = 709 
  val Exercise=1
  val DoNotExercise=2
  val PositionAdjustment=3
  val PositionChangeSubmissionMarginDisposition=4
  val Pledge=5
  val LargeTraderSubmission=6
  lazy val fixDescriptionByValue = Map(1->"EXERCISE",2->"DO_NOT_EXERCISE",
    3->"POSITION_ADJUSTMENT",4->"POSITION_CHANGE_SUBMISSION_MARGIN_DISPOSITION",5->"PLEDGE",
    6->"LARGE_TRADER_SUBMISSION")
 
  def apply(value: String) = try {
    new PosTransTypeField(value.toInt)
  } catch {
    case ex: Exception => throw new IllegalArgumentException("new PosTransType("+value.toString+") failed with exception", ex)
  } 
  def decode(a: Option[Any]) : Option[PosTransTypeField] = a match {
    case Some(v) => decode(v)
    case _ =>  scala.Option.empty[PosTransTypeField]
  }

  def decode(a: Any) : Option[PosTransTypeField] = a match {
    case v: String => Some(PosTransTypeField(v))
    case v: Int => Some(PosTransTypeField(v))
    case v: PosTransTypeField => Some(v)
    case _ => scala.Option.empty[PosTransTypeField]
  } 
}
